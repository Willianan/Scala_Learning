/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 19:42
	* Project:ScalaLearning
	* FileName:Set.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object SetDemo01 {
	// 集Set--- 不重复元素的集合，集不保留顺序，默认是以哈希集实现
	// Scala默认情况下，使用的是不可变集合；如有要使用可变集合，需要引入scala.collection.mutable.Set包
	def main(args: Array[String]): Unit = {
		// Set不可变集合的创建
		val set = Set(1,2,3)
		println(set)

		// Set可变集合的创建
		val mutableSet = mutable.Set(1,2,3,"abc")
		println(mutableSet)

		// Set可变集合的元素添加
		//如果添加的对象已经存在，则不会重复添加，也不会报错
		mutableSet.add(4)     // 方式1
		mutableSet += 6       // 方式2
		mutableSet += (5)     // 方式3
		println(mutableSet)

		//Set可变集合的删除
		// 如果删除的对象不存在，则不生效，也不会报错
		mutableSet -= 2         // 操作符形式
		mutableSet.remove("abc")   //函数remove()形式
		println(mutableSet)

		// 遍历
		for (x <- mutableSet) {
			println(x)
		}
	}
}
