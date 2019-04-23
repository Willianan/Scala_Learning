/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 14:48
	* Project:ScalaLearning
	* FileName:MatchForDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchForDemo01 {
	// for 表达式中的模式匹配
	def main(args: Array[String]): Unit = {
		val map = Map("A" -> 1,"B" -> 0,"C" ->3)
		for ((k,v) <- map) {
			println(k + " -> " + v)
		}
		for ((k,0) <- map) {
			println(k + " --> " + 0)
		}
		for ((k,v) <- map if v == 0) {
			println(k + " ---> " + v)
		}
	}
}
