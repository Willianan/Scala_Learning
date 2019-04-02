/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 16:51
	* Project:ScalaLearning
	* FileName:LookSourceCode.scala
	* Version 1.0
	*/


package Chapter1

object LookSourceCode {
	def main(args: Array[String]): Unit = {
		//看Array的源码 ctrl+b
		var arr = new Array[Int](10)
		// 对代码进行格式化的快捷键ctrl+alt+l
		for (item <- arr){
			println("item="+item)
		}
	}

}
