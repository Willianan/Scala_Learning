/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 19:54
	* Project:ScalaLearning
	* FileName:PartialFunctionDemo03.scala
	* Version 1.0
	*/


package Chapter13

object PartialFunctionDemo03 {
	//偏函数的简化
	// 声明偏函数，需要重写特质中的方法
	def main(args: Array[String]): Unit = {
		val list = List(1, 2, 3, 4, "hello")
		// 简化形式1
		val list1 = list.collect(f2)
		println(list1)
		// 简化形式2
		val list2 = list.collect { case i: Int => i + 1 }
		println(list2)
	}
	def f2: PartialFunction[Any, Int] = {
		case i: Int => i + 1 // case语句可以字段转换为偏函数
	}
}
