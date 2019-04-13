/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/26 15:50
	* Project:ScalaLearning
	* FileName:Exercise03.scala
	* Version 1.0
	*/


package Chapter5.Recursive

object Exercise03 {
	def main(args: Array[String]): Unit = {
		//猴子吃桃子问题
		/*
		* 有一堆桃子，猴子第一天吃了其中的一半，并在多吃了一个，以后每天猴子都吃其中的一半，然后再多一个。
		* 当到第十天时，想再吃时，发现只有1个桃子。问题：最初共有多少个桃子
		* */
		println(peach(1))
	}
	def peach(day : Int) : Int = {
		if ( day == 10) {
			1
		}
		else {
			2 * (peach(day+1) + 1)
		}
	}
}
