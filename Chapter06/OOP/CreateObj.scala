/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 15:04
	* Project:ScalaLearning
	* FileName:CreateObj.scala
	* Version 1.0
	*/


package Chapter6.oop

object CreateObj {
	def main(args: Array[String]): Unit = {
		val emp = new Emp     // emp类型就是Emp
		// 如果希望子类对象，交给父类的引用，这时就需要写上类型
		val emp2 : Person = new Emp
	}
}

class Person {

}
class Emp extends Person {

}
/*
*
* 说明
* 基本语法：val | var 对象名 [: 类型] = new 类型()
*
*   1、如果不希望改变对象的引用，应该声明为val性质的，否则声明为var。Scala设计者推荐使用val，
*   因为一般来说，在程序中，只改变对象属性的值，而不是改变对象的引用
*   2、Scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，但当类型
*   和后面new对象类型有继承关系即多态时，就必须写
* */