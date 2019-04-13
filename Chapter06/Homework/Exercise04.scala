/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 15:42
	* Project:ScalaLearning
	* FileName:Exercise04.scala
	* Version 1.0
	*/


package Chapter6.homework

object Exercise04 {
	def main(args: Array[String]): Unit = {
		val n = 3
		val res1 = (0 to n).reverse
		println(res1)                     // return Range(3,2,1,0)

		// foreach
		//foreach function :(f : Int => U),即接受一个输入参数为Int，输出为U的函数
		//说明
		// 1、将res1的每个元素依次遍历出来，传递给println(x)
		res1.foreach(println)
		countDown(6)
	}
	def countDown(n : Int): Unit ={
		//高阶函数特性
		(0 to n).reverse.foreach(println)
	}
}
