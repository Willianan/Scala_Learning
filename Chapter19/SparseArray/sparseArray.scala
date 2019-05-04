/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/18 20:44
	* Project:Algorithm
	* FileName:sparseArray.scala
	* Version 1.0
	*/


package Chapter19.SparseArray

import scala.collection.mutable.ArrayBuffer

object sparseArray {
	def main(args: Array[String]): Unit = {
		val rowSize = 11
		val colSize = 11
		// 稀疏数组的使用
		val chessMap = Array.ofDim[Int](rowSize, colSize)
		// 初始化棋盘
		chessMap(1)(2) = 1 // 表示黑子
		chessMap(2)(3) = 2 // 表示白子

		// 输出原始棋盘
		for (item <- chessMap) {
			for (item2 <- item) {
				printf("%d\t", item2)
			}
			println()
		}
		// 将chessMap转成稀疏数组
		val spareArray = ArrayBuffer[Node]()
		val node = new Node(rowSize,colSize,0)
		spareArray.append(node)
		for (i <- 0 until chessMap.length) {
			for (j <- 0 until chessMap(i).length) {
				if (chessMap(i)(j) != 0) {
					val node = new Node(i,j,chessMap(i)(j))
					spareArray.append(node)   // 加入到稀疏数组
				}
			}
		}
		println("-------------- 稀疏数组 -----------------")
		// 输出稀疏数组
		for (node <- spareArray) {
			printf("%d\t%d\t%d\n",node.row,node.col,node.value)
		}

		// 稀疏数组 -> 原始数组
		val newNode = spareArray(0)
		val rowSize2 = newNode.row
		val colSize2 = newNode.col

		val chessMap2 = Array.ofDim[Int](rowSize2,colSize2)
		for (i <- 1 until spareArray.length) {
			val node = spareArray(i)
			chessMap2(node.row)(node.col) = node.value
		}
		println("------------ 从稀疏数组恢复后的棋盘 ------------------")
		for (item <- chessMap2) {
			for (item2 <- item) {
				printf("%d\t",item2)
			}
			println()
		}
	}
}

class Node(val row: Int, val col: Int, val value: Int)
