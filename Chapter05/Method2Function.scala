/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 16:12
	* Project:ScalaLearning
	* FileName:Method2Function.scala
	* Version 1.0
	*/


package Chapter5

object Method2Function {
	def main(args: Array[String]): Unit = {
		// 使用方法
		// 创建一个新对象
		val operation = new Operation
		println(operation.sum(10,20))

		// 方法转函数
		val f1 = operation.sum _
		println("f1 = " + f1)
		println("f1 = " + f1(50,60))


		// 函数，求两个数的和
		val f2 = (n1:Int,n2:Int) => {
			n1 + n2       // 函数体
		}
		println("f2 = " + f2)
		println("f2 = " + f2(20,30))
	}
}

class Operation{
	def sum(n1:Int,n2:Int): Int = {
		n1 + n2
	}
}

// 1、在Scala中，方法和函数几乎可以等同（比如：定义，使用，运行机制），只是函数的使用方式更加的灵活多样（方法转函数）
// 2、函数式编程是从编程方式（范式）的角度来谈的，可以这样理解：函数式编程把函数当作一等公民，充分利用函数，
//    支持的函数的多种函数使用方式（在Scala中，函数就像变量一样，既可以作为函数的参数使用,也可以将函数赋值给一个变量，
//    函数的创建不用依赖类或者对象。）
// 3、面向对象编程是以对象为基础的编程方式
// 4、在Scala中函数式编程和面向对象编程融合在一起了

