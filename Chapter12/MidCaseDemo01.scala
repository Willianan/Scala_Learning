/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 15:35
	* Project:ScalaLearning
	* FileName:MidCaseDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MidCaseDemo01 {
	// case语句的中置（缀）表达式
	// 如果unapply方法产生一个元组，，可以在case语句中使用中置表示法
	def main(args: Array[String]): Unit = {
		List(1,2,5,9) match {
			// 两个元素间 :: 叫中置表达式，至少first，second两个匹配才行
			case first :: second :: rest => println(first + " "+  second + " " + rest)
			case _ => println("匹配不到....")
		}
	}
}
