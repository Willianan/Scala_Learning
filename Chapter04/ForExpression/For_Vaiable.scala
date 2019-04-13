/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 17:00
	* Project:ScalaLearning
	* FileName:For_Vaiable.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Vaiable {
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 3 ; j = 4 - i) {
			println(j)
		}
	}

}
