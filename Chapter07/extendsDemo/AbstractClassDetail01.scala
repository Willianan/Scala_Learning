/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 10:30
	* Project:ScalaLearning
	* FileName:AbstractClassDetail01.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object AbstractClassDetail01 {
	/*
* 抽象类的细节
* */
	def main(args: Array[String]): Unit = {
		/*
		* 1、默认情况下，一个抽象类是不能实例化的，但是在实例化时，动态的实现了抽象类的所有抽象方法是可以的
		* */

		val animal = new Animal03 {
			override def sayHello(): Unit = {
				println("Say Hello World.....")
			}

			override var food: String = _
		}
		animal.sayHello()
	}
}


abstract class Animal02{
	//  2、抽象类不一定要包含abstract方法，即：抽象类可以没有abstract方法
	// 在抽象类中可以有实现方法的
	def sayHi(): Unit ={
		println("say Hello....")
	}
}

abstract class Animal03{
	def sayHello()
	var food: String
}
/*   3、一旦抽象类包含了抽象方法或者抽象属性，则这个类必须声明为abstract
*   4、抽象方法不能有主体，不允许使用abstract修饰
**/

//5、如果有一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类
class Cat extends Animal03{
	override def sayHello(): Unit = {
		println("喵....喵.....")
	}

	override var food: String = _
}

/*
*   6、抽象方法和抽象属性不能使用private、final来修饰，因为这些关键字都是和重写/实现相违背的
*   7、抽象类中可以有实现的方法
*   8、子类重写抽象方法不需要override，写上也不会错
**/
