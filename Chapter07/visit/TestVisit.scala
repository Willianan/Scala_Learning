/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 14:59
	* Project:ScalaLearning
	* FileName:TestVisit.scala
	* Version 1.0
	*/


package Chapter7.visit

object TestVisit {
	def main(args: Array[String]): Unit = {
		val c = new Clerk()
		c.showInfo()
		Clerk.test(c)

		val p1 = new person
		println(p1.name)
	}
}

class Clerk{
	var name:String = "Jack"
	private var sal:Double = 9999.9
	def showInfo(): Unit ={
		// 在本类可以使用私有的
		println("name：" + name + "sal：" + sal)
	}
}
//当一个文件中出现了class Clerk 和 object Clerk
// 1、class Clerk 称为伴生类
// 2、object Clerk 称为伴生对象
// 3、因为Scala设计者将static取消，就设计了伴生类和伴生对象的概念
// 4、伴生类 写非静态的内容 伴生对象 就是静态内容
object Clerk{
	def test(c: Clerk): Unit ={
		//这里体现出在伴生对象中可以访问c.sal
		println("test name：" + c.name + "sal：" + c.sal)
	}
}

class person{
	// 增加包访问权限后，1、private同时起作用。不仅同类可以使用，同时xxx包下其他类也可以使用
	private[visit] val name = "Tom"
	// 也可以将可见度延展到上层包
	private[Chapter7] val description = "zhangsan"
}
/*
* Scala中包的可见性和访问修饰符的使用
* 1、当属性访问权限默认时，，从底层看属性是private的，但是因为提供了xxx_$eq()[类似setter]/xxx()[类似getter]方法，
* 因此从使用效果看是任何地方都可以访问
* 2、当方法访问权限为默认时，默认为public访问权限
* 3、private为私有权限，只在类的内部和伴生对象中可用
* 4、protected为受保护权限，Scala中受保护权限比Java更严格，只能子类访问，同包无法访问
* 5、在Scala中没有public关键字，即不能用public显式的修饰属性和方法
* 6、包访问权限（表示属性有了限制，同时包也有了限制），这点和Java不一样，体现出Scala包使用的灵活性
* */