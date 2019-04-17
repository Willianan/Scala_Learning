/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 20:31
	* Project:ScalaLearning
	* FileName:TypeConvert.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo


// 类型检查和转换的最大价值在于：可以判断传入对象的类型，然后转成对应的子类对象，进行相关操作，这里也体现出多态的特点
object TypeConvert {
	def main(args: Array[String]): Unit = {
		//classOf的使用，可以得到类名
		println(classOf[String])        // 输出
		val s = "King"
		println(s.getClass.getName)     // 使用反射机制

		// isInstanceOf:判断obj是不是T类型 asInstanceOf：将obj强转成T类型
		var p1 = new Person2
		var emp1 = new Emp2
		// 将子类引用给父类（向上转型，自动）
		p1 = emp1
		// 将父类的引用重新转成子类引用（多态），即向下转型
		var emp2 = p1.asInstanceOf[Emp2]
		emp2.sayHello()
	}
}

class Person2 {
	var name: String = "Tom"

	def printName() {
		println("Person1 printName() " + name)
	}

	def SayHi(): Unit = {
		println("Say Hello.")
	}
}

// 重写父类同名方法
class Emp2 extends Person2 {
	// 这里需要显式的使用override关键字
	override def printName() {
		println("Emp printName() " + name)
		// 在子类中需要去调用父类的方法，使用super关键字
		super.printName()
		SayHi()
	}
	def sayHello(): Unit ={
		println("Ok......")
	}
}
