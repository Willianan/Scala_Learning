/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 16:20
	* Project:ScalaLearning
	* FileName:PartialFunctionDemo01.scala
	* Version 1.0
	*/
package Chapter13

object PartialFunctionDemo01 {
	// 偏函数
	/*
	有一个集合val list = List(1,2,3,4,"abc")，完成如下要求：
		1、将集合list中的所有数字加1，并返回一个新的集合
		2、要求忽略非数字的元素，即返回的新的集合形式为(2,3,4,5)
	*/
	def main(args: Array[String]): Unit = {
		// 思路1：map + filter
		val list = List(1, 2, 3, 4, "abc")
		// 先过滤，在map
		println(list.filter(f1).map(f3).map(f2))

		// 思路2 -- 模式匹配
		val list2 = list.map(addOne2)
		println(list2)
	}

	def f1(n: Any): Boolean = {
		n.isInstanceOf[Int]
	}

	def f2(n: Int): Int = {
		n + 1
	}
	// 将Any ---> Int
	def f3(n: Any): Int = {
		n.asInstanceOf[Int]
	}

	// 思路2 --- 模式匹配
	def addOne2(i:Any): Any ={
		i match {
			case x:Int => x + 1
			case _ =>
		}
	}
}
