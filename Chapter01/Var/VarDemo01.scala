/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 20:16
	* Project:ScalaLearning
	* FileName:VarDemo01.scala
	* Version 1.0
	*/


package Chapter1.Var

object VarDemo01 {
	def main(args: Array[String]): Unit = {
		//变量
		//scala中，小数默认为Double，整数默认为Int
		// 编译器：动态的（逃逸分析）
		var a: Int = 1
		var b: Int = 3
		b = 89
		println("a = " + a)
		println("b = " + b)
	}
}

