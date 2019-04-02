/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 20:17
	* Project:ScalaLearning
	* FileName:VarDemo02.scala
	* Version 1.0
	*/


package Chapter1.Var

object VarDemo02 {
	def main(args: Array[String]): Unit = {
		// 类型推导
		var num = 10 // 这时num就是Int
		// 方式1：利用idea的提示
		// 方式2：使用isInstanceOf[Int]判断
		println(num.isInstanceOf[Int])
		// 类型确定后，值可以变，类型不能变
		// 3、在声明/定义一个变量时，可以使用var或val来修饰，var修饰的变量可变，val修饰的变量不可变
		var age: Int = 30
		println(age)
		age = 20
		println(age)
		val num2 = 30
		println(num2)
		// Scala设计者为什么设计val和var？
		// （1）在实际编程，更多的需要是获取/创建一个对象后，读取该对象的属性，或者是修改对象的属性值，但很少去改变对象本身
		// （2）因为val没有线程安全问题，因此效率高。Scala设计者推荐使用val
		// （3）如果对象需要改变，使用var
		val dog = new Dog
		//dog = new Dog // Reassignment to val
		dog.age = 11
		dog.name = "xiaohua"
	}
}


class Dog {
	//define age and set default value
	var age: Int = 0
	//define Name
	var name: String = ""
}