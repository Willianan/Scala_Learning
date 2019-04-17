/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 15:43
	* Project:ScalaLearning
	* FileName:TestImport.scala
	* Version 1.0
	*/


package Chapter7.importdetails

import scala.beans._
import scala.collection.mutable    // 表示将该包所有的类引入，等价于*
object TestImport {
	def main(args: Array[String]): Unit = {

	}
}

class User{
	import scala.beans.BeanProperty   // 在需要时才引入，作用域在{}
	@BeanProperty var name:String = ""

	def test(): Unit ={
		// 如果不想要某个包中的全部的类，而是其中的几个类，可以采用选取器（大括号）
		import scala.collection.mutable.{HashMap,HashSet}
		var map = new HashMap()
		var set = new HashSet()
	}
	def test2(): Unit ={
		// 将java.util.HashMap 重命名为JavaHashMap
		import java.util.{HashMap =>JavaHashMap,List}
		import scala.collection.mutable._
		var map = new HashMap()     // 此时的HashMap指向的是Scala中的HashMap
		var map1 = new JavaHashMap();  // 此时使用的是Java中HashMap的别名
		// 如果某个冲突的类根本不会用到，那么这个类可以直接隐藏
		import java.util.{HashMap => _,_} // 含义为引入java.util包的所有类，但是忽略HashMap类
	}
}
class Dog{
	@BeanProperty var name: String = ""
}
