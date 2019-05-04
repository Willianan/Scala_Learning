/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/20 17:07
	* Project:ScalaLearning
	* FileName:RecursiveDemo.scala
	* Version 1.0
	*/


package Chapter19.Recursive

object RecursiveDemo {
	def main(args: Array[String]): Unit = {
		test(4)
	}
	def test(n:Int): Unit ={
		if (n > 2) {
			test( n - 1)
		}
		println(" n = " + n)
	}
}
