/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 10:20
	* Project:ScalaLearning
	* FileName:packageDemo04.scala
	* Version 1.0
	*/

//4、父包需要访问子包的内容时，需要import对应的类等

//5、可以在同一个.scala文件中，声明并列的package（建议嵌套的package不要超过3层）

package Chapter7 {

	import Chapter7.scala4.monster // 包 Chapter7
class User3 { // 在Chapter7包下创建了一个User类
	def sayHello(): Unit ={
		// 想使用Chapter7.scala4包下的monster类
		import Chapter7.scala4.monster
		val monster = new monster()

	}
}
	package scala4 {// 创建包Chapter7.scala4
		class User{// 在Chapter7.scala4包下创建了一个User类

		}
		class monster{

		}
	}



	package ScalaPackage { // 包 Chapter7.ScalaPackage
	class Person6 { // 表示在Chapter7.ScalaPackage下创建类Person
		val name = "Nick"

		def play(message: String): Unit = {
			println(this.name + " " + message)
		}
	}

		class User1 {

		}

		object test103 { // 表示在Chapter7.ScalaPackage下创建了object
			def main(args: Array[String]): Unit = {
				println("Ok......")
				// 直接使用父包的内容
				// 1、如果有同名的类，则采用就近原则来使用内容（比如包）
				// 2、如果就是要使用父包的类，则指定路径即可
				val user = new User
				println("User = " + user)
				val user2 = new Chapter7.User2()
				println("User2 = " + user2)
			}
		}

	}

}