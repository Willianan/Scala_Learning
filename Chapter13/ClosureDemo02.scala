/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 21:31
	* Project:ScalaLearning
	* FileName:ClosureDemo02.scala
	* Version 1.0
	*/


package Chapter13

object ClosureDemo02 {
	def main(args: Array[String]): Unit = {
		/*
		请编写一个程序，具体要求如下：
				1、编写一个函数makeSuffix(suffix:String)可以接收有一个文件名后缀名（比如.jpg），并返回一个闭包
				2、调用闭包，可以传入一个文件名，如果该文件名没有指定的后缀，则返回文件名.jpg，
					 如果已经有.jpg后缀，则返回源文件名
				3、要求使用闭包的方式完成
				提示：String.endsWith(xx)
		*/
		val f = makeSuffix(".png")
		println(f("Dog.png"))
		println(f("Cat"))
	}
	def makeSuffix(suffix: String) = {
		(fileName: String) => {
			if (fileName.endsWith(suffix)) {
				fileName
			}
			else {
				fileName + suffix
			}
		}
	}
}
