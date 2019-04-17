/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 15:18
	* Project:ScalaLearning
	* FileName:ScalaInnerClass.scala
	* Version 1.0
	*/
package Chapter8.innerclass

import Chapter8.innerclass

object ScalaInnerClassDemo {
	def main(args: Array[String]): Unit = {
		val outer1: ScalaOuterClass = new ScalaOuterClass
		val outer2: ScalaOuterClass = new ScalaOuterClass

		// Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用对象.内部类的方式创建
		val inner1 = new outer1.ScalaInnerClass
		val inner2 = new outer2.ScalaInnerClass

		// 使用inner1去调用info()
		inner1.info()
		// 创建静态内部类对象
		val staticinner = new innerclass.ScalaOuterClass.ScalaStaticInnerClass
		println(staticinner)
	}
}
//外部类使用访问外部类的属性的方式1：外部类名.this.属性名
//class ScalaOuterClass {
//	// 定义两个属性
//	var name = "Jack"
//	var age = 23
//	private var sal = 30000.9
//
//	class ScalaInnerClass { // 成员内部类
//		// 第一种访问方式：外部类名.this.属性名
//		//怎么理解ScalaOuterClass.this?     就相当于是ScalaOuterClass这个外部类的一个实例，然后通过ScalaOuterClass.this实例对象去访问name属性
//		// 只是这种写法比较特别，
//		def info(): Unit ={
//			println("name: " + ScalaOuterClass.this.name + " age: " + ScalaOuterClass.this.age + " sal: " + ScalaOuterClass.this.sal)
//		}
//	}
//}

//外部类使用访问外部类的属性的方式2：外部类别名(推荐使用)
// 将外部类属性写在别名后面
class ScalaOuterClass {
	myouter =>      // 外部类的别名 看作是外部类的一个实例
	class ScalaInnerClass { // 成员内部类
		// 第二种访问方式：外部类别名.属性名
		def info(): Unit ={
			println("name: " + myouter.name + " age: " + myouter.age + " sal: " + myouter.sal)
		}
	}
	// 定义两个属性
	var name = "Tom"
	var age = 25
	private var sal = 45000.0
}

object ScalaOuterClass { // 伴生对象
class ScalaStaticInnerClass { // 静态内部类

}
}

