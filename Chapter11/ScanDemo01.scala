/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 22:19
	* Project:ScalaLearning
	* FileName:ScanDemo01.scala
	* Version 1.0
	*/


package Chapter11

object ScanDemo01 {
	// 扫描
	//    对某个集合的所有元素做fold操作，但是会把产生的所有的中间结果放置于一个集合中保存
	def main(args: Array[String]): Unit = {
		// (1 to 5).scanLeft(5)(minus)理解为List（5,1,2,3,4,5）-->Vector(5, 4, 2, -1, -5, -10)
		val i1 = (1 to 5).scanLeft(5)(minus)    // IndexedSeq[Int]
		println(i1)       //Vector(5, 4, 2, -1, -5, -10)
		// (1 to 5).scanRight(5)(add)理解为List（1,2,3,4,5,5）-->Vector(20, 19, 17, 14, 10, 5)
		val i2 = (1 to 5).scanRight(5)(add)
		println(i2)      // Vector(20, 19, 17, 14, 10, 5)
	}

	def minus(num1: Int, num2: Int): Int = {
		num1 - num2
	}
	def add(num1:Int,num2:Int): Int ={
		num1 + num2
	}
}
