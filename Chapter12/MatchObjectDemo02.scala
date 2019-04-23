/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 14:25
	* Project:ScalaLearning
	* FileName:MatchObjectDemo02.scala
	* Version 1.0
	*/


package Chapter12

object MatchObjectDemo02 {
	def main(args: Array[String]): Unit = {
		val namesString = "Alice,Bob,Thomas,Tom,Jack"
		namesString match {
			case Names(first,second,third,fourth,fifth) => {
				println("the string contains five people's names")
				println(s"$first $second $third $fourth $fifth")
			}
			case _ => println("nothing matched")
		}
	}
}

object Names {
	def unapplySeq(string: String): Option[Seq[String]] = {
		if (string.contains(",")) {
			Some(string.split(","))
		}
		else {
			None
		}
	}
}