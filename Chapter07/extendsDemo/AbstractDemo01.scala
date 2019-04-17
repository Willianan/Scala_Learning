/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 10:17
	* Project:ScalaLearning
	* FileName:AbstractDemo01.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object AbstractDemo01 {
	// 说明：抽象类的价值更多是在于设计，让子类继承并实现抽象类（实现抽象类的抽象方法）
	def main(args: Array[String]): Unit = {
		println("===================")
	}
}
// 抽象类（通过abstract关键字标记不能被实例化的类）
abstract class Animal{
	var name:String         // 抽象的字段
	var age: Int            // 抽象的字段
	var color: String = "black"     // 普通属性
	def cry()               // 抽象方法，不需要标记abstract
}
