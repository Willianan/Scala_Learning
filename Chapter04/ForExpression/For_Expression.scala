/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/24 16:26
	* Project:ScalaLearning
	* FileName:for_1.scala
	* Version 1.0
	*/


package Chapter4.ForExpression

object For_Expression {
	/*
	* Scala中也有for循环，被称为for推导式或for表达式
	* */
	def main(args: Array[String]): Unit = {
		// 说明
		// 1、start 从哪个数开始循环
		// 2、to 关键字
		// 3、end 循环结束的值
		// 4、start to end 表示前后闭合
		val start = 1
		val end = 10
		for (i <- start to end){
			println(i + ":Hello,World!")
		}

		// 说明：for推导式可以直接对集合进行遍历
		var list = List("hello",10,20,30,"world")
		for (item <- list) {
			print(item + "\t")
		}
	}
	/*
	* i 表示循环的变量，<- 规定 to 规定
	* i 将会从1-3循环，前后闭合区间
	* */
}
