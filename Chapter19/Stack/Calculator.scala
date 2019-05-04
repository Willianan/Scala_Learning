/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/20 15:37
	* Project:ScalaLearning
	* FileName:Calculator.scala
	* Version 1.0
	*/


package Chapter19.Stack

import util.control.Breaks.{break, breakable}

object Calculator {
	def main(args: Array[String]): Unit = {
		val expression = "30+2*6-2"

		val numStack = new ArrayStack2(10)
		val operStack = new ArrayStack2(10)
		/**
			* 思路
			* 1、设计两个栈：数栈，符号栈
			* 2、对exp进行扫描，一个一个的取出
			* 3、取出的字符是数时，就直接入数栈
			* 4、当取出的字符是符号时：
			* 1)如果当前符号栈没有数据，就直接入栈
			* 2)如果当前符号的优先级小于等于符号栈的栈顶的符号的优先级，则取出该符号，并从数栈依次pop出
			* 两个数据进行运算，将结果重新push到数栈，再将当前符号push到符号栈
			* 3)反之，符号直接入符号栈
			* 5、当整个表达式扫描完毕后，依次从数栈和符号栈取出数据，进行运算，最后再数栈中的数据就是结果
			**/
		var index = 0
		var num1 = 0
		var num2 = 0
		var oper = 0
		var res = 0
		var ch = ' '
		var keepNum = "" // 在进行扫描时，保存上一次的数字ch，并进行拼接
		// 循环的取出expression字符
		breakable {
			while (true) {
				// 扫描
				ch = expression.substring(index, index + 1)(0)
				if (operStack.isOper(ch)) {
					if (!operStack.isEmpty()) {
						if (operStack.priority(ch) <= operStack.priority(operStack.stack(operStack.top))) {
							num1 = numStack.pop().toString.toInt
							num2 = numStack.pop().toString.toInt
							oper = operStack.pop().toString.toInt
							res = numStack.cal(num1, num2, oper)
							// 入数栈
							numStack.push(res)
							// 把当前ch入符号栈
							operStack.push(ch)
						}
						else {
							operStack.push(ch)
						}
					}
					else {
						operStack.push(ch)
					}
				}
				else {
					// 处理多位数的逻辑
					keepNum += ch
					// 如果ch已经是expression最后一个字符
					if (index == expression.length - 1) {
						numStack.push(keepNum.toInt)
					}
					else {
						// 判断ch的下一个字符是不是数字，如果时数字则进行再次扫描，如果是操作符，就直接入栈
						if (operStack.isOper(expression.substring(index + 1, index + 2)(0))) {
							numStack.push(keepNum.toInt)
							keepNum = ""
						}
					}
				}
				index += 1
				// 判断是否到表达式的最后
				if (index >= expression.length) {
					break()
				}
			}
		}
		breakable {
			while (true) {
				if (operStack.isEmpty()) {
					break()
				}
				num1 = numStack.pop().toString.toInt
				num2 = numStack.pop().toString.toInt
				oper = operStack.pop().toString.toInt
				res = numStack.cal(num1, num2, oper)
				numStack.push(res)
			}
		}
		val res2 = numStack.pop()
		printf("表达式 %s = %d\n", expression, res2)
	}
}


class ArrayStack2(size: Int) {
	val maxSize = size // 栈的大小
	var stack = new Array[Int](maxSize)
	// 栈顶 初始化为-1
	var top = -1

	// 栈满
	def isFull(): Boolean = {
		top == maxSize - 1
	}

	// 栈空
	def isEmpty(): Boolean = {
		top == -1
	}

	// 入栈,放入数据
	def push(value: Int): Unit = {
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
	def list(): Unit = {
		if (isEmpty()) {
			println("栈空，没有数据")
			return
		}
		for (i <- 0 to top reverse) {
			printf("stack[%d] = %d\n", i, stack(i))
		}
	}

	// 返回运算符的优先级，数字越大，优先级越高
	def priority(oper: Int): Int = {
		if (oper == '*' || oper == '/') {
			return 1
		}
		else if (oper == '+' || oper == '-') {
			return 0
		}
		else {
			-1
		}
	}

	def isOper(value: Int): Boolean = {
		value == '+' || value == '-' || value == '*' || value == '/'
	}

	// 计算方法
	def cal(num1: Int, num2: Int, oper: Int): Int = {
		var res = 0
		oper match {
			case '+' => {
				res = num1 + num2
			}
			case '-' => {
				res = num2 - num1
			}
			case '*' => {
				res = num1 * num2
			}
			case '/' => {
				res = num2 / num1
			}
		}
		res
	}
}