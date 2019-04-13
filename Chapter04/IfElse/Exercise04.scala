/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 16:03
	* Project:ScalaLearning
	* FileName:Exercise04.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object Exercise04 {
	/*
	* 出票系统：根据淡旺季的月份和年龄打印票价
	*
	* 4-10月旺季：
	*   成人（18-60）：60
	*   儿童（<18）:半价
	*   老人（>60）:免费
	*
	*  淡季：
	*  成人：40
	*  儿童：半价
	*  老人：免费
	* */
	def main(args: Array[String]): Unit = {
		val ticket = 60
		println("请输入购票月份：")
		val month = StdIn.readInt()
		if (month >= 4 && month <= 10) {
			println("请输入购票人年龄：")
			val age = StdIn.readInt()
			if (age > 60) {
				println("免费")
			}
			else if (age < 18) {
				println("购票价格为：30")
			}
			else {
				println("购票价格为：60")
			}
		}
		else {
			println("请输入购票人年龄：")
			val age = StdIn.readInt()
			if (age > 60) {
				println("免费")
			}
			else if (age < 18) {
				println("购票价格为：20")
			}
			else {
				println("购票价格为：40")
			}
		}
	}

}
