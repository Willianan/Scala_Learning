/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 19:42
	* Project:Akka
	* FileName:B_actor.scala
	* Version 1.0
	*/
package akka.Actors

import akka.actor.Actor

class B_actor extends Actor{
	override def receive: Receive = {
		case "我打" => {
			println("B_Actor(乔峰)：挺猛，看我降龙十八掌")
			Thread.sleep(1000)
			// 通过sender() 可以获取到发送消息的actor的Ref
			sender() ! "我打"
		}
	}
}
