/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 15:39
	* Project:ScalaLearning
	* FileName:Interrupt_Continue.scala
	* Version 1.0
	*/


package Chapter4.WhileCirculation

object Interrupt_Continue {
	def main(args: Array[String]): Unit = {
		// 说明：
		// 1、1 to 10
		// 2、循环守卫
		for (i <- 1 to 10 if (i != 2 && i != 3)) {
			println("i = " + i)
		}
		// 也可以写成如下形式：
		println("-----------------------")
		for (i <- 1 to 10) {
			if (i != 2 && i != 3) {
				println("i = " + i)
			}
		}
	}
}
// 使用if-else或循环守卫实现continue功能
