/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 10:48
	* Project:ScalaLearning
	* FileName:packageobject.scala
	* Version 1.0
	*/

/*
* 包对象
* 基本介绍：包可以包含类、对象和特质trait，但是不能包含函数/方法或变量的定义，这是JVM的局限。
* 为了弥补这一点不足，Scala提供包对象的概念
*
* */


package Chapter7.ScalaPackage{
	// 1、package object packageobject 表示创建一个包对象packageobject，它是Chapter7.ScalaPackage.packageobject这个包对应的包对象
	// 2、每一个包都可以由一个包对象（唯一）
	// 3、包对象的名字需要和子包一样
	// 4、在包对象中可以定义变量、方法
	// 5、在包对象中定义的变量和方法就可以在对应的包中使用
	// 6、在底层这个包对象会生成两个类：package.class 和 package$.class
	//    （1）当创建包对象后，在该包下生成public final class package 和 public final class package$
	//    （2）通过package$的一个静态实例完成对包对象中属性和方法的调用
	package object packageobject{
		var name = "Jack"
		def sayOk(): Unit ={
			println("package object sayOk!")
		}
	}
	package packageobject{
		class Test{
			def test(): Unit ={
				// 这里的name就是包对象packageobject中声明的name
				println(name)
				// 这里的name就是包对象packageobject中声明的sayOk()
				sayOk()
			}
		}
		object TestObj{
			def main(args: Array[String]): Unit = {
				val t = new Test()
				t.test()
				// 因为TestObj和packageobject这个包在同一包下，因此也可以使用
				println("name = " + name)
			}
		}
	}
}


