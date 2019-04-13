/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 15:07
	* Project:ScalaLearning
	* FileName:Exercise03.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

/*
* 求一元二次方程ax^2 + bx + c = 0的根。如果：b^2 - 4ac > 0,方程有两个不同的根；如果b^2 - 4ac = 0,方程有两个相同的根；
* 如果b^2 - 4ac < 0方程没有根
* x1 = (-b + sqrt(b^2 - 4ac)) / 2a
* x2 = (-b - sqrt(b^2 - 4ac)) / 2a
* */
object Exercise03 {
	def main(args: Array[String]): Unit = {
		println("Input a,b and c :")
		val a = StdIn.readFloat()
		val b = StdIn.readFloat()
		val c = StdIn.readFloat()
		var Do = b * b - 4 * a * c
		if (Do > 0) {
			println("方程有两个不同的根：")
			println("x1 = " + (-b + math.sqrt(Do)) / 2 * a)
			println("x2 = " + (-b - math.sqrt(Do)) / 2 * a)
		}
		else if (Do == 0) {
			println("方程有两个相同的根：")
			println("x1 = x2 = " + (-b / 2 * a))
		}
		else {
			println("方程无解")
		}
	}

}
