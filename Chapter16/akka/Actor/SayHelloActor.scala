/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 16:02
	* Project:Akka
	* FileName:SayHelloActor.scala
	* Version 1.0
	*/
package akka.Actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

// 说明
//    1、SayHelloActor继承Actor后，就是一个Actor，核心方法Receive方法需要重写
class SayHelloActor extends Actor {
	//1、receive方法会被该Actor的MailBox（实现了Runnable接口）调用
	//2、当该Actor的MailBox接收到信息，就会调用receive
	//3、 type Receive = PartialFunction[Any, Unit]
	override def receive: Receive = { //偏函数
		case "hello" => println("收到hello，回应hello too:)")
		case "ok" => println("收到ok，回应ok too:)")
		case "exit" => {
			println("接收到exit指令，退出系统")
			context.stop(self) // 停止actorref
			context.system.terminate() // 退出actorsystem
		}
		case _ => println("匹配不到")
	}
}

object SayHelloActorDemo {
	//1、先创建一个ActorSystem，专门用于创建Actor
	private val actorFactory = ActorSystem("actorFactory")
	//2、创建一个Actor的同时，返回Actor的ActorRef
	/*
		说明
			1、Props[SayHelloActor]创建了一个SayHelloActor实例，使用反射机制
			2、sayHelloActor给actor取名
			3、sayHelloActorActorRef:ActorRef 就是Props[SayHelloActor]的ActorRef
			4、创建的sayHelloActorActor 实例被ActorSystem接管
	*/
	private val sayHelloActorActorRef: ActorRef = actorFactory.actorOf(Props[SayHelloActor], "sayHelloActor")

	def main(args: Array[String]): Unit = {
		// 给sayHelloActorActor发信息（邮箱）
		sayHelloActorActorRef ! "hello"
		sayHelloActorActorRef ! "ok"
		sayHelloActorActorRef ! "hello~"
		sayHelloActorActorRef ! "exit"
	}
}
