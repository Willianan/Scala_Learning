/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 20:44
	* Project:ScalaLearning
	* FileName:HighOrderDemo02.scala
	* Version 1.0
	*/


package Chapter11

object HighOrderDemo02 {
	def main(args: Array[String]): Unit = {
		test2(sayOK)
		//test2(sub)    // error
	}

	// 说明：test2是一个高阶函数，可以接受一个没有输入，返回为Unit的函数+
	def test2(f: () => Unit) = {
		f()
	}

	def sayOK() = {
		println("sayOK.....")
	}

	def sub(n1: Int): Unit = {
	}
}
