/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 17:06
	* Project:ScalaLearning
	* FileName:For_Nest.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Nest {
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 3;j <- 1 to 4) {
			println("i = " + i + ",j = " + j)
		}
	}

}
