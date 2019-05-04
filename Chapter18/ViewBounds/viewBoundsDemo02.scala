/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 15:46
	* Project:ScalaLearning
	* FileName:viewBoundsDemo02.scala
	* Version 1.0
	*/


package Chapter18.ViewBounds

object viewBounds02 {
	def main(args: Array[String]): Unit = {
		val person1 = new Person("Tom",21)
		val person2 = new Person("Jack",32)
		val compareComm = new CompareComm(person1,person2)
		println(compareComm.geter.name)

		val cat1 = new Cat("Smith")
		val cat2 = new Cat("Tom")
		val compareComm2 = new CompareComm(cat1,cat2)
		println(compareComm2.geter.name)
	}
}

class Person(val name:String,val age:Int) extends Ordered[Person]{
	override def compare(that: Person): Int = {
		this.age - that.age
	}

	override def toString: String = this.name + "\t" + this.age
}

class Cat(val name:String)extends Ordered[Cat]{
	override def compare(that: Cat): Int = {
		this.name.length - that.name.length
	}
}


class CompareComm[T <% Ordered[T]](obj1:T,obj2:T){
	def geter = if (obj1 > obj2) obj1 else  obj2

	def getter2 = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
