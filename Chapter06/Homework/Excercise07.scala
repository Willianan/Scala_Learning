/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 16:15
	* Project:ScalaLearning
	* FileName:Excercise07.scala
	* Version 1.0
	*/


package Chapter6.homework

object Excercise07 {
	def main(args: Array[String]): Unit = {
		println(mi(2,-9))
	}
	def mi(x : Double,n : Int): Double ={
		if ( n == 1) {
			1
		}
		else if (n > 0) {
			x * mi(x,n-1)
		}
		else {
			1/mi(x,-n)
		}
	}
}
