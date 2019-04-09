/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 16:44
	* Project:ScalaLearning
	* FileName:Demo01.scala
	* Version 1.0
	*/


package Chapter3.arithopter

object Demo01 {
	def main(args: Array[String]): Unit = {
		// 1、对于除号（/），它的整数除和小数除是由区别的：整数之间做除法时，只保留整数部分而舍弃小数部分。
		var r1 : Int = 10 / 3
		println("r1 = " + r1)
		var r2 : Double = 10 / 3
		println("r2 = " + r2)
		val r3 : Double = 10.0 / 3
		println("r3 = " + r3)
		println("r3 = " + r3.formatted("%.3f"))

		// % 使用
		// %运算原则： a % b = a - a/b * b
		println(10 % 3)
		println(-10 % 3)
		println(-10 % -3)
		println(10 % -3)

		// ++ 和 --
		// 在Scala中没有++和--，而使用+= 1 和 -= 1
		var num = 10
		//num++
		num += 1
		println(num)
		// num--
		num -= 1
		println(num)
	}

}
