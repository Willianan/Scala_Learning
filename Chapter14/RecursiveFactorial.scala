/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 15:27
	* Project:ScalaLearning
	* FileName:RecursiveFactorial.scala
	* Version 1.0
	*/


package Chapter14

object RecursiveFactorial {
	def main(args: Array[String]): Unit = {
		println(Factorial(10))
	}
	// 递归方式求阶乘
	def Factorial (n:Int): Int = {
		if (n == 0) 1 else n * Factorial(n - 1)
	}
}
