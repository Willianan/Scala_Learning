/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 20:35
	* Project:ScalaLearning
	* FileName:MergeSort.scala
	* Version 1.0
	*/


package Chapter19.Sort

import java.text.SimpleDateFormat
import java.util.Date

object MergeSort {
	/*
		归并排序（Merge-Sort）介绍
			归并排序是利用归并的思想实现的排序方法，该算法采用经典的分治（divide-and-conquer）策略（分治法将问题
			分[divide]成一些小的问题然后递归求解，而治[conquer]的阶段则将分的阶段得到的各答案“修补”在一起，即分而治之）
	 */
	def main(args: Array[String]): Unit = {
		// 数组
		// 创建一个8w个随机数据的数组
		val random = new util.Random()
		val array = new Array[Int](80000)
		val temp = new Array[Int](array.length)
		for (i <- 0 until 80000) {
			array(i) = random.nextInt(8000000)
		}
		println("排序前")
		val now:Date = new Date()
		val dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val date = dateFormat.format(now)
		println("排序前时间为：" + date)

		mergeSort(array,0,array.length - 1,temp)

		println("排序后")
		val now2:Date = new Date()
		val date2 = dateFormat.format(now2)
		println("排序后的时间：" + date2)
	}

	def mergeSort(array: Array[Int], left: Int, right: Int, temp: Array[Int]): Unit = {
		/*
		 * @functional description: 归并算法
		 * @param array:待排序的数组
		 * @param left:指定数组最左边的下标[0]
		 * @param right:指定数组最右边的下标[length - 1]
		 * @param temp: 临时数组,大小和array一致
		 * @return:排序后的数组
		 * @Author:Charles Van
		 * @Date:2019/4/21 20:46
		 */
		if (left < right) {
			val mid = (left + right) / 2
			mergeSort(array, left, mid, temp)
			mergeSort(array, mid + 1, right, temp)
			merge(array, left, mid, right, temp)
		}
	}

	def merge(array: Array[Int], left: Int, mid: Int, right: Int, temp: Array[Int]): Unit = {
		var i = left      // i 就是左边指针[索引]
		var j = mid + 1  // j 就是右边的指针
		var t = 0           // t 就是temp的索引
		while (i <= mid && j <= right) {
			// 如果是当前的左边的有序列表的值小于当前的右边有序列表的值
			// 就把这个值拷贝到temp数组
			if (array(i) <= array(j)) {
				temp(t) = array(i)
				t += 1
				i += 1
			}
			else {
				temp(t) = array(j)
				t += 1
				j += 1
			}
		}
		// 如果左边有序列表还有剩余数据，就依次拷贝到temp数组
		while (i <= mid) {
			temp(t) = array(i)
			t += 1
			i += 1
		}
		while (j <= right) {
			temp(t) = array(i)
			t += 1
			j += 1
		}
		//完成将本次的temp的数据拷贝到array中
		t = 0
		var tempLeft = left
		while (tempLeft <= right) {
			array(tempLeft) = temp(t)
			t += 1
			tempLeft += 1
		}
	}
}
