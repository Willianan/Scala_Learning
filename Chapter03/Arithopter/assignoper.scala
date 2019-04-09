/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 20:46
	* Project:ScalaLearning
	* FileName:assignoper.scala
	* Version 1.0
	*/


package Chapter3.arithopter

object assignoper {
	def main(args: Array[String]): Unit = {
		var num = 2
		num <<= 2 // num = 8
		num >>= 1 // num = 4
		println("num = " + num)
		// 在Scala中支持代码块，返回值
		// 赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值/字面量
		val res = {
			if (num > 1)
				"hello,ok"
			else
				100
		}
		println("res = " + res)
		// 有两个变量：a和b，要求将其进行交换，但是不允许使用中间变量，最终打印结果
		var a = 10
		var b = 20
		a = a + b
		b = a - b   // ==> (a+b)-b = a
		a = a - b   // ==> (a+b)-a = b
		//位运算


	}

}
