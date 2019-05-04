/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 19:43
	* Project:Akka
	* FileName:A_B_communication.scala
	* Version 1.0
	*/


package akka.Actors

import akka.actor.{ActorRef, ActorSystem, Props}

object A_B_communication extends App {
	//创建ActorSystem
	private val actorFactory = ActorSystem("actorFactory")
	// 先创建B_Actor引用/代理
	private val b_ActorRef: ActorRef = actorFactory.actorOf(Props[B_actor],"B_Actor")
	// 创建A_Actor引用/代理
	private val a_ActorRef: ActorRef = actorFactory.actorOf(Props(new A_actor(b_ActorRef)),"A_Actor")
	// A_Actor 出招
	a_ActorRef ! "start"

}
