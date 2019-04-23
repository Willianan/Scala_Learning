/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 20:16
	* Project:ScalaLearning
	* FileName:MapOperateDemo02.scala
	* Version 1.0
	*/


package Chapter11

object HighOrderDemo01 {
	//集合元素的映射 --- Map映射操作
	/*
	* 在Scala中，通过map映射操作来解决：将集合中的每一个元素通过指定功能（函数）映射（转换）成新的
	* 结果集合，这里起始就是所谓的将函数作为参数传递给另外一个函数，这是函数式编程的特点
	* */
	//	def map[B](f:(A) => B):HashSet[B]  // map函数的签名
	//  1、这个就是map映射函数集合类型都有
	//  2、[B]是泛型
	//  3、map是一个高阶函数（可以接受一个函数的函数，就是高阶函数），可以接受函数f:(A) => B
	//  4、HashSet[B]就是返回新的集合
	def main(args: Array[String]): Unit = {
		// 使用高阶函数
		val res = test(sum,3.5)
		println("res = " + res)

		// 在Scala中，可以把一个函数直接符给一个变量，但是不执行函数（加下划线）
		val f1 = myPrint _
	}

	def myPrint(): Unit ={
		println("hello world!")
	}
	/*
	* 说明
	*   1、test就是一个高阶函数
	*   2、f: Double => Double 表示一个函数，该函数可以接受一个Double，返回Double
	*   3、n1: Double 普通参数
	*   4、f(n1) 在test函数中，执行传入的函数
	* */
	def test(f: Double => Double,n1: Double) ={
		f(n1)
	}
	def sum(d: Double): Double = {
		d + d
	}
}
