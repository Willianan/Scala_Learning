/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 19:56
	* Project:ScalaLearning
	* FileName:ImplicitValueDemo04.scala
	* Version 1.0
	*/


package Chapter9

/*
* 1、当在程序中，同时有隐式值，默认值，传值
* 2、编译器的优先级为 传值 > 隐式值 > 默认值
* 3、在隐式值匹配时，不能有二义性
*4、如果三个（隐式值，默认值，传值）都没有，就会报错
* */
object ImplicitValueDemo04 {
	def main(args: Array[String]): Unit = {
		//	implicit val name: String = "Scala"
		//implicit val name1:String = "world"
		def hello(implicit content: String = "Jack"): Unit = {
			println("hello " + content)
		}

		hello

		// 当同时有implicit值和默认值，implicit优先级高
		def hello2(implicit content: String = "Jack"): Unit = {
			println("hello2 " + content)
		}

		hello2

		// 当一个隐式参数匹配不到隐式值，任然会使用默认值
		implicit val name: Int = 10

		def hello3(implicit content: String = "Jack"): Unit = {
			println("hello2 " + content)
		}

		hello3 // hello3 Jack

		// 当没有隐式值，没有默认值，又没有传值，就会报错
		//		def hello4(implicit content: String): Unit = {
		//			println("hello2 " + content)
		//		}
		//		hello4
	}
}
