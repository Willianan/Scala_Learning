/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 16:20
	* Project:ScalaLearning
	* FileName:ImplicitDemo01.scala
	* Version 1.0
	*/


package Chapter9

object ImplicitDemo01 {
	// 隐式转换
	// 隐式转换函数是以implicit关键字声明的带有单个参数的函数。这种函数将会自动应用，将值从一种类型转换为另外一种类型
	def main(args: Array[String]): Unit = {
		//编写一个隐式函数 Double -> Int
		// 隐式函数应该在作用域生效
		implicit def function(d:Double): Int ={
			d.toInt
		}
		val num: Int = 3.5
		println("num = " + num)
	}
}

/*
* 1、隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，
*    只与函数签名（函数参数类型和返回值类型）有关
* 2、隐式函数可以有多个（即：隐式函数列表），但是需要宝藏在当
*    前环境下，只有一个隐式函数能被识别。
*
* */
