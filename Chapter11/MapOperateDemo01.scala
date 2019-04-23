/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 20:08
	* Project:ScalaLearning
	* FileName:MapOperateDemo01.scala
	* Version 1.0
	*/


package Chapter11

object MapOperateDemo01 {
	def main(args: Array[String]): Unit = {
		/*
		请将List(3,5,7)中的所有元素都乘以2，将其结果放到一个新的集合返回，即返回一个新的List(6,10,14)
		*/
		val list1 = List(3,5,7)
		var list2 = List[Int]()
		for (item <- list1) {
			list2 = list2 :+ item * 2
		}
		println(list2)
	}
}
