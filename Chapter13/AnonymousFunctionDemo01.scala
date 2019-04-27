/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 20:22
	* Project:ScalaLearning
	* FileName:AnonymousFunctionDemo01.scala
	* Version 1.0
	*/


package Chapter13

object AnonymousFunctionDemo01 {
	// 匿名函数
	def main(args: Array[String]): Unit = {
		//对匿名函数的说明
		//  1、不需要写def 函数名
		//  2、不需要写返回类型，使用类型推导
		//  3、= 变成 =>
		//  4、如果有多行代码块，使用大括号{}
		val triple = (x: Double) => 3 * x
		println(triple(5))
	}
}
