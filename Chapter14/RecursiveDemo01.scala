/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 14:44
	* Project:ScalaLearning
	* FileName:RecursiveDemo01.scala
	* Version 1.0
	*/


package Chapter14

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo01 {
	def main(args: Array[String]): Unit = {
		// 计算1～num的和，使用常规的while完成
		val now: Date = new Date()
		val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("执行前的时间date = " + date)

		var res = BigInt(0)   // 存放计算结果
		var num = BigInt(1)
		var maxVal = BigInt(999999991)// 测试效率
		while (num <= maxVal) {
			res += num
			num += 1
		}
		println("res = " + res)

		val now2: Date = new Date()
		val date2 = dateFormat.format(now2)
		println("执行完成的时间date2 = " + date2)
	}
}
