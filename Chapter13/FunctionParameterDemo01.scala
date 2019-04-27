/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 20:13
	* Project:ScalaLearning
	* FileName:FunctionParameterDemo01.scala
	* Version 1.0
	*/


package Chapter13

object FunctionParameterDemo01 {
	//作为参数的函数
	// 函数作为一个遍历传入到了另一个函数中，那么该作为参数的函数的类型是：Function1，即：（参数类型）=> 返回类型
	def main(args: Array[String]): Unit = {
		val result1 = Array(1,2,3,4).map(plus(_))
		println(result1.mkString(","))
		println("plus的函数类型为：" + (plus _))
	}

	def plus(x: Int) = 3 + x
}
/*
* 说明
*   1、在Scala中，函数也是有类型
* */