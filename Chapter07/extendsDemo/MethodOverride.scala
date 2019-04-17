/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 20:20
	* Project:ScalaLearning
	* FileName:MethodOverride.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object MethodOverride01 {
	def main(args: Array[String]): Unit = {
		val emp = new Emp
		emp.printName()
	}
}

class Person1{
	var name: String = "Tom"
	def printName(){
		println("Person1 printName() " + name)
	}
	def SayHi(): Unit ={
		println("Say Hello.")
	}
}

// 重写父类同名方法
class Emp extends Person1 {
	// 这里需要显式的使用override关键字
	override def printName(){
		println("Emp printName() " + name)
		// 在子类中需要去调用父类的方法，使用super关键字
		super.printName()
		SayHi()
	}
}