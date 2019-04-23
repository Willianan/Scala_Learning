/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 19:02
	* Project:ScalaLearning
	* FileName:MapDemo03.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object MapDemo03 {
	//映射Map --- 对map修改、添加和删除
	def main(args: Array[String]): Unit = {
		// 更新map的元素
		// 1、map是可变的，才能修改，否则报错
		// 2、如果key存在，则修改对应的值，否则等价于添加一个键值对（key-value）
		val map = mutable.Map(("A",1),("B","北京"),("C",3))
		println(map)
		map("AA") = 20
		println(map)

		// 添加map元素
		// 方式1 --- 增加单个元素
		val map1 = mutable.Map(("A",1),("B","北京"),("C",3))
		map1 += ("D" -> 4)
		map1 += ("B" -> 50)
		println(map1)

		// 方式2 --- 增加多个元素
		val map2 = mutable.Map(("A",1),("B","北京"),("C",3))
		val map3 = map1 + ("E" -> 1,"F" -> 3)
		println(map3)
		map2 += ("EE" -> 1,"FF" -> 3)
		println(map2)

		//删除map元素
		// 如果key存在，就删除；如果key不存在，也不会报错。
		map3 -= ("A","B")
		println(map3)
	}
}
