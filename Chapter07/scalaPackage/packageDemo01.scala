/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 9:32
	* Project:ScalaLearning
	* FileName:packageDemo01.scala
	* Version 1.0
	*/

// 1、Scala进行打包形式如下：
		//package Chapter7.ScalaPackage
		//
		//object packageDemo {
		//
		//} 第一种传统打包方式

		//package Chapter7
		//package ScalaPackage
		//object packageDemo {
		//
		//} 第二种打包方式（与第一种等同）

// 第三种打包方式：
/* 代码说明
*   1、package Chapter7{} 表示我们创建了包Chapter7，在{}中可以继续写它的子包
*   ScalaPackage// Chapter7.ScalaPackage,还可以写类，特质trait，还可以写object
*   2、即Scala支持在同一个文件中，可以同时创建多个包以及给各个包创建类，trait和object
*
* */
package Chapter7{       // 包 Chapter7
	package ScalaPackage{   // 包 Chapter7.ScalaPackage
		class Person3{         // 表示在Chapter7.ScalaPackage下创建类Person
			val name = "Nick"
			def play(message:String): Unit ={
				println(this.name + " " + message)
			}
		}
		object test100{    // 表示在Chapter7.ScalaPackage下创建了object
			def main(args: Array[String]): Unit = {
				println("Ok......")
			}
		}
	}
}



/*
* 3、作用域原则：可以直接向上访问。即：Scala中子包中直接访问父包中的内容，大括号体现作用域
* （提示：Java中子包使用父包的类，需要import）。在子包和父包类重名时，默认采用就近原则，如果希望
* 指定使用某个类，则带上包名即可。
* */
