/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/21 16:34
	* Project:ScalaLearning
	* FileName:DataConvert02.scala
	* Version 1.0
	*/


package Chapter2

object DataConvert02 {
	def main(args: Array[String]): Unit = {
		// 1、当进行数据的从大--->小，就需要使用强制转换
		// 2、强转符号只针对与最近的操作数有效，往往会使用小括号提升优先级
		val num1 : Int = 10 * 3.5.toInt + 6 * 1.5.toInt
		val num2 : Int = (10 * 3.5 + 6 * 1.5).toInt
		println(num1 + "  " + num2)
		// 3、Char类型可以保存Int的常量值，但不能保存Int的变量值，需要强转
		// 4、Byte和Short类型在进行计算时，当作Int类型处理。
	}

}
// 强制类型转换
// 自动类型转换的逆过程，将精度大的数据类型转换成精度小的数据类型。使用时要加上强制转函数
// 但是可能造成精度降低或溢出