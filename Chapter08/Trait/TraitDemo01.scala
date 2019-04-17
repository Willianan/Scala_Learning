/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 15:31
	* Project:ScalaLearning
	* FileName:TraitDemo01.scala
	* Version 1.0
	*/


package Chapter8.Trait

object TraitDemo01 {
	def main(args: Array[String]): Unit = {
		val c = new C
		val f = new F
		c.getConnect()      // connect mySQL......
		f.getConnect()      // connect Oracle......
	}
}

// 按照要求定义一个trait
trait Trait01 {
	def getConnect()
}
// 先将六个类的关系写出
class A {}
class B extends A {}
class C extends A with Trait01 {
	override def getConnect(): Unit = {
		println("connect mySQL......")
	}
}

class D {}
class E extends D {}
class F extends D with Trait01 {
	override def getConnect(): Unit = {
		println("connect Oracle......")
	}
}