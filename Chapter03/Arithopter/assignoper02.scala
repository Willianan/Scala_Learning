/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 21:10
	* Project:ScalaLearning
	* FileName:assignoper02.scala
	* Version 1.0
	*/


package Chapter3.arithopter

object assignoper02 {
	def main(args: Array[String]): Unit = {
		/*
		*  求两个数的最大值
		*  求三个数的最大值
		* */
		val n1 = 4
		val n2 = 8
		var res = if (n1 > n2) n1 else n2
		println("res = " + res)
		val n3 = 11
		var res1 = if (res > n3) res else n3
		println("res1 = " + res1)
	}

}

// 运算符的优先级
// 1、()、[]
// 2、单目运算
// 3、算术运算符
// 4、移位运算符
// 5、比较运算符（关系运算符）
// 6、 位运算符
// 7、 关系运算符
// 8、赋值运算符
// 9、,
