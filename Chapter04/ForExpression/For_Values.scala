/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 18:48
	* Project:ScalaLearning
	* FileName:For_Values.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Values {
	def main(args: Array[String]): Unit = {
		// 说明
		// 1、对1 to 10进行遍历
		// 2、yield i 将每次循环得到i放入集合Vector中，并返回给res
		// 3、i，这里是一个代码块，这就意味着可以对i进行处理
		val res = for (i <- 1 to 10) yield i
		println(res)
		// 下面的这个方式，体现出Scala一个重要的语法特点，
		// 就是将一个集合中各个数据进行处理，并返回给新的集合
		val res1 = for (i <- 1 to 12) yield {
			if (i % 2 == 0) {
				i * 3
			}
			else {
				i
			}
		}
		println(res1)
	}
// 将遍历过程中处理的结果返回到一个新的Vector集合中，使用yield关键字
}
