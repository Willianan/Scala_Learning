/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/20 14:49
	* Project:ScalaLearning
	* FileName:ArrayStackDemo.scala
	* Version 1.0
	*/

package Chapter19.Stack

import scala.io.StdIn

object ArrayStackDemo {
	def main(args: Array[String]): Unit = {
		var key = ""
		val stack = new ArrayStack(4)
		while (true){
			println("show:显示栈")
			println("exit:退出程序")
			println("push:添加数据")
			println("pop:取出数据")
			key = StdIn.readLine()
			key match {
				case "show" => stack.list()
				case "push" => {
					println("请输入一数：")
					val value = StdIn.readInt()
					stack.push(value)
				}
				case "pop" => {
					val res = stack.pop()
					if (res.isInstanceOf[Exception]) {
						println(res.asInstanceOf[Exception].getMessage)
					}
					else {
						println("取出的数据：" + res)
					}
				}
				case "exit" => System.exit(0)
			}
		}
	}
}

class ArrayStack(size:Int) {
	val maxSize = size      // 栈的大小
	var stack = new Array[Int](maxSize)
	// 栈顶 初始化为-1
	var top = -1

	// 栈满
	def isFull(): Boolean = {
		top == maxSize - 1
	}
	// 栈空
	def isEmpty():Boolean = {
		top == -1
	}
	// 入栈,放入数据
	def push(value:Int): Unit ={
		if (isFull()) {
			println("栈满")
			return
		}
		top += 1
		stack(top) = value
	}
	// 出栈
	def pop(): Any = {
		if (isEmpty()) {
			return new Exception("栈空")
		}
		val value = stack(top)
		top -= 1
		return value
	}
	// 遍历栈
	def list(): Unit ={
		if (isEmpty()) {
			println("栈空，没有数据")
			return
		}
		for (i <- 0 to top reverse) {
			printf("stack[%d] = %d\n",i,stack(i))
		}
	}
}
