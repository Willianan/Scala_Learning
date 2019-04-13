/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 14:56
	* Project:ScalaLearning
	* FileName:Constructor01.scala
	* Version 1.0
	*/


package Chapter6.Constructor

object Constructor01 {
	def main(args: Array[String]): Unit = {
		val p1 = new Person1("scott")
		p1.showInfo()
	}
}

class Person1(){
	var name: String = _
	var age: Int = _
	def this(name: String){
		// 辅助构造器无论直接或间接，最终都一定要显示调用主构造器，执行主构造器的逻辑
		//而且需要放在辅助构造器的第一行（这点和Java一样，Java中一个构造器要调用同类的其他构造器，也需要放在第一行）
		this()//直接调用主构造器
		this.name = name
	}
	def this(name:String,age:Int){
		this()
		this.name = name
		this.age = age
	}
	def this(age:Int){
		this("匿名")      // 调用主构造器，因为def this(name:String)中调用了主构造器
		this.age = age
	}
	def showInfo():Unit = {
		println("person Info:")
		println("name : " + this.name)
		println("age : " + this.age)
	}
}