/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 22:26
	* Project:ScalaLearning
	* FileName:OrderSearch.scala
	* Version 1.0
	*/


package Chapter19.Search

object OrderSearch {
	def main(args: Array[String]): Unit = {
		val array = Array(1,8,10,89,89,1000,1024)
		val index = orderSearch(array,89)
		if (index != -1){
			println("找到，下标为" + index)
		}
		else {
			println("没有找到")
		}
	}
	def orderSearch(array: Array[Int],value:Int): Int ={
		for (i <- 0 until array.length){
			if (array(i) == value) {
				return i
			}
		}
		-1
	}
}
