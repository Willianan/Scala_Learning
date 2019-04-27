/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 14:29
	* Project:ScalaLearning
	* FileName:AbstractControl02.scala
	* Version 1.0
	*/


package Chapter13

object AbstractControl02 {
	// 控制抽象
	// 实现类似while的until函数
	def main(args: Array[String]): Unit = {
		var x = 10

//		while (x > 0) {
//			x -= 1
//			println("x = " + x)
//		}

		def until(condition: => Boolean)(block: => Unit): Unit = {
			// 类似while循环，递归
			if (!condition) {
				block
				until(condition)(block)
			}
		}

		until(x == 0) {
			x -= 1
			println("x = " + x)
		}
	}
}
