/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 15:38
	* Project:ScalaLearning
	* FileName:ifelse_Nest.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object ifelse_Nest {
	/*
	* 在一个分支结构中有完整的嵌套另一个完整分支结构，里面的分支结构成为内层分支，
	* 外面的分支结构称为外层分支。嵌套分支不要超过3层
	* */


	/*
	* 参加百米运动会，如果用时8秒内进入决赛，并且根据性别提示进入男子组或女子组。
	* */
	def main(args: Array[String]): Unit = {
		println("请输入运动员的成绩：")
		val score = StdIn.readDouble()
		println("请输入运动员的性别：")
		val gender = StdIn.readLine()
		if (score <= 8.0){
			if (gender != "female") {
				println("进入男子组")
			} else {
				println("进入女子组")
			}
		}
		else {
			println("你被淘汰了......")
		}

	}
}
