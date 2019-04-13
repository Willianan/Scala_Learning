/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 14:15
	* Project:ScalaLearning
	* FileName:Exercise01.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object Exercise01 {
	def main(args: Array[String]): Unit = {
		/*
		*
		* 定义两个变量Int，判断二者的和，是否既能被3又能被5整除，打印提示信息
		* */
		println("Input first number : ")
		val num1 = StdIn.readInt()
		println("Input second number : ")
		val num2 = StdIn.readInt()
		var sum = num1 + num2
		if (sum % 3 == 0) {
			if (sum % 5 == 0){
				println("Sum("+ num1 + "," + num2 + ") can be divided exactly by 3 and 5.")
			}
			else {
				println("Sum("+ num1 + "," + num2 + ") can be divided exactly by 3 but not by 5.")
			}
		}
		else {
			println("Sum("+ num1 + "," + num2 + ") can't be divided exactly by 3 and 5.")
		}
	}
}
