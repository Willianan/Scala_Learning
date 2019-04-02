/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 20:38
	* Project:ScalaLearning
	* FileName:VarDemo03.scala
	* Version 1.0
	*/


package Chapter1.Var

object VarDemo03 {
	// （4）val修饰的变量编译后，等同于加上final（通过反编译底层代码）
	val name = "hello"
	val age = 100
	def main(args: Array[String]): Unit = {
		println("ok")
		// 声明变量必须要初始值
	}
}
