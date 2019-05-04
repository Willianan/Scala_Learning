/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 21:36
	* Project:ScalaLearning
	* FileName:BinarySearch.scala
	* Version 1.0
	*/


package Chapter19.Search

object BinarySearch {
	def main(args: Array[String]): Unit = {
		val array = Array(1,8,10,89,1000,1024)
		val index = binarySearch(array,0,array.length - 1,1024)
		if (index != -1) {
			println("找到，下标为" + index)
		}
		else {
			println("没有找到")
		}

	}
	/*
		二分查找思路：
			1、先找到中间值
			2、然后将中间值和查找值比较
				2.1、相等，找出
				2.2、中间值 > 查找值，向左进行递归查找
				2.3、中间值 < 查找值，向右进行递归查找
	 */
	def binarySearch(array: Array[Int],left:Int,right: Int,findValue:Int): Int ={
		if (left > right) {
			return -1
		}
		val midIndex = (left + right) / 2
		val midValue = array(midIndex)
		if (midValue > findValue) {
			binarySearch(array,left,midIndex - 1,findValue)
		}
		else if (midValue < findValue) {
			binarySearch(array,midIndex + 1,right,findValue)
		}
		else {
			return midIndex
		}
	}
}
