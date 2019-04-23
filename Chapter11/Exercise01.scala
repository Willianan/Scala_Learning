/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/6 14:59
	* Project:ScalaLearning
	* FileName:Exercise01.scala
	* Version 1.0
	*/


package Chapter11

import scala.collection.mutable.ArrayBuffer

object Exercise01 {
	def main(args: Array[String]): Unit = {
		val sentence = "AAAAAAAAAABBBBBBBBCCCCCCDDDDDDD"
		// 折叠
		val arrayBuffer = new ArrayBuffer[Char]()
		sentence.foldLeft(arrayBuffer)(putArray)
		println("arrayBuffer = " + arrayBuffer)
	}
	def putArray(array:ArrayBuffer[Char],c:Char): ArrayBuffer[Char] ={
		array.append(c)
		array
	}
}
