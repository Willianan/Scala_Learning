/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/26 15:44
	* Project:ScalaLearning
	* FileName:Exercise02.scala
	* Version 1.0
	*/


package Chapter5.Recursive

import scala.io.StdIn

object Exercise02 {
	/*
	* 求函数值
	* 已知f(1) = 3;f(n) = 2 * f(n-1) + 1
	* 请使用递归的思想编程，求出f(n)的值
	* */
	def main(args: Array[String]): Unit = {
		println("Input a number: ")
		val n = StdIn.readInt()
		println("f = " + fun(n))

	}
	def fun(n : Int) : Int = {
		if ( n == 1) {
			3
		}
		else {
			2 * fun(n-1) + 1
		}
	}
}
