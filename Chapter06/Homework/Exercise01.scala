/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 15:32
	* Project:ScalaLearning
	* FileName:Exercise01.scala
	* Version 1.0
	*/


package Chapter6.homework

object Exercise01 {
	def main(args: Array[String]): Unit = {
		println(signum(20))
		println(signum(0))
		println(signum(-23))
	}
	def signum(num : Int): Int = {
		if (num > 0){
			1
		}
		else if (num < 0) {
			-1
		}
		else {
			0
		}
	}
}
