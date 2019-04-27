/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 21:25
	* Project:ScalaLearning
	* FileName:ClosureDemo.scala
	* Version 1.0
	*/


package Chapter13

object ClosureDemo {
	//闭包
	// 闭包就是一个函数和与其相关的引用环境组合的一个整体（实体）
	def main(args: Array[String]): Unit = {
		def minusxy(x:Int) = (y: Int) => x - y
		// f函数就是闭包
		val f = minusxy(20)

		println("f(1) = " + f(1))
		println("f(2) = " + f(2))
	}
}
