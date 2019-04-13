/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/27 20:09
	* Project:ScalaLearning
	* FileName:ThrowsDemo.scala
	* Version 1.0
	*/


package Chapter5.ExceptionHandling

object ThrowsDemo {
	def main(args: Array[String]): Unit = {
		f11
	}
	@throws(classOf[NumberFormatException])// 等同于Java中NumberFormatException.class
	def f11 = {
		"abc".toInt
	}
}
