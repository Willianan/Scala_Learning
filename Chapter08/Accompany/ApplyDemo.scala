/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 14:50
	* Project:ScalaLearning
	* FileName:ApplyDemo.scala
	* Version 1.0
	*/
package Chapter8.Accompany

object ApplyDemo {
	//伴生对象--apply方法
	//在伴生对象中定义apply方法可以实现：类名（参数）方法来创建实例
	def main(args: Array[String]): Unit = {
		val list = List(12, 23, 1, 34, 453)
		println(list)

		val pig = new Pig("小花花")
		println("pig.name: " + pig.name)
		// 使用apply方法创建对象
		val pig2 = Pig("小黑子")
		val pig3 = Pig()
		println("pig2.name: " + pig2.name)
		println("pig3.name: " + pig3.name)

	}
}

// 案例显示apply方法
class Pig(pName: String) {
	var name: String = pName
}

object Pig {
	// 编写一个apply
	def apply(pName: String): Pig = new Pig(pName)

	def apply(): Pig = new Pig("匿名猪猪")
}