/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 16:47
	* Project:ScalaLearning
	* FileName:MapDemo01.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable

object MapDemo01 {
	// Scala中的Map
	/*
	* 1、Scala中的Map和Java类似，也是一个散列表，存储的内容也是键值对(key-value)映射,Scala中不可变的Map是有序的，
	*    可变的Map是无序的
	* 2、Scala中，有可变的Map（scala.collection.mutable.Map）和不可变Map(scala.collection.immutable.Map)
	* */
	def main(args: Array[String]): Unit = {
		// 方式1----构造不可变映射
		//    Scala中的不可变Map是有序的，构建Map中的元素底层是Tuple2类型。

		// 1、默认Map是immutable.Map
		// 2、key-value类型支持Any
		// 3、在Map的底层，每对key-value是Tuple2
		// 4、从输出的结果来看，输出顺序和声明顺序一致
		val map1 = Map("Alice" -> 10,"Bob" -> 20, "Kotlin" -> "北京")
		println(map1)

		// 方式2----构建可变映射
		// 需要指定可变的Map包
		//  从输出的结果来看，可变的Map输出顺序和声明顺序不一致
		val map2 = scala.collection.mutable.Map("Alice" -> 10,"Bob" -> 20, "Kotlin" -> 30)
		println(map2)

		// 方式3----创建空的映射
		val map3 = new mutable.HashMap[String,Int]()
		println(map3)

		// 方式4---对偶元组
		// 即创建包含键值对的二元组，和第一种方式等价，只是形式上不同而已。
		// 对偶元组就是只包含有两个数据的元组
		val map4 = mutable.Map(("A",1),("B",2),("C",3),("D",30))
		println("map4 = " + map4)
		println(map4("A"))
	}
}
