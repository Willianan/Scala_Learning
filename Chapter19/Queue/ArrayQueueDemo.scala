/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/18 21:36
	* Project:Algorithm
	* FileName:ArrayQueueDemo.scala
	* Version 1.0
	*/


package Chapter19.Queue

import scala.io.StdIn

object ArrayQueueDemo {
	def main(args: Array[String]): Unit = {
		var key = ""
		val queue = new ArrayQueue(10)
		while (true) {
			println("show：表示显示队列数据")
			println("add：表示添加队列数据")
			println("get：表示取出队列数据")
			println("head：查看队列头的数据")    // 不改变队列
			println("exit：表示退出程序")
			key = StdIn.readLine()
			key match {
				case "show" => queue.showQueue()
				case "add" => {
					printf("请输入一个整数：")
					queue.addQueue(StdIn.readInt())
				}
				case "get" => {
					val res = queue.getQueue()
					if (res.isInstanceOf[Exception]) {
						println(res.asInstanceOf[Exception].getMessage)
					}
					else {
						println(s"取出的数据是：${res}")
					}
				}
				case "head" => {
					val res = queue.headQueue()
					if (res.isInstanceOf[Exception]) {
						println(res.asInstanceOf[Exception].getMessage)
					}
					else {
						println(s"队列头的数据是：$res")
					}
				}
				case "exit" => System.exit(0)
			}
		}
	}
}

// 使用数组模拟队列
class ArrayQueue(arrayMaxSize: Int) {
	val maxSize = arrayMaxSize
	val array = new Array[Int](maxSize) // 该数组存放数据，模拟队列
	var front = -1 // 指向队列头部,分析出front是指向队列数据的前一个位置
	var rear = -1 // 指向队列尾部，分析出rear是指向队列的最后数据（含）

	// 判断队列是否满
	def isFull(): Boolean = {
		rear == maxSize - 1
	}

	// 判断队列是否为空
	def isEmpty(): Boolean = {
		front == rear
	}

	// 添加数据到队列
	def addQueue(n: Int): Unit = {
		if (isFull()) {
			println("队列已满，无法添加数据")
			return
		}
		rear += 1 // 先让rear后移一次
		array(rear) = n
	}

	// 获取队列的数据
	def getQueue(): Any = {
		if (isEmpty()) {
			return new Exception("队列空.....")
		}
		front += 1
		return array(front)
	}

	// 显示队列的所有数据
	def showQueue(): Unit = {
		if (isEmpty()) {
			println("队列空的，没有数据....")
			return
		}
		for (i <- front + 1 to rear) {
			printf("array[%d] = %d\t", i, array(i))
		}
		println()
	}

	// 查看队列的头元素，但不是改变队列
	def headQueue(): Any = {
		if (isEmpty()) {
			return new Exception("队列空.....")
		}
		// 不要改变front的值
		return array(front + 1)
	}
}
