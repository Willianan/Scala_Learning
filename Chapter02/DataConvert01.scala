/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 16:13
	* Project:ScalaLearning
	* FileName:DataConvert01.scala
	* Version 1.0
	*/


package Chapter2

object DataConvert01 {
	def main(args: Array[String]): Unit = {
		var n1 = 10
		var n2 = 1.2f
		// 1、多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
		var n3 = n1 + n2
		println(n3)
		// 2、把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之会进行自动类型转换。
		// 3、（byte 、short）和char之间不会互相转换。
		var n4:Byte = 10
		var char1:Char = n4.toChar
		println(char1)
		// 4、byte、short、char三者可以计算，子啊计算时首先转换为Int类型
		var b : Byte = 10
		var c : Char = 90
		//var s : Short = b + c//false
		//var s2 : Short = 10 + 90//false
		var s3 : Short = 100
		// 5、自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
	}

}

// 值类型转换
// Scala程序在进行赋值或运算时，精度小的类型自动转换为精度大的数据类型，这就是自动类型转换（隐式转换）
