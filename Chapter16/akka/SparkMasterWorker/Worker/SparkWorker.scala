/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 14:03
	* Project:Akka
	* FileName:SparkWorker.scala
	* Version 1.0
	*/
package akka.SparkMasterWorker.Worker

import java.util.UUID

import akka.SparkMasterWorker.Common.{HeartBeat, RegisterWorkerInfo, RegisteredWorkerInfo, SendHeartBeat}
import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.concurrent.duration._

class SparkWorker(masterHost: String, masterPort: Int, masterName: String) extends Actor {
	var sparkMasterPorxy: ActorSelection = _
	val id = UUID.randomUUID().toString

	override def preStart(): Unit = {
		// 初始化sparkMasterPorxy
		sparkMasterPorxy = context.actorSelection(s"akka.tcp://SparkMaster@${masterHost}:${masterPort}/user/${masterName}")
		println(sparkMasterPorxy)
	}

	override def receive: Receive = {
		case "start" => {
			println("sparkWorker is starting....")
			// 发出一个注册信息
			sparkMasterPorxy ! RegisterWorkerInfo(id, 16, 16 * 1024)
		}
		case RegisteredWorkerInfo => {
			println("workerId  = " + id + "注册成功")
			// 当注册成功后，定义一个定时器，每隔一定时间，发送SendHeartBeat给自己
			import context.dispatcher
			// 说明
			//  1、0 millis：不延时，立即执行定时器
			//  2、3000 millis ：表示每2秒执行一次
			//  3、self 表示发送给自己
			//  4、SendHeartBeat
			context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHeartBeat)
		}
		case SendHeartBeat => {
			println("worker = " + id + "给master发送心跳")
			sparkMasterPorxy ! HeartBeat(id)
		}
	}
}

object SparkWorker {
	def main(args: Array[String]): Unit = {

		if (args.length != 6) {
			println("请输入参数（workerHost,workerPort,workerName,masterHost,masterPort,masterName）")
			sys.exit()
		}


		val workerHost = args(0)
		val workerPort = args(1)
		val workerName = args(2)
		val masterHost = args(3)
		val masterPort = args(4)
		val masterName = args(5)
		val config = ConfigFactory.parseString(
			s"""
				 |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
				 |akka.remote.netty.tcp.hostname = ${workerHost}
				 |akka.remote.netty.tcp.port = ${workerPort}
		 """.stripMargin
		)
		val sparkWorkerSystem = ActorSystem("SparkWorker", config)
		// 创建SparkWork的Actor
		val sparkWorkerActorRef: ActorRef = sparkWorkerSystem.actorOf(Props(new SparkWorker(masterHost, masterPort.toInt,masterName)), s"${workerName}")
			// 启动 SparkWorker
			sparkWorkerActorRef !"start"
	}
}
