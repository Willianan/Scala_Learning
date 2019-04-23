/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 14:22
	* Project:ScalaLearning
	* FileName:StreamDemo01.scala
	* Version 1.0
	*/


package Chapter11

object StreamDemo01 {
	// 扩展 -- 流（Stream）
	/*
	* stream是一个集合。这个集合可以用于存放无穷多个元素，但是这无穷个元素并不会一次性产生出来，而是
	* 需要用到多大的区间，就会动态的生产，末尾元素遵循lazy原则（即：要使用结果才进行计算的）
	* */
	def main(args: Array[String]): Unit = {
		val stream1 = numsForm(1)
		println(stream1)
		// 取出第一个元素
		println("head = " + stream1.head)
		// 使用tail，会动态的向stream集合按照规则生成新的元素
		println(stream1.tail)
		println(stream1)
		// 如果使用流集合，就不能使用last属性，如果使用last，集合就会进行无限循环

		// 使用map映射stream的元素并进行一些计算
		println(numsForm(5).map(multi))
	}
	/*
		说明
			1、Stream集合存放的数据类型是BigInt
			2、numsForm是自定义的一个函数
			3、创建的集合的第一个元素是n，后续元素生产的规则是n+1
			4、后续元素生成的规则是可以由程序员指定的
	*/
	def numsForm(n:BigInt): Stream[BigInt] ={
		//  def #::[B >: A](hd: B): Stream[B] = cons(hd, tl)
		n #:: numsForm(n+1)
	}

	def multi(x:BigInt): BigInt ={
		x * x
	}
}
