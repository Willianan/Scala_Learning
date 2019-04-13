/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 16:04
	* Project:ScalaLearning
	* FileName:Exercise06.scala
	* Version 1.0
	*/


package Chapter6.homework

object Exercise06 {
	def main(args: Array[String]): Unit = {
		println("res = " + product("Hello"))
		println("Hello".take(1))      // "H"
		println("Hello".drop(1))      // "ello"
	}

	def product(s: String): Long = {
		// 如果s的字符串的长度为1，就直接返回s.charAt(0).toLong
		if (s.length == 1) {
			return s.charAt(0).toLong
		}
		//如果不等于1，s.take(1)就是返回s的第一个字符(String)
		//s.drop(1)返回s的字符串 除去第一个字符的后面所有的字符(String)
		else {
			s.take(1).charAt(0).toLong * product(s.drop(1))
		}
	}
}
