/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 16:10
	* Project:ScalaLearning
	* FileName:ListDemo04.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable.ListBuffer

object ListDemo04 {
	// ListBuffer
	// ListBuffer是可变的List集合，可以添加、删除元素，ListBuffer属于序列
	def main(args: Array[String]): Unit = {
		val list0 = ListBuffer[Int](1,2,3)
		println("list0(2) = " + list0(2))
		for (item <- list0) {
			println("item = " + item)
		}

		val list1 = new ListBuffer[Int]   // 空的ListBuffer
		list1 += 4
		list1.append(5)

		list0 ++= list1
		val list2 = list0 ++ list1
		val list3 = list0 :+ 5

		println("============= delete ==============")
		println("list1 = " + list1)
		list1.remove(1)
		for (item <- list1) {
			println("item = " + item)
		}
	}
}
