/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 9:18
	* Project:ScalaLearning
	* FileName:ScalaFiledOverride.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object ScalaFiledOverride {
	def main(args: Array[String]): Unit = {
		val obj1: AAA = new BBB
		val obj2: BBB = new BBB
		println("obj1.age = " + obj1.age + "\tobj2.age = " + obj2.age)

	}
}

class AAA {
	val age: Int = 20         // 会生成public age()
}

class BBB extends AAA {
	override val age: Int = 30        // 会生成public age()
}