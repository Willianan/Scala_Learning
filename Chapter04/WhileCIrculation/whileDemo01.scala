/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 14:18
	* Project:ScalaLearning
	* FileName:whikeDemo01.scala
	* Version 1.0
	*/


package Chapter4.WhileCirculation

object whileDemo01 {
	def main(args: Array[String]): Unit = {
		// 输出10句：hello
		// define variable
		var i = 0
		while (i < 10) {
			println("Hello" + i)
			// 循环变量迭代
			i += 1
		}
	}

}
