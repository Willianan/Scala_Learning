/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 15:48
	* Project:ScalaLearning
	* FileName:homework01.scala
	* Version 1.0
	*/


package Chapter4.Exercise

import util.control.Breaks._

object homework01 {
	def main(args: Array[String]): Unit = {
		/*
		* 100以内的数求和，求除当和第一次大于20的当前数（for）
		* */
		var sums = 0
		breakable {
			for (i <- 1 to 100) {
				sums += i
				if (sums > 20) {
					println("第一次大于20的当前数:" + i)
					break()
				}
			}
		}
		// 循环守卫
		var loop = true
		var sum2 = 0
		println("===========================")
		for (i <- 1 to 100 if loop == true) {
			sum2 += i
			if (sum2 > 20){
				println("第一次大于20的当前数:" + i)
				loop = false
			}
		}
	}
}
