/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 21:21
	* Project:ScalaLearning
	* FileName:inputDemo01.scala
	* Version 1.0
	*/


package Chapter3

import scala.io.StdIn

object inputDemo01 {
	def main(args: Array[String]): Unit = {
		/*
		* 要求：从控制台接收用户信息[姓名，年龄，薪水]
		* */
		println("Please input your name")
		val name = StdIn.readLine()
		println("Please input your age")
		val age = StdIn.readInt()
		println("Please input your salary")
		val salary = StdIn.readDouble()
		println("User Information:")
		println("name: " + name)
		println("age: " + age)
		println("scalary: " + salary.formatted("%.2f") + "w+")
		// Cat.sayHello()
		// Cat.sayHi()

	}

}

// 声明了一个对象（伴生对象）,讲解oop时，还要深入系统的讲解
object Cat extends AAA {
	// 方法
	def sayHi(): Unit = {
		println("Hello,World!")
	}
}

trait AAA { // AAA是特质，等价于java中的interface + abstract class
	def sayHello(): Unit = {
		println("AAA say Hello World!")
	}
}