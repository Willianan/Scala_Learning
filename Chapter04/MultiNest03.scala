/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 15:04
	* Project:ScalaLearning
	* FileName:MultiNest03.scala
	* Version 1.0
	*/


package Chapter4

object MultiNest03 {
	/*
	* 3、打印九九乘法表
	* */
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 9) {
			for (j <- 1 to i) {
				printf("%d * %d = %d\t\t",j,i,i * j)
			}
			println()
		}
	}
}
