/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 15:20
	* Project:ScalaLearning
	* FileName:MemState.scala
	* Version 1.0
	*/


package Chapter6.oop

object MemState {
	def main(args: Array[String]): Unit = {
		val p1 = new Person2
		p1.name = "Jack"
		p1.age = 10

		val p2 = p1
		println(p1 == p2)               // true
		p1.name = "Tom"
		println("p2.name: " + p2.name)      // Tom

	}
}

class Person2 {
	var name = ""
	var age : Int = _     // 如果用下划线方式给默认值，则属性必须指定类型
}
