/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 17:00
	* Project:ScalaLearning
	* FileName:WordCount.scala
	* Version 1.0
	*/


package Chapter16

object WordCount extends App {
	/*
		val lines = List("atguigu han hello","atguigu han aaa aaa aaa aaa ccc ddd uuu")
		使用映射集合，list中，各个单词出现的次数，并按出现次数排序
	 */
	val lines = List("atguigu han hello", "atguigu han aaa aaa aaa aaa ccc ddd uuu")
	// val res = lines.flatMap((s: String) => s.split(" "))
	val res1 = lines.flatMap(_.split(" "))
	println("res1 = " + res1)
	// 对偶List => 分组统计
	//val res2 = res1.map((s:String) => (s,1))
	val res2 = res1.map((_,1))
	println("res2 = " + res2)
	// 分组，把不同的单词归属到不同的组
	//val res3 = res2.groupBy((x:(String,Int)) => x._1)
	val res3 = res2.groupBy(_._1)
	println("res3 = " + res3)
	// 对元组进行统计
	//val res4 = res3.map((x:(String,List[(String,Int)])) =>(x._1,x._2.size))
	val res4 = res3.map(x =>(x._1,x._2.size))
	println("res4 = " + res4)
	// 排序
	//val res5 = res4.toList.sortBy((x:(String,Int)) => x._2)
	val res5 = res4.toList.sortBy(_._2).reverse
	println("res5 = " + res5)

	// 合并
	println("-------------------------------------------------------")
	println(lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(x =>(x._1,x._2.size)).toList.sortBy(_._2).reverse)
}
