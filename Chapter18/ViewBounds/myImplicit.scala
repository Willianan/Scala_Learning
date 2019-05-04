/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 16:09
	* Project:ScalaLearning
	* FileName:myImplicit.scala
	* Version 1.0
	*/


package Chapter18.ViewBounds

object myImplicit {
	implicit def person3ToOrderedPerson3(person3: Person3): Ordered[Person3] = new Ordered[Person3] {
		override def compare(that: Person3): Int = {
			person3.age - that.age
		}
	}
}
