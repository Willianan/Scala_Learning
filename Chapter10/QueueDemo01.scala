/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 16:32
	* Project:ScalaLearning
	* FileName:QueueDemo01.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object QueueDemo01 {
	// 队列Queue
	/*
	* 1、队列是一个有序列表，在底层可以用数组或是链表实现
	* 2、其输入和输出要遵循先入先出的原则。即：先存入队列的数据要先取出
	* 3、在Scala中，由设计者直接提供队列类型使用
	* 4、在Scala中，有scala.collection.mutable.Queue和scala.collection.immutable.Queue，一般来说，
	*     在开发中通常使用可变集合中的队列
	* */
	def main(args: Array[String]): Unit = {
		//说明
		// 1、Int表示泛型，表示q1队列只能存放Int类型
		val q1 = new mutable.Queue[Int]
		println(q1)
	}
}
