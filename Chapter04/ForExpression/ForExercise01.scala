/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 19:18
	* Project:ScalaLearning
	* FileName:ForExercise01.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object ForExercise01 {
	/*
	* 打印1-100之间所有是9的倍数的整数的个数及总和
	* 完成下面的表达式输出
	* */
	def main(args: Array[String]): Unit = {
		val start = 1
		val end = 100
		var count = 0
		var sum = 0
		for (i <- start to end if i % 9 == 0) {
			count += 1
			sum += i
		}
		println("Count: " + count + ",Sum: " + sum)

		// 输出一个加法的循环表达式
		val num = 6
		for (i <- 0 to num) {
			printf("%d + %d = %d\n",i,(num - i),num)
		}
	}
}