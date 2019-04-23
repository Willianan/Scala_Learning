/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 19:21
	* Project:ScalaLearning
	* FileName:Mapdemo04.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable

object MapDemo04 {
	// 映射Map----对map遍历
	def main(args: Array[String]): Unit = {
		//遍历
		val map1 = mutable.Map(("A",1),("B","北京"),("C",3),("D",45))
		for ((k,v) <- map1) {
			println(k + "is mapped to " + v)
		}

		println("-----------------------------")
		for (v <- map1.keys) {
			println(v)
		}

		println("============================")
		for (v <- map1.values) {
			println(v)
		}

		println("__________________________")
		for (v <- map1) {
			println(v)
		}
	}
}
