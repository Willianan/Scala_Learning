/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 15:22
	* Project:ScalaLearning
	* FileName:RecursiveReverseString.scala
	* Version 1.0
	*/


package Chapter14

object RecursiveReverseString {
	def main(args: Array[String]): Unit = {
		val str = "hello"
		println(ReverseString(str))
	}
	// 递归翻转字符串
	def ReverseString(string: String): String = {
		if (string.length == 1) string else ReverseString(string.tail) + string.head
	}
}
