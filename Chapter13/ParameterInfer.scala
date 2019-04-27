/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 21:13
	* Project:ScalaLearning
	* FileName:ParameterInfer.scala
	* Version 1.0
	*/


package Chapter13

object ParameterInfer {
	//参数（类型）推断
	//参数推断省去类型信息（在某些情况下[需要有应用场景]，参数类型是可以推断出来的），同时
	//也可以进行相应的简写
	/*
	* 参数类型推断写法说明
	*   1、参数类型是可以推断的，可以省略参数类型
	*   2、但传入的函数，只有单个参数时，可以省略括号
	*   3、如果变量只在=> 右边出现一次，可以用_来代替
	* */
	def main(args: Array[String]): Unit = {
		val list = List(1,2,3,4)
		println(list.map((x:Int) => x + 1))
		println(list.map((x) => x + 1))
		println(list.map(x => x + 1))
		println(list.map(_ + 1))
		val res = list.reduce(_ + _)
		println(res)
	}
}
