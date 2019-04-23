/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 16:58
	* Project:ScalaLearning
	* FileName:QueueDemo04.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable

object QueueDemo04 {
	// 返回队列的元素
	def main(args: Array[String]): Unit = {
		val queue1 = new mutable.Queue[Any]
		queue1 ++= List(1,2,3,4,5,true,"hello",12)
		// 返回队列的第一个元素
		println(queue1.head)
		// 返回队列的最后一个元素
		println(queue1.last)
		// 返回队列的尾部 即：返回除了第一个以外剩余的元素，可以级联使用，在递归中使用较多
		println(queue1.tail)   // Queue(2, 3, 4, 5, true, hello, 12)
		println(queue1.tail.tail) // Queue(3, 4, 5, true, hello, 12)
		println(queue1.tail.tail.tail)  // Queue(4, 5, true, hello, 12)
	}
}
