/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 21:47
	* Project:ScalaLearning
	* FileName:FunctionCurry.scala
	* Version 1.0
	*/


package Chapter13

object FunctionCurry {
	//函数柯里化
	/*
			1、函数编程中，接收多个参数的函数都可以转化为接收单个参数的函数，这个转化过程就叫柯里化
			2、柯里化就是证明了函数只需要一个参数而已。
			3、不用设立柯里化存在的意义这样的命题，柯里化就是以函数为主体这种思想发展的必然产生的
				 结果。（即：柯里化是面向函数思想的必然产生结果）
	*/
	def main(args: Array[String]): Unit = {
		println(mulCurry(10)(8))
	}
	def mulCurry(x:Int)(y:Int) = x * y
}
