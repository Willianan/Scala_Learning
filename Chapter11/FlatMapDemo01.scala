/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 21:14
	* Project:ScalaLearning
	* FileName:FlatMapDemo01.scala
	* Version 1.0
	*/


package Chapter11

object FlatMapDemo01 {
	//flatmap映射：flat即压扁、压平、扁平化映射
	// 将集合中的每个元素的子元素映射到某个函数并返回新的集合
	def main(args: Array[String]): Unit = {
		val names = List("Alice", "Bob", "Nick")
		println(names.flatMap(upper))
	}

	def upper(s: String): String = {
		s.toUpperCase
	}
}
