/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 14:54
	* Project:ScalaLearning
	* FileName:ifelse_Multiple.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object ifelse_Multiple {
	/*
	* 参加某次考试的奖励
	* 1、成绩为100分，奖励一辆BMW；
	* 2、成绩在80—99分时，奖励一台iPhone7plus；
	* 3、成绩在60-80分时，奖励一个ipad；
	* 4、不然什么奖励也没有。
	* 5、成绩从控制台输入
	* */
	def main(args: Array[String]): Unit = {
		println("Input your score : ")
		val score = StdIn.readFloat()
		if (score == 100.0) {
			println("BMW")
		}
		else if (score > 80.0 && score <= 99.0) {
			println("iphone 7 Plus")
		}
		else if (score >= 60.0 && score <= 80.0) {
			println("ipad")
		}
		else {
			println("Nothing")
		}
	}
}
/*
* 1、如果{}内的逻辑代码只有一行，大括号可以省略
* 2、Scala中任意表达式都是有返回值的，也就意味着if-else表达式起始是有返回结果的，
* 具体返回结果的值取决于满足条件的代码体的最后一行内容
* 3、scala中没有三元运算符
* */
