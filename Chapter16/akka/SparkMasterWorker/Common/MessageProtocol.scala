/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 14:41
	* Project:Akka
	* FileName:MessageProtocol.scala
	* Version 1.0
	*/
package akka.SparkMasterWorker.Common

// worker注册信息
case class RegisterWorkerInfo(id: String, cpu: Int, ram: Int)

// 这个是workerInfo，这个信息将来保存在master的hashmap（该hashmap是用于管理worker）中的
// 将来workerInfo是可以扩展的
class workerInfo(val id: String, val cpu: Int, val ram: Int) {
	var lastHeartBeat:Long = System.currentTimeMillis()
}

// 当worker注册成功，服务器返回一个RegisterWorkerInfo对象
case object RegisteredWorkerInfo

// worker每隔一定时间有定时器发给自己的一个信息
case object SendHeartBeat

// worker每隔一段时间由定时器触发，而向master发送的协议信息
case class HeartBeat(id: String)

// master给自己发送一个触发检查超时worker的信息
case object StartTimeOutWoeker
// master给自己发信息，检测Workers，对于心跳超时的
case object RemoveTimeOutWorker
