/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 14:16
	* Project:ScalaLearning
	* FileName:CatDemo.scala
	* Version 1.0
	*/


package Chapter6.oop

object CatDemo {
	def main(args: Array[String]): Unit = {
		val cat = new Cat
		// 说明
		//  1、cat.name 其实不是直接访问属性，而是 cat.name_$eq("Tom")
		//  2、cat.name等价于cat.name()
		cat.name = "Tom"
		cat.age = 10
		cat.color = "white"
		println("Ok.....")
		printf("cat Info:\nname: %s\tage: %d\tcolor: %s",cat.name,cat.age,cat.color)
	}
}

// 一个class Cat 对应的字节码文件只有一个Cat.class,默认public
class Cat{
	// define three values
	// 说明
	// 1、当声明了var name：String时，在底层对应private name
	// 2、同时会生成两个public方法name() <=类似=> getter public name_$eq() => setter
	var name : String = _ // 下划线表示给定默认值
	var age : Int = _
	var color : String = _
}
