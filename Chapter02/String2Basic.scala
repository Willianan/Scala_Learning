/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 14:28
	* Project:ScalaLearning
	* FileName:String2Basic.scala
	* Version 1.0
	*/


package Chapter2

object String2Basic {
	def main(args: Array[String]): Unit = {
		val d1 = 1.2
		// 1、基本数据类型转String
		val s1 = d1 + ""//以后看到有下划线，就表示编译器做了转换

		// String类型转基本数据类型
		val s2 = "12"
		val num1 = s2.toInt
		val num2 = s2.toByte
		val num3 = s2.toDouble
		val num4 = s2.toLong
		println("Ok······")
		// 2、String转基本数据类型
		// （1）在String类型转成基本数据类型时，要确保String类型能够转成有效的数据
		// 例如：可以把"123"转成一个整数，但是不能把"hello"转成一个整数
		//		val s3 = "Hello"
		//		println(s3.toInt)
		// （2）在Scala中，不是将小数点后的数据进行截取，而是会抛出异常
		val s4 = "12.5"
		//println(s4.toInt)//  error
		println(s4.toDouble)

	}

}
