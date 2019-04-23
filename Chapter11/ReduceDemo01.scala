/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 21:29
	* Project:ScalaLearning
	* FileName:ReduceDemo01.scala
	* Version 1.0
	*/


package Chapter11

object ReduceDemo01 {
	// 化简
	// 将二元函数引用于集合中的函数
	def main(args: Array[String]): Unit = {
		val list = List(1,20,30,4,5)
		/*
		* 说明
		*   1、def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B
		*   2、reduceLeft(f)接收的函数需要的形式为op: (B, A) => B): B
		*   3、reduceLeft(f)的运算规则：从左开始执行，将得到的结果返回给第一个参数，然后继续和下一个
		*     元素运算，将得到的结果继续返回给第一个参数，继续.....
		*
		* */
		val res = list.reduceLeft(sum)
		println("res = " + res)
	}

	def sum(n1: Int, n2: Int): Int = {
		n1 + n2
	}
}
