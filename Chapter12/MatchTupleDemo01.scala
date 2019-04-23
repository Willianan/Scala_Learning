/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 19:21
	* Project:ScalaLearning
	* FileName:MatchTupleDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchTupleDemo01 {
	//元组匹配
	def main(args: Array[String]): Unit = {
		for (pair <- Array((0,1),(1,0),(1,1),(1,0,2))) {
			val result = pair match {
				case (0,_) => "0 ..."
				case (y,0) => y
				case _ => "Other"
			}
			println(result)
		}
	}
}
