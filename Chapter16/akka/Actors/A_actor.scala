/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 19:42
	* Project:Akka
	* FileName:A_actor.scala
	* Version 1.0
	*/
package akka.Actors

import akka.actor.{Actor, ActorRef}

class A_actor(B_ActorRef:ActorRef) extends Actor {
	val b_ActorRef: ActorRef = B_ActorRef
	override def receive: Receive = {
		case "start" => {
			println("A_Actor出招了，start ok")
			self ! "我打"   // 发给自己
		}
		case "我打" => {
			// 给B_Actor发出一个消息，这里需要持有B_Actor的引用（B_ActorRef）
			println("A_Actor(黄飞鸿)：厉害，看我佛山无影脚")
			Thread.sleep(1000)
			b_ActorRef ! "我打"
		}
	}
}
