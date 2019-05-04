/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 21:48
	* Project:ScalaLearning
	* FileName:GenericDemo01.scala
	* Version 1.0
	*/


package Chapter18.Generic

object GenericDemo {
	def main(args: Array[String]): Unit = {
		val intMassage = new IntMassage[Int](10)
		println(intMassage)

		val stringMassage = new StringMassage[String]("Hello World!")
		println(stringMassage)
	}
}

class Massage[T](s:T) {
	def get = s
}

class IntMassage[Int](v:Int) extends Massage(v)

class StringMassage[String](v:String) extends Massage(v)