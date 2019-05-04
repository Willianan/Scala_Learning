/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/19 14:41
	* Project:ScalaLearning
	* FileName:CircleQueue.scala
	* Version 1.0
	*/


package Chapter19.Queue

import scala.io.StdIn

object CircleArrayQueueDemo {
	def main(args: Array[String]): Unit = {
		var key = ""
		val circleQueue = new CircleArrayQueue(4)
		while (true) {
			println("show：表示显示队列数据")
			println("add：表示添加队列数据")
			println("get：表示取出队列数据")
			println("head：查看队列头的数据") // 不改变队列
			println("exit：表示退出程序")
			key = StdIn.readLine()
			key match {
				case "show" => circleQueue.showQueue()
				case "add" => {
					printf("请输入一个整数：")
					circleQueue.addQueue(StdIn.readInt())
				}
				case "get" => {
					val res = circleQueue.getQueue()
					if (res.isInstanceOf[Exception]) {
						println(res.asInstanceOf[Exception].getMessage)
					}
					else {
						println(s"取出的数据是：${res}")
					}
				}
				case "head" => {
					val res = circleQueue.headQueue()
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

// 环形队列
class CircleArrayQueue(arrayMaxSize: Int) {
	val maxSize = arrayMaxSize
	val array = new Array[Int](maxSize) // 该数组存放数据，模拟队列
	var front = 0 // 指向队列头部
	var rear = 0 // 指向队列尾部

	// 判断队列是否满
	def isFull(): Boolean = {
		(rear + 1) % maxSize == front
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
		array(rear) = n
		// 先让rear后移一次,这里必须考虑取模
		rear = (rear + 1) % maxSize
	}

	// 获取队列的数据（先进先出）
	def getQueue(): Any = {
		if (isEmpty()) {
			return new Exception("队列空.....")
		}
		// 分析：front已经指向了队列的头元素
		//  1、先将front对应的数据保存到变量
		//  2、将front后移
		//  3、返回前面保存的变量值
		val value = array(front)
		front = (front + 1) % maxSize
		return value

	}

	// 显示队列的所有数据
	def showQueue(): Unit = {
		if (isEmpty()) {
			println("队列空的，没有数据....")
			return
		}
		// 思路：从front取，取出几个元素
		for (i <- front until front + size) {
			printf("array[%d] = %d\t", i % maxSize, array(i % maxSize))
		}
		println()
	}
	// 求出当前环形队列有几个元素
	def size(): Int = {
		(rear + maxSize - front) % maxSize
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
