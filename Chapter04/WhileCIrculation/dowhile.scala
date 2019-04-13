/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 14:28
	* Project:ScalaLearning
	* FileName:dowhile.scala
	* Version 1.0
	*/


package Chapter4.WhileCirculation

object dowhile {
	def main(args: Array[String]): Unit = {
		var i = 0
		do {
			println("hello" + i)
			i += 1
		} while (i < 10)
	}

}
