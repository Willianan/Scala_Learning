/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 15:55
	* Project:ScalaLearning
	* FileName:Exercise05.scala
	* Version 1.0
	*/


package Chapter6.homework

object Exercise05 {
	def main(args: Array[String]): Unit = {
		var res = 1L
		var res1 = 1L
		"Hello".foreach(res *= _.toLong)
		println("res = " + res)

		"Hello".foreach(myCount)
		println("res1 = " + res1)

		def myCount(char: Char): Unit = {
			res1 *= char.toLong
		}
	}
}
