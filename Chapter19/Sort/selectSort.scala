/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 16:28
	* Project:ScalaLearning
	* FileName:selectionSort.scala
	* Version 1.0
	*/


package Chapter19.Sort

import java.text.SimpleDateFormat
import java.util.Date

object selectSort {
	/*
		选择排序基本介绍
				选择排序也属于内部排序法，是从待排序的数据中，按指定的规则选出某一元素，经过
				和其他元素重整，在依规定交换位置后达到排序的目的
		基本思想：第一次从R[0]～R[n-1]	中选出最小值，与R[0]交换，第二次从R[1]～R[n-1]中选出最小值，
				与R[1]交换，第三次从R[2]～R[n-1]中选择最小值与R[2]交换，······第i次从R[i-1]～R[n-1]
				中选出最小值与R[i-1]交换，······，第n-1次从R[n-2]～R[n-1]中选择最小值与R[n-2]交换，
				总共通过n-1次，得到一个按排序码从小到大的有序序列
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

		SelectSort(array)

		println("排序后")
		println(array.mkString(" "))
		val now2:Date = new Date()
		val date2 = dateFormat.format(now2)
		println("排序后的时间：" + date2)
	}
	def SelectSort(array: Array[Int]): Unit ={
		for (i <- 0 until array.length - 1) {
			var min = array(i)
			var minIndex = i
			for (j <- (i + 1) until array.length) {
				if (min > array(j)) {
					min = array(j)
					minIndex = j
				}
			}
			if (minIndex != i) {
				array(minIndex) =array(i)
				array(i) = min
			}
		}
	}
}
