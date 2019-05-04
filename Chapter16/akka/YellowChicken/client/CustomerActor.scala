/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 21:12
	* Project:Akka
	* FileName:CustomerActor.scala
	* Version 1.0
	*/
package akka.YellowChicken.Client

import akka.YellowChicken.common.{ClientMessage, ServerMessage}
import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.io.StdIn

class CustomerActor(serverHost:String,serverPort:Int) extends Actor{
	// 定义一个YellowChickenServerRef
	var serverActorRef: ActorSelection = _

	// 在Actor中有一个方法PreStart方法，会在Actor运行前执行
	// 在Actor的开发中，通常将初始化的工作，放在preStart方法
	override def preStart(): Unit = {
		serverActorRef = context.actorSelection(s"akka.tcp://Server@${serverHost}:${serverPort}/user/YellowChickenServer")
		println(serverActorRef)
	}
	override def receive: Receive = {
		case "start" => println("start,客户端运行，可以咨询问题.....")
		case mes:String => {
			// 发给服务器
			serverActorRef ! ClientMessage(mes) // 使用ClientMessage case class apply
		}
		// 如果接收到服务器端的回复
		case ServerMessage(mes) => {
			println(s"收到小黄鸡客服（Server）：$mes")
		}
	}
}


// 主程序
object CustomerActor extends App {
	val (clienthost,clientport,serverHost,serverPort) = ("127.0.0.1",9990,"127.0.0.1",9999)
	val config = ConfigFactory.parseString(
		s"""
			 |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
			 |akka.remote.netty.tcp.hostname = $clienthost
			 |akka.remote.netty.tcp.port = $clientport
		 """.stripMargin
	)
	val clientActorSystem = ActorSystem("client",config)
	// 创建CustomerActor的实例和引用
	val customerActorRef: ActorRef = clientActorSystem.actorOf(Props(new CustomerActor(serverHost,serverPort)),"CustomerActor")

	// 启动CustomerRef
	customerActorRef ! "start"

	while (true) {
		println("请输入要咨询的问题")
		val mes = StdIn.readLine()
		customerActorRef ! mes
	}
}