/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 16:24
	* Project:ScalaLearning
	* FileName:MethodDemo01.scala
	* Version 1.0
	*/


package Chapter6.method

object MethodDemo01 {
	def main(args: Array[String]): Unit = {
		val dog = new Dog
		println(dog.cal(10, 20))
	}
}

class Dog {
	private var sal: Double = _
	var food: String = _

	// Method
	def cal(n1: Int, n2: Int): Int = {
		return n1 + n2
	}
}

/*
* 方法的调用机制原理
*   1、当Scala开始执行时，先在栈区开辟一个main栈。main栈最后被销毁
*   2、当Scala程序在执行到最后一个方法时，总会开一个新的栈
*   3、每个栈是独立的空间，变量（基本数据类型）是独立的，互相不影响（引用类型除外）
*   4、当方法执行完毕后，该方法开辟的栈就会被JVM机回收
*
* */
