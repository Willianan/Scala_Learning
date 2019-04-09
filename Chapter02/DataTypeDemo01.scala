/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 21:00
	* Project:ScalaLearning
	* FileName:DataTypeDemo01.scala
	* Version 1.0
	*/


package Chapter2

object DataTypeDemo01 {
	def main(args: Array[String]): Unit = {
		// 在Scala中数据类型都是对象
		// Scala数据类型分为两大类：AnyVal（值类型）和AnyRef（引用类型）
		// 注：不管是AnyVal还是AnyRef都是对象
		var num1:Int = 10
		// 因为Int是一个类，因此其实例可以使用很多方法
		// 在Scala中，如果一个方法没有形参，则可以省略
		println("num1 = " + num1)
		println(num1.toDouble + "\t" + num1.toString)
		var char1:Char = 'a'
		println("char1的code = "+char1.toInt)
		var isPass = true
		println(isPass.toString)
	}

}
// 1、 在Scala中有一个跟类型Any，是所有类发父类
// 2、Scala中一切皆为对象，分为两大类：AnyVal（值类型）和AnyRef（引用类型），都是Any子类
// 3、Null类型是Scala的特别类型，它只有一个值null，它是bottom class，是所有AnyRef类型的子类
// 4、Nothing类型也是bottom class，是所有类型的子类，在开发中通常可以将Nothing类型的值返回给
// 任意变量或函数，这里抛出异常使用很多。
// 5、在Scala中仍然遵守低精度值向高精度值自动转换（implicit conversion）隐式转换。