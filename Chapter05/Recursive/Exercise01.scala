/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/26 15:36
	* Project:ScalaLearning
	* FileName:Exercise01.scala
	* Version 1.0
	*/


package Chapter5.Recursive

import scala.io.StdIn

object Exercise01 {
	/*
	* 斐波那契数列
	* 请使用递归的方式，求出斐波那契数1，1，2，3，5，8，13，.....
	* 给你一个整数n，求出它的斐波那契数是多少
	* */
	def main(args: Array[String]): Unit = {
		println("Input Number: ")
		val n = StdIn.readInt()
		println(fbn(n))
	}
	def fbn(n:Int) : Int = {
		//分析
		// 1、当n = 1时，结果为1
		// 2、当n = 2时，结果为1
		// 3、当n > 2时，结果就是前面两个数的和
		if (n == 1 || n == 2) {
			1
		}
		else {
			fbn(n-1) + fbn(n - 2)
		}
	}
}
