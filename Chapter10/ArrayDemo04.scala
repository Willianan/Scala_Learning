/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/2 16:17
	* Project:ScalaLearning
	* FileName:ArrayDemo04.scala
	* Version 1.0
	*/


package Chapter10
// 数组-多维数组
object ArrayDemo04 {
	def main(args: Array[String]): Unit = {
		// 定义多维数组
		// 说明：二维数组有三个一维数组，每个一维数组中有四个元素
		//array1 = Array.ofDim[数组类型](行数,列数)
		val array1 = Array.ofDim[Int](3,4)
		// 赋值
		array1(1)(1) = 9
		for (items <- array1) {     //  取二维数组的各个元素（一维数组）
			for (item <- items) {     // 元素（一维数组）遍历
				print(item + "\t")
			}
			println()
		}
		println("======================")
		for (i <- 0 until  array1.length) {
			for (j <- 0 to array1(i).length-1) {
				printf("array1[%d][%d] = %d\t",i,j,array1(i)(j))
			}
			println()
		}
	}
}
