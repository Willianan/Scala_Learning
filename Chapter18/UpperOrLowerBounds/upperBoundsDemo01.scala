/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 14:13
	* Project:ScalaLearning
	* FileName:upperBoundsDemo01.scala
	* Version 1.0
	*/


package Chapter18.UpperOrLowerBounds


object upperBoundsDemo01 {
	def main(args: Array[String]): Unit = {
		val compareInt = new CompareInt(10,40)
		println(compareInt.greater)

		// 第一种用法
		val compareCommon1 = new CompareCommon(Integer.valueOf(10),Integer.valueOf(40))
		println(compareCommon1.greater)

		// 第二种用法
		val compareCommon2 = new CompareCommon(java.lang.Float.valueOf(10.2f),java.lang.Float.valueOf(40.32f))
		println(compareCommon2.greater)

		// 第三种用法:使用了隐式转换
		// implicit def float2Float(x: Float): java.lang.Float         = x.asInstanceOf[java.lang.Float]
		val compareCommon3 = new CompareCommon[java.lang.Float](10.2f,40.32f)
		println(compareCommon3.greater)
	}
}

// 传统的方式
class CompareInt(n1:Int,n2:Int){
	def greater = if (n1 > n2) n1 else n2
}

// 使用上界
// 说明
//    1、[T <: Comparable[T]] 表示T类型是Comparable子类型
//    2、传入的T类型要继承Comparable接口
//    3、可以使用compareTo方法
//    4、通用性比传统方式好
class CompareCommon[T <: Comparable[T]](obj1:T,obj2:T){
	def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
