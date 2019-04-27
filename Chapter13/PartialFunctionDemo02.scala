/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 19:18
	* Project:ScalaLearning
	* FileName:PartialFunctionDemo02.scala
	* Version 1.0
	*/


package Chapter13
// 偏函数
/*
	1、在对符合某个条件，而不是所有情况进行逻辑操作时，使用偏函数
	2、将包在大括号内的一组case语句封装为函数，称之为偏函数，只对会作用于指定类型的参数或指定范围值的参数
		 实施计算，超出范围的值会忽略（未必会忽略，这取决于程序员怎么处理）
	3、偏函数在Scala中是一个特质PartialFunction
*/
object PartialFunctionDemo02 {
	def main(args: Array[String]): Unit = {
		val list = List(1,2,3,4,"abc")
		//说明
		//  1、new PartialFunction[Any,Int] 表示偏函数接收的参数类型是Any，返回类型是Int
		//  2、isDefinedAt(any: Any)如果返回true，就会去调用apply构建对象实例，如果是false，过滤
		//  3、apply(any: Any) 构造器，对传入的值+1，并返回（新的集合）
		val partialFun = new PartialFunction[Any,Int] {
			override def isDefinedAt(x: Any)= x.isInstanceOf[Int]
			override def apply(v1: Any) = v1.asInstanceOf[Int] + 1
		}
		//使用偏函数
		//说明：如果是使用偏函数，则不能使用map，应该使用collect
		//  1、遍历list所有元素
		//  2、然后调用 val element = if(partialFun-isDefinedAt(list单个元素)){partialFun-apply(list单个元素)}
		//  3、每得到一个element，放入到新的集合，最后返回
		val list1 = list.collect(partialFun)
		println("list1 = " + list1)
	}
}
