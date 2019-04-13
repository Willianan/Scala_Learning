/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/27 15:36
	* Project:ScalaLearning
	* FileName:LazyDemo01.scala
	* Version 1.0
	*/


package Chapter5.Lazy

object LazyDemo01 {
	def main(args: Array[String]): Unit = {
		lazy val res = sum(10,20)
		println("--------------")
		println("res = " + res)           // 在要使用res前，才执行
		}
	// sum函数，返回和
	def sum(n1: Int, n2: Int):Int = {
			println("sum()执行了.......")
			return n1 + n2
	}
}
//惰性函数
//当函数返回值被声明为lazy时，函数的执行将被推迟，直到首次对此取值，该函数才会被执行。
//注意：
//    1、lazy不能修饰var类型的变量
//    2、但是在调用函数时，加了lazy会导致函数的执行被推迟，在声明一个变量时，如果给声明了lazy
//       那么变量值的分配也会推迟。
// 惰性计算：时许多函数式编程语言的特性。惰性集合在需要时提供其元素，无需预先计算。
//好处：
//    1、可以将耗时的计算推迟到绝对需要的时候
//    2、创造无限个集合，只要它们继续收到请求，就会继续提供元素。
//    3、函数的惰性使用能够得到更高效的代码。