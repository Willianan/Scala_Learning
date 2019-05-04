/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 16:05
	* Project:ScalaLearning
	* FileName:bubbleSort.scala
	* Version 1.0
	*/


package Chapter19.Sort

import java.text.SimpleDateFormat
import java.util.Date

object bubbleSort {
	/*
			冒泡排序
				基本思想：通过对待排列序列从后往前（从下标较大的元素开始），依次比较相邻元素的排序码，
						若发现逆序则交换，是排序码较小的元素逐渐从后部移向前部（从下标较大的单元移向下标较小
						的单元）
			因为排序的过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行过交换，说明序列有序，因此
			要在排序过程中设置一个标志flag判断元素是否进行过交换，从而减少不必要的比较。

		*/
	def main(args: Array[String]): Unit = {
		// 数组
		// 创建一个8w个随机数据的数组
		val random = new util.Random()
		val array = new Array[Int](80000)
		for (i <- 0 until 80000) {
			array(i) = random.nextInt(8000000)
		}
		println("排序前")
		val now:Date = new Date()
		val dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("排序前时间为：" + date)
		println(array.mkString(" "))

		BubbleSort(array)

		println("排序后")
		println(array.mkString(" "))
		val now2:Date = new Date()
		val date2 = dateFormat.format(now2)
		println("排序后的时间：" + date2)
	}
	def BubbleSort(array: Array[Int]): Unit = {
		for (i <- 0 until array.length-1){
			for (j <- 0 until array.length-1 - i){
				if (array(j) > array(j + 1)) {
					val temp = array(j)
					array(j) = array(j + 1)
					array(j + 1) = temp
				}
			}
		}
	}
}
