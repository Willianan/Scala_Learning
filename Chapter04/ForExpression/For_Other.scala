/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 19:07
	* Project:ScalaLearning
	* FileName:For_Other.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Other {
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 3; j = i * 2){
			println("i = " + i + ",j = " + j)
		}

		// 等价于
		println("-------------------------")
		for {
			i <- 1 to 3
			j = i * 2} {
			println("i = " + i + ",j = " + j)
		}
	}

}
