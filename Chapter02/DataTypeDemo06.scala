/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 15:15
	* Project:ScalaLearning
	* FileName:DataTypeDemo06.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo06 {
	def main(args: Array[String]): Unit = {
		val res = sayHello()
		println("res = " + res)

	}

	// Unit等价于java的void，只有一个实力值()
	def sayHello(): Unit = {

	}

	// Null类只有一个实例对象：null,类似于java中的null使用。null可以赋值给任意引用类型（AnyRef），
	// 但是不能赋值给值类型（AnyVal）
	val dog: Dog = null
	//val char1:Char = null
	println("OK----")
}

class Dog {

}

// 布尔类型
// Boolean类型数据只允许取值true和false
// Boolean类型占1各字符
// Boolean类型适于逻辑运算