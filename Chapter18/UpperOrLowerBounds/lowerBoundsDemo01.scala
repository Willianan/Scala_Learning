/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 14:52
	* Project:ScalaLearning
	* FileName:lowerBoundsDemo01.scala
	* Version 1.0
	*/


package Chapter18.UpperOrLowerBounds

// 1、和Animal直系的，是Animal父类的还是父类处理，是Animal子类的按照Animal处理
// 2、和Animal无关的，一律按照Object处理
object lowerBoundsDemo01 {
	def main(args: Array[String]): Unit = {
		biophony(Seq(new Earth,new Earth)).map(_.sound())
		println("---------------------------")
		biophony(Seq(new Animal,new Animal)).map(_.sound())
		println("###########################")

		biophony(Seq(new Bird,new Bird)).map(_.sound())

		val res = biophony(Seq(new Bird))

		val res2 = biophony(Seq(new Object))
		val res3 = biophony(Seq(new Moon))
		println("res2 = " + res2)
		println("res3 = " + res3)
	}
	def biophony[T >: Animal](things:Seq[T]) = things
}

class Earth{
	def sound(): Unit ={
		println("hello!")
	}
}

class Animal extends Earth{
	override def sound(): Unit = {
		println("animal sound")
	}
}

class Bird extends Animal{
	override def sound(): Unit = {
		println("bird sounds")
	}
}

class Moon{}