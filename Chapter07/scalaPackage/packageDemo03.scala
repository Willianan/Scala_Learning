/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 10:06
	* Project:ScalaLearning
	* FileName:packageDemo03.scala
	* Version 1.0
	*/


/*
* 3、作用域原则：可以直接向上访问。即：Scala中子包中直接访问父包中的内容，大括号体现作用域
* （提示：Java中子包使用父包的类，需要import）。在子包和父包类重名时，默认采用就近原则，如果希望
* 指定使用某个类，则带上包名即可。
* */

package Chapter7{       // 包 Chapter7
	class User2{           // 在Chapter7包下创建了一个User类

	}
	package scala3{     // 创建包Chapter7.scala3
		class User{       // 在Chapter7.scala3包下创建了一个User类

		}
	}

	package ScalaPackage{   // 包 Chapter7.ScalaPackage
		class Person5{         // 表示在Chapter7.ScalaPackage下创建类Person
			val name = "Nick"
			def play(message:String): Unit ={
				println(this.name + " " + message)
		}
	}
		class User{

		}
		object test102{    // 表示在Chapter7.ScalaPackage下创建了object
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
