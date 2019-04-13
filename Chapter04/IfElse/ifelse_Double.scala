/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 14:05
	* Project:ScalaLearning
	* FileName:ifelse_Double.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object ifelse_Double {
	def main(args: Array[String]): Unit = {
		printf("input age:")
		val age = StdIn.readInt()
		if (age > 18){
			println("age > 18")
		}
		else{
			println("age <= 18")
		}
	}

}
