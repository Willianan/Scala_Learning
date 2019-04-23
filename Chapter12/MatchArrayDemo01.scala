/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 18:15
	* Project:ScalaLearning
	* FileName:MatchArrayDemo01.scala
	* Version 1.0
	*/


package Chapter12

import scala.collection.mutable.ArrayBuffer

object MatchArrayDemo01 {

	// 匹配数组
	/*
	* 1、 Array(0)匹配只有一个元素且为0的数组
	* 2、Array(x,y)匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类体Array(x,y,z)匹配数组有3个元素的等等...
	* 3、Array(0,_*)匹配数组以0开始
	* */
	def main(args: Array[String]): Unit = {
		for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
			val result = arr match {
				case Array(0) => "0"
				case Array(x, y) => x + " " + y
				case Array(0, _*) => "以0开头的数组"
				case _ => "什么集合都不是"
			}
			println("reslut = " + result)
		}
		// 使用默认匹配，交换二元数组的元素
		for (arr1 <- Array(Array(1, 0), Array(0, 1),Array(1, 1))) {
			val result1 = arr1 match {
				case Array(x, y) => ArrayBuffer(y, x)
				case _ => "什么集合都不是"
			}
			println("result1 = " + result1)
		}
	}
}
