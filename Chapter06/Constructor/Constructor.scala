/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 14:27
	* Project:ScalaLearning
	* FileName:Constructor.scala
	* Version 1.0
	*/


package Chapter6.Constructor

object Constructor {
	def main(args: Array[String]): Unit = {
		val p1 = new Person("Tom",35)
		println(p1)
	}
}
// 构造器的快速入门
// 1、创建person对象的同时初始化对象的age属性值和name属性值
class Person(inName:String,inAge:Int){
	var name : String = inName
	var age : Int = inAge
	// 重写了toString，便于输出对象的信息
	override def toString(): String = {
		"name : " + this.inName + " age : " + this.inAge
	}
}
/*
* 构造器
*
* 构造器又叫构造方法，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。
*
* Scala类的构造器包括：主构造器和辅助构造器
*
* 基本语法：
*     class 类名(形参列表){    // 主构造器
*     // 类体
*       def this(形参列表){   // 辅助构造器
*       }
*       def this(形参列表){   // 辅助构造器可以有多个
*       }
*     }// 辅助构造器函数的名称this，可以有多个，编辑器通过不同参数来区分
* */