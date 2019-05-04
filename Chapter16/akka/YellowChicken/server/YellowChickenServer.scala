/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 20:58
	* Project:Akka
	* FileName:YellowChickenServer.scala
	* Version 1.0
	*/
package akka.YellowChicken.Server

import akka.YellowChicken.common.{ClientMessage, ServerMessage}
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class YellowChickenServer extends Actor{
	override def receive: Receive = {
		case "start" => println("start 小黄鸡客服开始工作了.......")
		// 如果接ClientMessage
		case ClientMessage(mes) => {
			// 使用match匹配 -- case 匹配（精确/模糊）
			mes match {
				case "大数据学费" => sender() ! ServerMessage("35000RMB")
				case _ => sender() ! ServerMessage("你说的是什么，听不懂")
			}
		}
	}
}

object YellowChickenServer extends App {
	val host = "127.0.0.1"      // 服务端IP地址
	val port = 9999
	// 创建config对象，指定协议类型，监听的IP和端口
	val config = ConfigFactory.parseString(
		s"""
			 |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
			 |akka.remote.netty.tcp.hostname = $host
			 |akka.remote.netty.tcp.port = $port
		 """.stripMargin
	)
	// 创建ActorSystem
	val serverActorSystem = ActorSystem("Server",config)
	// 创建YellowChickenServer的Actor和返回ActorRef
	val yellowChickenServerRef: ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer],"YellowChickenServer")

	// 启动
	yellowChickenServerRef ! "start"

}
