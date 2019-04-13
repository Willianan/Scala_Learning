/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 15:10
	* Project:ScalaLearning
	* FileName:Constructor02.scala
	* Version 1.0
	*/


package Chapter6.Constructor

object Constructor02 {
	def main(args: Array[String]): Unit = {
		val a = new AA("Jack")
		// 输出的顺序为：
		//    1、BB......父类
		//    2、AA()    主构造器
		//    3、A this(name:String) 辅助构造器
	}
}
class BB {
	println("BB......")
}

class AA() extends BB() {
	println("AA()")
	def  this(name:String) {
		this
		println("A this(name:String)")
	}
}
