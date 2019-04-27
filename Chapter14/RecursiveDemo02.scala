/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 14:58
	* Project:ScalaLearning
	* FileName:RecursiveDemo02.scala
	* Version 1.0
	*/


package Chapter14

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo02 {
	def main(args: Array[String]): Unit = {
		// 测试耗时
		val now: Date = new Date()
		val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("执行前的时间date = " + date)

		var num = BigInt(1)
		var sum = BigInt(0)
		var res = mx(num,sum)
		println("res = " +  res)

		val now2: Date = new Date()
		val date2 = dateFormat.format(now2)
		println("执行完成的时间date2 = " + date2)

	}

	// 计算1～num的和，递归
	def mx(num:BigInt,sum:BigInt):BigInt = {
		if (num < 999999991) return mx(num + 1,sum + num)
		else return sum
	}
}
