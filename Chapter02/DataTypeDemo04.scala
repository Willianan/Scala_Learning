/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 14:51
	* Project:ScalaLearning
	* FileName:DataTypeDemo04.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo04 {
	def main(args: Array[String]): Unit = {
		var num1:Float = 2.233243546f
		var num2:Double = 2.233243546
		println("num1 = " + num1 + ",num2 = " + num2)
	}

}
// 浮点类型
// Float[4]:32位，IEEE754标准的单精度浮点数
// Double[8]：64位，IEEE754标准的双精度浮点数
// 1、与整数类型相似，Scala浮点类型也有固定的表数范围和字段长度
// 2、Scala的浮点型常量默认为Double型，声明float型常量，必须加‘f’或‘F’
// 3、浮点型常量有两种表示形式：
//    （1）十进制数形式：5.12，5.12f，.512
//    （2）科学计数法形式：5.12e2
// 4、通常情况下，应该使用Double型