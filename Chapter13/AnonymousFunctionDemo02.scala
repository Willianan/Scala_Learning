/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 20:29
	* Project:ScalaLearning
	* FileName:AnonymousFunctionDemo02.scala
	* Version 1.0
	*/


package Chapter13

object AnonymousFunctionDemo02 {
	def main(args: Array[String]): Unit = {
		// 编写一个匿名函数，可以返回2个整数的和，并输出该匿名函数的类型
		val f1 = (n1:Int,n2:Int) => {
			println("匿名函数被调用....")
			n1 + n2
		}
		println("f1的函数类型为：" + f1)
		println(f1(21,32))
	}
}
