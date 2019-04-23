/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 15:50
	* Project:ScalaLearning
	* FileName:ListDemo02.scala
	* Version 1.0
	*/


package Chapter10

object ListDemo02 {
	// 访问List元素
	def main(args: Array[String]): Unit = {
		val list = List(1,2,"A",true,3,4)
		val value1 = list(1)    // 1是索引
		println(value1)
	}
}
