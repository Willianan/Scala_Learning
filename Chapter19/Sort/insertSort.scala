/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 16:57
	* Project:ScalaLearning
	* FileName:insertSort.scala
	* Version 1.0
	*/


package Chapter19.Sort


import java.text.SimpleDateFormat
import java.util.Date

object insertSort {
	/*
		插入排序介绍
				插入排序属于内部排序法，是对于待排序的元素以插入的方式找寻该元素的适当位置，以达到排序的目的。
		插入排序法思想
				插入排序的基本思想是:把n个待排序的元素看成为一个有序表和一个无序表，开始时有序表中只包含一个元素，
				无序表中包含有n-1个元素，排序过程中每次从无序表中取出第一个元素，把它的排序码依次与有序表元素的
				排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
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
		val now: Date = new Date()
		val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("排序前时间为：" + date)
		println(array.mkString(" "))

		InsertSort(array)

		println("排序后")
		println(array.mkString(" "))
		val now2: Date = new Date()
		val date2 = dateFormat.format(now2)
		println("排序后的时间：" + date2)
	}

	def InsertSort(array: Array[Int]): Unit = {
		for (i <- 1 until array.length) {
			var insertVal = array(i)
			var insertIndex = i - 1 // 表示有序表的最后这个元素的下标
			// 还没有找到位置
			while (insertIndex >=0 && insertVal < array(insertIndex)) {
				array(insertIndex + 1) = array(insertIndex)
				insertIndex -= 1
			}
			array(insertIndex + 1) = insertVal
		}
	}
}
