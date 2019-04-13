/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/27 20:08
	* Project:ScalaLearning
	* FileName:ThrowDemo.scala
	* Version 1.0
	*/


package Chapter5.ExceptionHandling


object ThrowDemo {
	def main(args: Array[String]): Unit = {
		val res1 = test()
		println(res1.toString)
	}
	def test (): Nothing = {
		throw new Exception("不对")
	}
}
