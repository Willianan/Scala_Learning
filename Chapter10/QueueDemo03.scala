/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 16:52
	* Project:ScalaLearning
	* FileName:QueueDemo03.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object QueueDemo03 {
	// 删除和加入队列元素
	def main(args: Array[String]): Unit = {
		val queue1 = new mutable.Queue[Int]
		queue1 += 12
		queue1 += 34
		queue1 ++= List(2,9)
		queue1.dequeue()        // 队列头出
		println(queue1)
		queue1.enqueue(20,60)   // 队列尾入
		println(queue1)
	}
}
