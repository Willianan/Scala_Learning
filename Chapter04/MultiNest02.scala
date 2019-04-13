/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 14:57
	* Project:ScalaLearning
	* FileName:MultiNest02.scala
	* Version 1.0
	*/


package Chapter4

import scala.io.StdIn

object MultiNest02 {
	/*
	*  2、统计三个班及格人数，每个班有5个同学
	*
	* */
	def main(args: Array[String]): Unit = {
		val classNum = 3
		val stuNum = 5
		var score = 0.0
		var classScore = 0.0
		var totalScore = 0.0
		var passNum = 0
		for (i <- 1 to classNum) {
			classScore = 0.0
			for (j <- 1 to stuNum) {
				printf("请输入第%d班级的第%d个学生的成绩\n",i,j)
				score = StdIn.readDouble()
				if (score >= 60) {
					passNum += 1
				}
				classScore += score
			}
			totalScore += classScore
			printf("第%d班级的平均分为：%.2f\n", i, classScore / stuNum)
		}
		printf("所有班级发平均分为：%.2f\n",totalScore / (classNum * stuNum))
		printf("所有班级的及格人数为：%d\n",passNum)
	}
}
