/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 16:42
	* Project:ScalaLearning
	* FileName:MatchValDemo01.scala
	* Version 1.0
	*/
package Chapter12

object MatchValDemo01 {
	// 模式中的变量
	// 如果在case关键字后面跟变量名，那么match前表达式的值会赋给这个变量
	def main(args: Array[String]): Unit = {
		val ch = 'V'
		ch match {
			case '+' => println("Ok...")
			// 下面case myChar 等价于 myChar = ch
			case myChar => println("Ok..." + myChar)
			case _ => println("OK,,,,")
		}
		// match是一个表达式，因此可以有返回值
		val ch1 = '+'
		val res = ch1 match {
			case '+' => ch1 + " hello"
			case _ => println("Ok,,,,")
		}
		println("res = " + res)
	}
}
