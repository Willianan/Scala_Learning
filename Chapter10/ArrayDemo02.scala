/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/2 15:43
	* Project:ScalaLearning
	* FileName:AttayDemo02.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable.ArrayBuffer

// 数组-变长数组（声明泛型）
object ArrayDemo02 {
	def main(args: Array[String]): Unit = {
		// 声明/定义
		val arrayBuffer1 =  ArrayBuffer[Any](3,2,5)
		println("arrayBuffer1(1) = " + arrayBuffer1(1))
		for (i <- arrayBuffer1){
			println(i)
		}
		println(arrayBuffer1.length)
		println("arrayBuffer1.hash = " + arrayBuffer1.hashCode())
		// 追加值/元素
		arrayBuffer1.append(90.0,30)
		println("arrayBuffer1.hash = " + arrayBuffer1.hashCode())
		// 修改/重新赋值
		arrayBuffer1(1) = 78
		println("------------------------")
		for (i <- arrayBuffer1) {
			println(i)
		}
		// 删除
		arrayBuffer1.remove(2)
		println("=======================")
		for (i <- arrayBuffer1) {
			println(i)
		}
		println("new length : " + arrayBuffer1.length)
	}
}
