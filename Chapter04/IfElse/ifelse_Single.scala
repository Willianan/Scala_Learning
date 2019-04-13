/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 13:57
	* Project:ScalaLearning
	* FileName:ifelse_simple.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn
//import scala.io._   // _表示将scala.io包的所有内容一起引入

// 小技巧：如何查看某个包下包含的内容
// 1、将光标放在需要查看的某包上，然后Ctrl+b

object ifelse_Single {
	def main(args: Array[String]): Unit = {
		println("input age:")
		val age = StdIn.readInt()
		if (age > 18){
			println("age > 18")
		}
	}

}
