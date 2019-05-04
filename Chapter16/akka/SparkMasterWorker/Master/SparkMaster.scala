/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 14:03
	* Project:Akka
	* FileName:SparkMaster.scala
	* Version 1.0
	*/
package akka.SparkMasterWorker.Master

import akka.SparkMasterWorker.Common._
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.collection.mutable
import scala.concurrent.duration._

class SparkMaster extends Actor {
	val workers = mutable.Map[String, workerInfo]()

	override def receive: Receive = {
		case "start" => {
			println("maser server is starting.....")
			// 检测超时worker机制
			self ! StartTimeOutWoeker
		}

		// 接收到worker注册信息
		case RegisterWorkerInfo(id, cpu, ram) => {
			if (!workers.contains(id)) {
				// 创建一个workerInfo对象
				val workerInfo = new workerInfo(id, cpu, ram)
				// 加入到workers中
				workers += ((id, workerInfo))
				// 回复一个消息，注册成功
				sender() ! RegisteredWorkerInfo
			}
		}
		case HeartBeat(id) => {
			// 更新对应的worker的心跳时间
			val workerInfo = workers(id)
			workerInfo.lastHeartBeat = System.currentTimeMillis()
			println("master更新了" + id + "的心跳时间....")
		}
		case StartTimeOutWoeker => {
			println("开始了定时检测worker心跳的任务")
			import context.dispatcher
			// 说明
			//  1、0 millis：不延时，立即执行定时器
			//  2、9000 millis ：表示每2秒执行一次
			//  3、self 表示发送给自己
			//  4、RemoveTimeOutWorker 发送的内容
			context.system.scheduler.schedule(0 millis, 9000 millis, self, RemoveTimeOutWorker)
		}
		// 对RemoveTimeOutWorker消息处理
		// 这里需要检测哪些worker心跳超时（now - LastHeartBeat > 6000），并从map中删除
		case RemoveTimeOutWorker => {
			// 首先将workers中所有的workerInfo
			val workerInfos = workers.values
			val nowTime = System.currentTimeMillis()
			// 先把超时的所有workerInfo，删除即可
			workerInfos.filter(workerInfo => (nowTime - workerInfo.lastHeartBeat) > 6000).foreach(workerInfo => workers.remove(workerInfo.id))
			println("当前有" + workers.size + "个worker存活的")
		}
	}
}

object SparkMaster {
	def main(args: Array[String]): Unit = {
		// 参数（Host,Port,SparkMasterActorName）
		if (args.length != 3) {
			println("请输入参数（Host,Port,sparkMasterName）")
			sys.exit()
		}
		val Host = args(0)
		val Port = args(1)
		val sparkMasterName = args(2)

		// 创建config对象，指定协议类型，监听的IP和端口
		val config = ConfigFactory.parseString(
			s"""
				 |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
				 |akka.remote.netty.tcp.hostname = ${Host}
				 |akka.remote.netty.tcp.port = ${Port}
		 """.stripMargin
		)
		// 先创建ActorSystem
		val sparkMasterSystem = ActorSystem("SparkMaster", config)
		// 创建SparkMaster -Actor
		val sparkMasterActorRef: ActorRef = sparkMasterSystem.actorOf(Props[SparkMaster], s"${sparkMasterName}")
		// 启动SparkMasterActorRef
		sparkMasterActorRef ! "start"
	}
}
