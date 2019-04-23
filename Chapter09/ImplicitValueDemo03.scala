/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 19:42
	* Project:ScalaLearning
	* FileName:ImplicitDemo03.scala
	* Version 1.0
	*/


package Chapter9
// 隐式值
//隐式值也叫隐式变量，将某个形参变量标记为implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为缺省参数
object ImplicitValueDemo03 {
	def main(args: Array[String]): Unit = {
		hello     // 底层hello$1(str1)
	}
	implicit val str1:String = "Jack"     // 隐式值
	// implicit val str1:String:name就是隐式参数
	def hello(implicit name:String): Unit ={
		println(name + " hello")
	}
}
