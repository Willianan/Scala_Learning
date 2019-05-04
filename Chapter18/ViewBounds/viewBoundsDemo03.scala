/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 16:01
	* Project:ScalaLearning
	* FileName:viewBoundsDemo03.scala
	* Version 1.0
	*/


package Chapter18.ViewBounds

object viewBoundsDemo03 {
	def main(args: Array[String]): Unit = {
		val person1 = new Person3("Tom",31)
		val person2 = new Person3("Simth",21)

		// 引入隐式函数
		import myImplicit._
		val compareComm3 = new CompareComm3(person1,person2)
		println(compareComm3.getter)
	}
}

class Person3(val name:String,val age:Int){
	override def toString: String = this.name + "\t" + this.age
}

class CompareComm3[T <% Ordered[T]](object1:T,object2: T){
	def getter = if (object1 > object2) object1 else object2
	def getter2 = if (object1.compareTo(object2) > 0) object1 else object2
}