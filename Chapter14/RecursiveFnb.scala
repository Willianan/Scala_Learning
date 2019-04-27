/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 15:30
	* Project:ScalaLearning
	* FileName:RecursiveFnb.scala
	* Version 1.0
	*/


package Chapter14

object RecursiveFnb {
	def main(args: Array[String]): Unit = {
		var count = BigInt(0)
		println(Fnb(20))
		println("递归的次数是：" + count)

		// 递归求斐波那契数列
		// 递归次数的增长:d递归的次数呈指数增长
		def Fnb (n:BigInt): BigInt = {
			count += 1
			if (n == 1 || n == 2) 1 else Fnb(n - 1) + Fnb(n - 2)
		}
	}
}
