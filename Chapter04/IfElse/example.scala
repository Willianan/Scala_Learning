/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 14:11
	* Project:ScalaLearning
	* FileName:example.scala
	* Version 1.0
	*/


package Chapter4.ifelse

object example {
	def main(args: Array[String]): Unit = {
		var x = 4
		var y = 2
		if (x > 2){
			if (y > 2){
				println(x + y)
			}
			else {
				println("Hello")
			}
		}
		else {
			println("x is " + x)
		}
	}

}
