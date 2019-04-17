/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 15:53
	* Project:ScalaLearning
	* FileName:TypeProjection.scala
	* Version 1.0
	*/


package Chapter8.innerclass

object TypeProjection {
	def main(args: Array[String]): Unit = {
		val outer1: ScalaOuterClass2 = new ScalaOuterClass2
		val outer2: ScalaOuterClass2 = new ScalaOuterClass2

		// Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用对象.内部类的方式创建
		val inner1 = new outer1.ScalaInnerClass2
		val inner2 = new outer2.ScalaInnerClass2

		// 使用inner1去调用info()
		inner1.info()
		inner1.test(inner1)
		//在默认情况下，Scala的内部类的实例和创建该内部类实例的外部对象关联
		inner1.test(inner2)
		inner2.test(inner2)
	}
}

class ScalaOuterClass2 {
	myouter =>      // 外部类的别名 看作是外部类的一个实例
	class ScalaInnerClass2 { // 成员内部类
		// 第二种访问方式：外部类别名.属性名
		def info(): Unit ={
			println("name: " + myouter.name + " age: " + myouter.age + " sal: " + myouter.sal)
		}
		// 类型投影ScalaOuterClass2#ScalaInnerClass2
		// 类型投影的作用：屏蔽外部对象对内部类对象的影响
		def test(ic:ScalaOuterClass2#ScalaInnerClass2): Unit ={
			println(ic)
		}
	}
	// 定义两个属性
	var name = "Tom"
	var age = 25
	private var sal = 45000.0
}

object ScalaOuterClass2 { // 伴生对象
class ScalaStaticInnerClass2 { // 静态内部类

}
}