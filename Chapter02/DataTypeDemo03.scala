/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 14:37
	* Project:ScalaLearning
	* FileName:DataTypeDemo03.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo03 {
	def main(args: Array[String]): Unit = {
		println("long的值域：" + Long.MinValue + "~" + Long.MaxValue)
	}
}

// 整型的类型
// Byte[1]:8位有符号补码整数。数值区间：-128~127
// Short[2]:16位有符号补码整数。数值区间：-32768~32767
// Int[4]:32位有符号补码整数。数值区间：-2147483648~2147483647
// Long[8]:64位有符号补码整数。数值区间：-9223372036854775808~9223372036854775807

// Scala各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证Scala程序的可移植性。
// Scala的整型 常量/字面量 默认为Int型，声明Long型 常量/字面量 必须加‘l’或‘L’
// Scala程序中变量常声明为Int型，除法不足以表示大叔，才使用Long型