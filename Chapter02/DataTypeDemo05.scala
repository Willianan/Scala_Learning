/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 15:01
	* Project:ScalaLearning
	* FileName:DataTypeDemo05.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo05 {
	def main(args: Array[String]): Unit = {
		var char1:Char = 97
		println("Char1 = " + char1)
		//var c2:Char = 'a' + 1
		//var c3:Char = 97 + 1
		var c4:Char = 98
		//var c5:Char = 99999
		//原因分析
		// 1、当把一个计算的结果赋值一个变量，则编译器会进行类型转换及判断（即会看范围+类型）
		// 2、当把一个字面量赋值一个变量，则编译器会进行范围的判定
	}

}
// 字符类型
// char[2]:16位无符号Unicode字符，区间值：U+0000 ~ U+FFFF

// 1、字符常量是用单引号括起来的单个字符
// 2、 Scala也允许使用转义字符'\'来将其后的字符转变位特殊字符型常量。
// 3、可以直接给Char赋值整数，然后输出时，会按照对应的Unicode字符输出
// 4、Char类型时可以进行运算的，相当于一个整数，因为有对应Unicode码,码值表包含ascii码