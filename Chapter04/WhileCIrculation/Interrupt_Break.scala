/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/25 15:15
	* Project:ScalaLearning
	* FileName:Interrupt.scala
	* Version 1.0
	*/


package Chapter4.WhileCirculation

import util.control.Breaks._

object Interrupt_Break {
	def main(args: Array[String]): Unit = {
		var n = 1
		// breakable()函数
		// 说明：
		//   1、breakable是一个高阶函数：可以接受函数的函数就是高阶函数
		//  2、def breakable(op: => Unit) {
		//       try {
		//         op
		//       } catch {
		//            case ex: BreakControl =>
		//            if (ex ne breakException) throw ex
		//         }
		//      }
		// （1）op: => Unit 表示接收的参数是一个没有输入，也没有返回值的函数
		// （2）即可以简单理解可以接收一段代码块
		// 3、breakable 对break()抛出的异常做了处理，代码就可以继续执行。
		// 4、当传入的是代码块，Scala程序员会将()改为{}
		breakable {
			while (n <= 20) {
				n += 1
				println("n = " + n)
				if (n == 18) {
					// 中断while
					// 说明：
					//  1、在Scala中使用函数式的break函数中断循环
					//  2、def break(): Nothing = { throw breakException }
					break()
				}
			}
		}
		println("Ok ....")
	}

}

// Scala内置控制结构特地去掉了break和continue，使用函数式的风格解决break和continue的功能，而不是一个关键字。
