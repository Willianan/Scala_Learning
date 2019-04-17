/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 14:20
	* Project:ScalaLearning
	* FileName:SelfTypeDemo.scala
	* Version 1.0
	*/


package Chapter8.TraitSelfType

object SelfTypeDemo {
	/*
	* 自身类型
	* 主要是为了解决特质的循环依赖问题，同时可以确保特质再不扩展某个类型的情况下，依然可以做到限制
	* 混入该特质的类的类型
	* */
	def main(args: Array[String]): Unit = {

	}
}
// Logger就是自身类型特质
// trait Logger extends Exception,要求混入该特质的类也是Exception子类
trait Logger{
	// 明确告诉编译器，我就是Exception，如果没有这句话，下面的getMessage不能调用
	this: Exception =>
	def log(): Unit ={
		println(getMessage)
	}
}
//class Console extends Logger{}//error
class Console extends Exception with Logger{}