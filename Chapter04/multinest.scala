/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 14:36
	* Project:ScalaLearning
	* FileName:multinest.scala
	* Version 1.0
	*/


package Chapter4

import scala.io.StdIn

object multinest {
	/*
	*  1、统计三个班成绩情况，每个班有5个同学，求出各个班的平均分和所有班级的平均分
	*     （学生成绩从键盘输入）
	*     分析思路
	*     （1）classnum 表示班级个数，stusum表示学生个数
	*     （2）classscore 表示各个班级总成绩 totalscore 表示所有班级总分
	*     （3）score 表示各个学生成绩
	*     （4）使用循环的方式输入成绩
	* */
	def main(args: Array[String]): Unit = {
		val classNum = 3
		val stuNum = 5
		var score = 0.0
		var classScore = 0.0
		var totalScore = 0.0
		for (i <- 1 to classNum) {
			classScore = 0.0
			for (j <- 1 to stuNum) {
				printf("请输入第%d班级的第%d个学生的成绩\n",i,j)
				score = StdIn.readDouble()
				classScore += score
			}
			totalScore += classScore
			printf("第%d班级的平均分为：%.2f\n", i, classScore / stuNum)
		}
		printf("所有班级发平均分为：%.2f\n",totalScore / (classNum * stuNum))
	}
}
