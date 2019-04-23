/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 16:28
	* Project:ScalaLearning
	* FileName:MatchIfDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchIfDemo01 {
	// 守卫
	// 如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
	def main(args: Array[String]): Unit = {
		for (ch <- "+-3!") {
			var sign = 0
			var digit = 0
			ch match {
				case '+' => sign = 1
				case '-' => sign = -1
				//说明
				// 如果case后面有条件守卫即if，那么这时的下划线不是表示默认匹配，而是表示忽略传入的数据
				case _ if ch.toString.equals("3") => digit = 3
				// 可以有多个默认匹配，但是后面的默认匹配无效，编译器也不会报错
				case _ => digit = 3
				case _ => sign = 2
			}
			println(ch + " " + sign + " " + digit)
		}
	}
}
