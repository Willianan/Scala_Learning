/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 16:47
	* Project:ScalaLearning
	* FileName:For_3.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Guard {
	def main(args: Array[String]): Unit = {
		//说明：
		// 1、循环守卫，即循环保护式（也称为条件判断式（守卫））。
		// 保护式为true则进入循环体内部，为false则跳过，类似continue
		for (i <- 1 to 10 if i % 2 != 1) {
			println(i + "Hello")
		}
	}

}
