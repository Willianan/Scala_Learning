/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 13:56
	* Project:ScalaLearning
	* FileName:GenericDemo03.scala
	* Version 1.0
	*/


package Chapter18.Generic

object GenericDemo03 {
	def main(args: Array[String]): Unit = {
		val list1 = List("hello","dog","world")
		val list2 = List(90,23,45)
		println(midList[String](list1))
		println(midList[Int](list2))
	}

	def midList[E](l:List[E]): E ={
		l(l.length / 2)
	}
}
