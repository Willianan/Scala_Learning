/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 21:58
	* Project:ScalaLearning
	* FileName:BinarySearch02.scala
	* Version 1.0
	*/


package Chapter19.Search

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks.{breakable,break}

object BinarySearch02 {
	def main(args: Array[String]): Unit = {
		val array = Array(1, 8, 10, 89, 1000, 1000,1000,1000, 1000,1000,1000, 1000,1000,1000, 1000,1000, 1024)
		var resultArr = binarySearch2(array, 0, array.length - 1, 1000)
		resultArr = resultArr.sortBy((x:Int) => x)
		if (resultArr != 0) {
			for (index <- resultArr) {
				println("找到，下标为" + index)
			}
		}
		else {
			println("没有找到")
		}
	}

	def binarySearch2(array: Array[Int],left:Int,right: Int,findValue:Int): ArrayBuffer[Int] ={
		if (left > right) {
			return ArrayBuffer()
		}
		val midIndex = (left + right) / 2
		val midValue = array(midIndex)
		if (midValue > findValue) {
			binarySearch2(array,left,midIndex - 1,findValue)
		}
		else if (midValue < findValue) {
			binarySearch2(array,midIndex + 1,right,findValue)
		}
		else {
			// 定义一个可变数组
			val resultArray = ArrayBuffer[Int]()
			// 向左边扫描
			var temp = midIndex - 1
			breakable{
				while (true){
					if (temp < 0 || array(temp) != findValue) {
						break()
					}
					if (array(temp) == findValue) {
						resultArray.append(temp)
					}
					temp -= 1
				}
			}
			// 将中间这个索引加入
			resultArray.append(midIndex)

			// 向右边扫描
			temp = midIndex + 1
			breakable{
				while (true){
					if (temp > array.length - 1 || array(temp) != findValue) {
						break()
					}
					if (array(temp) == findValue) {
						resultArray.append(temp)
					}
					temp += 1
				}
			}
			return resultArray
		}
	}
}
