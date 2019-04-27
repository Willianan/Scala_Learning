/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 20:53
	* Project:ScalaLearning
	* FileName:HigherOrderFunctionDemo02.scala
	* Version 1.0
	*/


package Chapter13

object HigherOrderFunction02 {
	//高阶函数可以返回函数类型
	def main(args: Array[String]): Unit = {
		//说明
		//  1、minusxy是高阶函数，返回匿名函数
		//  2、返回的匿名函数 (y: Int) => x - y
		//  3、返回的匿名函数可以使用变量接收
		def minusxy(x: Int) = {
			(y: Int) => x - y // 匿名函数
		}
		// 分步执行
		val f1 = minusxy(3)
		println("f1的函数类型为：" + f1)
		println(f1(5))
		println("-----------------------------------")
		val result = minusxy(3)(5)
		println(result)
	}
}
