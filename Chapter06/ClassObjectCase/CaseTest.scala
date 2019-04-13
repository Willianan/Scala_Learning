/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 14:16
	* Project:ScalaLearning
	* FileName:CaseTest.scala
	* Version 1.0
	*/


package Chapter6.classObjectCase

object CaseTest {
	def main(args: Array[String]): Unit = {
		val dog = new Dog
		dog.name = "Tom"
		dog.age = 3
		dog.weight = 23
		println(dog.say())
	}
}
/*
* 案例
* 编写一个Dog类，包含name(String)、age(Int)、weight(Double)属性
* 类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值
*
* 在另外一个CaseTest类中main方法中，创建Dog对象，并访问say方法和所有属性，将调用结果打印输出
* */

class Dog {
	var name = ""
	var age : Int = _
	var weight : Double = _
	def say(): String ={
		"Dog Info: \nname : " + this.name + "\tage : " + this.age + "\tweight : " + this.weight
	}
}
