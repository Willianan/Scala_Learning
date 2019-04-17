/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 10:04
	* Project:ScalaLearning
	* FileName:packageDemo02.scala
	* Version 1.0
	*/


//package Chapter7.ScalaPackage
//
//object packageDemo02 {
//
//}
/*
*2、包也可以像嵌套那样嵌套使用（包中有包），这个在第三种打包方式中有体现，在使用第三种打包方式时
* 的好处是：程序员可以在同一个文件中，间类（class/object）、trait创建在不同的包中，这样非常灵活。
* */


package Chapter7{       // 包 Chapter7
class User{           // 在Chapter7包下创建了一个User类

}
	package scala2{     // 创建包Chapter7.scala2
	class User{       // 在Chapter7.scala2包下创建了一个User类

	}
	}

	package ScalaPackage{   // 包 Chapter7.ScalaPackage
	class Person4{         // 表示在Chapter7.ScalaPackage下创建类Person
		val name = "Nick"
		def play(message:String): Unit ={
			println(this.name + " " + message)
		}
	}
		object test101{    // 表示在Chapter7.ScalaPackage下创建了object
			def main(args: Array[String]): Unit = {
				println("Ok......")
			}
		}
	}
}
