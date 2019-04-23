/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 14:41
	* Project:ScalaLearning
	* FileName:TupleDemo01.scala
	* Version 1.0
	*/


package Chapter10
// 元组Tuple
/*
* 元组可以理解为一个容器，可以存放各种相同或不同类型的数据，即将多个无关的数据封装为一个整体，称为元组
* 最大的特点：灵活，对数据没有过多的约束
* 注意：元组中最大只能有22个元素
* */

object TupleDemo01 {
	def main(args: Array[String]): Unit = {
		//说明
		//  1、tuple1就是一个Tuple，类型是Tuple4
		//  简单说明：为了高效的操作元组，编译器根据元素的个数不同，对应不同元组类型
		//            分别Tuple1------->Tuple22
		val tuple1 = (1,2,3,4,"hello",5,6)
		println(tuple1)
	}
}
