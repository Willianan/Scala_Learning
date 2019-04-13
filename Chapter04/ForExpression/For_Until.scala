/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 16:40
	* Project:ScalaLearning
	* FileName:For_2.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Until {
	def main(args: Array[String]): Unit = {
		for (i <- 1 until 3) {
			println(i + "hello")
		}
		// 说明：
		// 1、这种方式的i是从1 到 3-1
		// 2、循环区间：左半闭右半开区间
	}

}
