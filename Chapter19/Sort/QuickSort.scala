/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 19:52
	* Project:ScalaLearning
	* FileName:QuickSort.scala
	* Version 1.0
	*/


package Chapter19.Sort

import java.text.SimpleDateFormat
import java.util.Date
import util.control.Breaks.{break,breakable}

object QuickSort {
	/*
	快速排序时对冒泡排序的一种改进
		快速排序基本思想：通过一趟排序将要排序的数据分割成对立的两个部分，其中一部分的所有数据都比另外一部分
		的数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据
		变成有序序列

	 */
	def main(args: Array[String]): Unit = {
		// 数组
		// 创建一个8w个随机数据的数组
		val random = new util.Random()
		val array = new Array[Int](8000000)
		for (i <- 0 until 8000000) {
			array(i) = random.nextInt(8000000)
		}
		println("排序前")
		val now:Date = new Date()
		val dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("排序前时间为：" + date)
		//println(array.mkString(" "))

		quickSort(0,array.length-1,array)

		println("排序后")
		//println(array.mkString(" "))
		val now2:Date = new Date()
		val date2 = dateFormat.format(now2)
		println("排序后的时间：" + date2)
	}

	def quickSort(left: Int, right: Int, array: Array[Int]): Unit = {
		/* 
		 * @functional description: 快速排序方法
		 * @param left:指定数组的左边的下标[0]
		 * @param right:指定数组的右边的下标[array.length - 1]
		 * @param array:待排序的数组
		 * @return: 排序后的数组
		 * @Author:Charles Van
		 * @Date:2019/4/21 20:06
		 */
		var l = left
		var r = right
		var pivot = array((left + right) / 2) // 以中间的值为基准进行分割
		var temp = 0
		breakable {
			while (l < r) { // 把比pivot小的数放在左边，比pivot大的数放在右边
				while (array(l) < pivot) { // 从左边找一个比pivot小的值对应的下标
					l += 1
				}
				while (array(r) > pivot) {
					// 从右边找一个比pivot大的值对应的下标
					r -= 1
				}
				if (l >= r) {
					break()
				}
				temp = array(l)
				array(l) = array(r)
				array(r) = temp
				if (array(l) == pivot) {
					r -= 1
				}
				if (array(right) == pivot) {
					l += 1
				}
			}
		}
		if (l == r) {
			l += 1
			r -= 1
		}
		if (left < r) {
			quickSort(left, r, array)
		}
		if (right > l) {
			quickSort(l, right, array)
		}
	}
}
