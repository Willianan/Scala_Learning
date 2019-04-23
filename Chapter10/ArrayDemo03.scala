/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/2 16:04
	* Project:ScalaLearning
	* FileName:ArrayDemo03.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable.ArrayBuffer

// 定长数组与变长数组的转换

object ArrayDemo03 {
	def main(args: Array[String]): Unit = {
		val array1 = ArrayBuffer[Int]()
		array1.append(1,2,3)
		println(array1)

		// array1.toArray返回结果才是一个定长数组，array1本身没有变化
		val newArray = array1.toArray // 可变数组转定长数组
		println(newArray)

		// newArray.toBuffer返回结果才是一个可变数组，newArray本身没有变化
		val newArray2 = newArray.toBuffer // 定长数组转可变数组
		newArray2.append(123)
		println(newArray2)
	}
}
