/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 15:38
	* Project:ScalaLearning
	* FileName:Constructor03.scala
	* Version 1.0
	*/


package Chapter6.Constructor

object Constructor03 {
	def main(args: Array[String]): Unit = {
		val worker = new worker("Smith")
		worker.name     // 不能访问inname

		val worker2 = new worker2("Smith")
		worker2.inName    // 可以访问inname
		println("Ok......")

		val worker3 = new worker3("Jack")
		worker3.inName = "Tom"
		println(worker3.inName)
	}
}
// 1、如果主构造器worker(inName:String)，那么inname就是一个局部变量
class worker(inName:String){
	var name =inName
}
// 2、如果主构造器worker2(val inName:String)，那么inname就是worker2的一个private的只读属性
class worker2(val inName:String){
	var name =inName
}
// 3、如果主构造器worker3(var inName:String)，那么inname就是worker3的一个private的可读写属性
class worker3(var inName:String){
	var name =inName
}