/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 19:42
	* Project:ScalaLearning
	* FileName:extends01.scala
	* Version 1.0
	*/
package Chapter7.extendsDemo

// Scala继承的基本语法：
//    class 子类名 extends 父类名 {类体}
object extends01 extends App {
	val student = new Student
	student.name = "Tom"      // 调用了student.name() // 调用从Person继承的name()
	student.age = 18
	student.studying()
	student.showInfo()
}

class Person {
	var name: String = _
	var age: Int = _

	def showInfo(): Unit = {
		println("Student Info:")
		println("名字：" + this.name + " 年龄：" + this.age)
	}
}

// Student类继承了Person
class Student extends Person {
	// 这里使用父类的属性
	def studying(): Unit = {
		println(this.name + " is learning Scala.....")
	}
}