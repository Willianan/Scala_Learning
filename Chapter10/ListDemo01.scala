/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 15:05
	* Project:ScalaLearning
	* FileName:ListDemo01.scala
	* Version 1.0
	*/


package Chapter10

object ListDemo01 {
	// 列表List
	/*
	*   Scala的List可以直接存放数据，就是一个object，默认情况下，Scala的List是不可变的，List属于序列Seq
	*   val List = scala.collection.immutable.List
	*   object List extends SeqFactory[List]
	*
	* */
	def main(args: Array[String]): Unit = {
		// 说明
		// 1、在默认情况下List是scala.collection.immutable.List，即不可变的
		// 2、在Scala中，List就是不可变的，如果需要使用可变的List，则使用ListBuffer
		// 3、List在package object scala做了val List = scala.collection.immutable.List定义
		// 4、List中可以放任何数据类型
		val list01 = List(1,2,3,4)
		println(list01)
		val list02 = Nil      // 空集合
		println(list02)
	}
}
