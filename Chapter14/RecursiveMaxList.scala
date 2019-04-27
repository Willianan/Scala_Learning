/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 15:13
	* Project:ScalaLearning
	* FileName:RecursiveMaxList.scala
	* Version 1.0
	*/


package Chapter14

object RecursiveMaxList {
	def main(args: Array[String]): Unit = {
		println(myMax(List(1,2,534,4234,6756,23,23)))
	}
	// 使用递归求List中的最大值
	def myMax(xs:List[Int]): Int = {
		// 如果是empty，抛出异常
		if (xs.isEmpty)
			throw new java.util.NoSuchElementException
		if (xs.size == 1) // 如果有一个元素，就是本身
			xs.head
		// 递归时告诉计算机做什么，而不是告诉计算机怎么做（迭代）
		else if (xs.head > myMax(xs.tail)) xs.head else myMax(xs.tail)
	}
}
