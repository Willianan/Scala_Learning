/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 21:20
	* Project:ScalaLearning
	* FileName:DataTypeDemo02.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo02 {
	def main(args: Array[String]): Unit = {
		//println(sayHello)

		var num = 1.2
		var num2 = 1.7f
		//num2 = num // error: num is Double num2 is Float
		num2 = num.toFloat
		println(num2)

	}

	// 比如开发中，有一个方法就会异常中断，这时就可以返回Nothing
	// 即当Nothing作返回值，就是明确说明该方法没有正常返回值
	def sayHello: Nothing = {
		throw new Exception("抛出异常")
	}
}
