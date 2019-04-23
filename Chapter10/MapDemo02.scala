/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 17:12
	* Project:ScalaLearning
	* FileName:MapDemo02.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object MapDemo02 {
	// 映射Map---取值
	def main(args: Array[String]): Unit = {
		// 方式1---使用Map(key)
		//    1、如果key存在，则返回对应的值
		//    2、如果key不存在，则抛出异常[java.util.NoSuchElementException: key not found: ]
		//    3、在Java中，如果key不存在则返回null
		val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
		val value1 = map2("Alice")
		println(value1)

		// 方式2---使用contains方法检查是否存在key
		//  1、返回Boolean
		//  2、如果key存在，则返回True
		//  3、如果key不存在，则返回false
		val map4 = mutable.Map(("A", 1), ("B", 2), ("C", 3), ("D", 30))
		map4.contains("B")

		/*
		* 说明
		*   使用contains先判断再取值，可以防止异常，并加入相关的处理逻辑
		* */
		val map5 = mutable.Map(("A", 1), ("B", 2), ("C", 3), ("D", 30.9))
		if (map5.contains("B")) {
			println("key存在，值 = " + map5("B"))
		}
		else {
			println("不存在")
		}

		//方式3---使用map.get(key).get取值
		// 通过映射.get(键)这样的调用返回一个Option对象，要么是Some，那么是None
		/*
		* 说明
		*   1、map.get方法会将数据进行包装
		*   2、如果map.get(key) key存在返回some，如果key不存在，则返回None
		*   3、如果map.get(key).get key存在，返回key对应的值，否则抛出异常java.util.NoSuchElementException：None.get
		* */
		val map3 = mutable.Map(("A",1),("B","北京"),("C",3))
		println(map3.get("A"))    // Some
		println(map3.get("A").get) // 得到Some再取出

		//方式4---使用map.getOrElse()取值
		// getOrElse方法：def getOrElse[V1 >: V](key: K, default: => V1)
		/*
		* 说明
		*   1、如果key存在，返回key对应的值
		*   2、如果key不存在，返回默认值。
		* */
		println(map3.getOrElse("A","默认"))
	}
}
/*
* 选择取值方式使用
*   1、如果确定map有这个key，则应当使用map(key),速度块
*   2、如果不能确定map是否有key，而且有不同的业务逻辑，使用map.contains(),先判断再加入逻辑
*   3、如果只是简单的希望得到一个值，使用map.getOrElse()
* */