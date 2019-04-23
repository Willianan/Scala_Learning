/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 16:42
	* Project:ScalaLearning
	* FileName:QueueDemo02.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object QueueDemo02 {
	// 队列元素的追加数据
	def main(args: Array[String]): Unit = {
		val queue1 = new mutable.Queue[Any]
		queue1 += 20
		println(queue1)       // Queue(20)

		queue1 ++= List(2,4,6)    // 默认加在队列后面
		println(queue1)       // Queue(20, 2, 4, 6)

		queue1 += List(1,2,3)  // List(1,2,3) 作用一个元素加入到队列
		println(queue1)       // Queue(20, 2, 4, 6, List(1, 2, 3))
	}
}
