/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 16:24
	* Project:ScalaLearning
	* FileName:contextBoundsdemo01.scala
	* Version 1.0
	*/


package Chapter18.ContextBounds


object contextBoundsDemo01 {
	implicit val personComparetor = new Ordering[Persons] {
		override def compare(person1: Persons, person2: Persons): Int = {
			person1.age - person2.age
		}
	}
	def main(args: Array[String]): Unit = {
		val person1 = new Persons("Mary",30)
		val person2 = new Persons("Smith",23)
		val compareCommon4 = new CompareCommon4(person1,person2)
		println(compareCommon4.greatter)
		val compareCommon5 = new CompareCommon5(person1,person2)
		println(compareCommon5.greatter)
		val compareCommon6 = new CompareCommon6(person1,person2)
		println(compareCommon6.greatter)
	}
}

class Persons(val name: String, val age: Int) {
	override def toString: String = this.name + " " + this.age
}

// 方式1
class CompareCommon4[T: Ordering](object1: T, object2: T)(implicit comparetor:Ordering[T]){
	def greatter = if (comparetor.compare(object1,object2) > 0) object1 else object2
}

// 方式2：将隐式参数放到方法内
class CompareCommon5[T:Ordering](object1: T,object2:T){
	def greatter = {
		def f1(implicit cmptor:Ordering[T]) = cmptor.compare(object1,object2)
		if (f1 > 0) object1 else object2
	}
}

// 方式3：使用implicit语法糖，最简单（推荐使用）
class CompareCommon6[T:Ordering](object1: T,object2:T){
	def greatter = {
		// 这句话就是会发生隐式转换，获取到隐式值personComparetor
		val comparetor = implicitly[Ordering[T]]
		println("CompareCommon6 comparetor" + comparetor.hashCode())
		if (comparetor.compare(object1,object2) > 0) object1 else object2
	}
}