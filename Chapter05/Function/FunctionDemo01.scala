/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/26 14:54
	* Project:ScalaLearning
	* FileName:FunctionDemo01.scala
	* Version 1.0
	*/


package Chapter5.Function

import scala.io.StdIn

object FunctionDemo01 {
	def main(args: Array[String]): Unit = {
		println("请输入两个整数和运算符：")
		var n1 = StdIn.readInt()
		var n2 = StdIn.readInt()
		var oper = StdIn.readChar()
		println("res = " + getRes(n1,n2,oper))
	}

	// 定义函数
	def getRes(n1: Int, n2: Int, oper: Char) = {
		if (oper == '+') {
			n1 + n2
		}
		else if (oper == '-') {
			n1 - n2
		}
		else {
			null
		}
	}
}


// 函数定义
// def 函数名([参数名：参数类型],......)[[:返回值类型] = ] {
//   语句.....
//   return 返回值
// }
/*
* 1、函数声明关键字为def（definition）
* 2、[参数名：参数类型],.....:表示函数的输入（就是参数列表），可以没有。如果有，多个参数使用逗号间隔
* 3、函数中的语句：表示为了实现某一功能代码块
* 4、函数可以有返回值，也可以没有返回值
*     返回值形式1：：返回值类型 =
*     返回值形式2：= 表示返回值类型不确定，使用类型推导完成
*     返回值形式3：表示没有返回值，return不生效
* 5、如果没有return，默认以执行到最后一行的结果作为返回值
* */
