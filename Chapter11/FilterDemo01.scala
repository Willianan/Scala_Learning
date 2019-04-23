/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 21:22
	* Project:ScalaLearning
	* FileName:FilterDemo01.scala
	* Version 1.0
	*/


package Chapter11

object FilterDemo01 {
	//集合元素的过滤--filter
	// 将符合要求的数据（筛选）放置到新的集合中
	def main(args: Array[String]): Unit = {
		val names = List("Alice","Bob","Nick")
		val names2 = names.filter(startA)
		println(names2)
	}
	def startA(s:String): Boolean = {
		s.startsWith("A")
	}
}
