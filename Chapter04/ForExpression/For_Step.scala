/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 19:09
	* Project:ScalaLearning
	* FileName:For_Step.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Step {
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 10){
			println("i = " + i)
		}
		// 步长控制为2
		// Range(1,10,2)的对于的构建方法是
		// def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
		println("---------------------")
		for (i <- Range(1,10,2)) {
			println("i = " + i)
		}

		// 控制步长的第二种方式：for循环守卫
		println("**********************")
		for (i <- 1 to 10 if i % 2 == 1) {
			println("i = " + i)
		}
	}
}
