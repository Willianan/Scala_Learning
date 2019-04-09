/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 14:48
	* Project:ScalaLearning
	* FileName:IdenticalDemo01.scala
	* Version 1.0
	*/
package Chapter2

class IdenticalDemo01 {
	def main(args: Array[String]): Unit = {
		// 首字符为操作符（比如：+ - * /），后续字符也需跟操作符，至少一个
		val ++ = "Hello,World"
		println(++)
		//		val -a = 90
		//		println(-a)
		// 用反引号`.....`包括的任意字符串，即使是关键字（39个）也可以
		val `true` = "Hello,World"
		println(`true`)
		// 不能使用下划线作标识符
		// val _ = "123"
		// println(_)// error:下划线有很多作用
	}

}
