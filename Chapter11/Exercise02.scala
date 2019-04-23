/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/6 15:04
	* Project:ScalaLearning
	* FileName:Exercise02.scala
	* Version 1.0
	*/


package Chapter11

import scala.collection.mutable

object Exercise02 {
	def main(args: Array[String]): Unit = {
		val sentence = "AAAAAAAAAABBBBBBBBCCCCCCDDDDDDD"
		val map = sentence.foldLeft(Map[Char, Int]())(charCount)
		println(map)
		val map2 = mutable.Map[Char,Int]()
		sentence.foldLeft(map2)(charCount2)
		println(map2)

	}

	def charCount(map: Map[Char, Int], c: Char): Map[Char, Int] = {
		map + (c -> (map.getOrElse(c, 0) + 1))
	}

	// 使用可变的map
	def charCount2(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
		map += (c -> (map.getOrElse(c, 0) + 1))
	}
}
