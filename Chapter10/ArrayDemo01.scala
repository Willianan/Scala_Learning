/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/2 15:23
	* Project:ScalaLearning
	* FileName:ArrayDemo.scala
	* Version 1.0
	*/


package Chapter10
// 数组-定长数组（声明泛型）
object ArrayDemo01 {
	def main(args: Array[String]): Unit = {
		// 第一种方式定义数组
		// 1、创建一个Array对象
		// 2、[Int] 表示泛型，即该数组中只能存放Int类型的数据
		// 3、[Any] 表示该数组可以存放任意类型

		val array1 = new Array[Int](4)
		println(array1.length)

		// 4、在没有赋值情况下，各个元素的值为0
		println("array1(0) = " + array1(0))
		for (i <- array1) {
			println(i)
		}
		println("=====================")
		// 赋值，集合元素采用小括号访问
		array1(3) = 10
		for (i <- array1) {
			println(i)
		}
		println("---------------------------")
		// 第二种方式定义数组
		// 1、使用object Array的apply方法创建数组对象
		// 2、直接初始化数组
		// 3、遍历方式一样

		var array2 = Array(1,3,"xxx")
		for (i <- array2) {
			println(i)
		}
		println("///////////////////////////////")
		// 可以使用下标的方式遍历
		for (i <- 0 until array2.length) {
			println(array2(i))
		}
	}
}
