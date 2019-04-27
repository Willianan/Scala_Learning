/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/9 14:15
	* Project:ScalaLearning
	* FileName:AbstractControl.scala
	* Version 1.0
	*/


package Chapter13

object AbstractControl {
	//抽象控制
	/*
		满足的条件：
			1、参数是函数
			2、函数参数没有输入值也没有返回值
	*/
	def main(args: Array[String]): Unit = {
		// myRunlnThread就是一个抽象控制
		def myRunlnThread(f1: () => Unit) = {
			new Thread {
				override def run(): Unit = {
					f1()
				}
			}.start()
		}

		myRunlnThread {
			() =>
				println("干活咯！5秒完成....")
				Thread.sleep(5000)
				println("干完咯！")
		}


		def myRunlnThread2(f1: => Unit) = {
			new Thread {
				override def run(): Unit = {
					f1
				}
			}.start()
		}

		// 对于没有输入，也没有返回值函数，可以简写如下形式
		myRunlnThread2 {
			println("干活咯！5秒完成....")
			Thread.sleep(5000)
			println("干完咯！")
		}
	}
}
