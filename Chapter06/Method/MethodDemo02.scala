/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 16:29
	* Project:ScalaLearning
	* FileName:MethodDemo02.scala
	* Version 1.0
	*/


package Chapter6.method

object MethodDemo02 {
	/*
	* 编写类（methodExec），编写一个方法，方法不需要参数，在方法中打印一个10*8的矩形，在main方法中调用该方法
	* */
	def main(args: Array[String]): Unit = {
		val m = new MethodExec
		m.printRect()
		/*
		* 修改上一个程序，编写一个方法，方法不需要参数，计算该矩形的面积，并将其作为方法返回值，
		* 在main方法中调用该方法，并打印出面积值（结果保留小数点2位）
		* 分析：
		*     1、矩形的长和宽需要设计成属性
		* */
		m.width = 2.1
		m.length = 3.4
		println("area = " + m.area())
	}
}

class MethodExec {
	var length = 0.0
	var width = 0.0
	// 1
	def printRect(): Unit = {
		for (i <- 0 until 10) {
			for (j <- 0 until 8) {
				print("*")
			}
			println()
		}
	}
	// 2
	def area(): Double ={
		(this.length * this.width).formatted("%.2f").toDouble
	}
}