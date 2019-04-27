/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 20:35
	* Project:ScalaLearning
	* FileName:HigherOrderFunction01.scala
	* Version 1.0
	*/
package Chapter13

object HigherOrderFunction01 {
	//高阶函数（higher-order-function）
	// 能够接受函数作为参数的函数，称为高阶函数，可以使应用程序更加健壮
	def main(args: Array[String]): Unit = {
		// 高阶函数的基本使用
		// test就是一个高阶函数，可以接收f: Double => Double
		def test(f: Double => Double,f2:Double =>Int, n1: Double) = {
			f(f2(n1))
		}

		// sum一个普通函数
		def sum(d: Double): Double = {
			d + d
		}
		def mod(d:Double): Int = {
			d.toInt % 2
		}

		val res = test(sum,mod,6.0)
		println("res = " + res)
	}
}
