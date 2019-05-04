/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 14:37
	* Project:ScalaLearning
	* FileName:upperBoundsDemo02.scala
	* Version 1.0
	*/


package Chapter18.UpperOrLowerBounds

object upperBoundsDemo02 {
	def main(args: Array[String]): Unit = {
		biophony(Seq(new Bird1,new Bird1))
		println("---------------------------")
		biophony(Seq(new Animal1,new Animal1))
		println("###########################")
		biophony(Seq(new Animal1,new Bird1))
		//biophony(Seq(new Earth1,new Earth1))
	}
	def biophony[T <: Animal1](things:Seq[T]) = things map(_.sound)
}

class Earth1{
	def sound(): Unit ={
		println("hello!")
	}
}

class Animal1 extends Earth1{
	override def sound(): Unit = {
		println("animal sound")
	}
}

class Bird1 extends Animal1{
	override def sound(): Unit = {
		println("bird sounds")
	}
}
