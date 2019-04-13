/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 14:42
	* Project:ScalaLearning
	* FileName:Exercise02.scala
	* Version 1.0
	*/


package Chapter4.ifelse

import scala.io.StdIn

object Exercise02 {
	/*
	* 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：（1）、年份能被4整除，但不能被100整除；（2）、能被400整除
	* */
	def main(args: Array[String]): Unit = {
		println("Input a year : ")
		val year = StdIn.readInt()
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			println(year + " is a leap year")
		}
		else {
			println(year + " isn't a leap year")
		}
	}

}
