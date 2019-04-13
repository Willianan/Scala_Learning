/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 16:07
	* Project:ScalaLearning
	* FileName:ProcessAnalysis.scala
	* Version 1.0
	*/
package Chapter6

class ProcessAnalysis {
	def main(args: Array[String]): Unit = {
		var p:Person = new Person("小倩",20)
	}
}

class Person{
	var age: Short = 90
	var name: String = _
	def this(n:String,a:Short){
		this()
		this.name = n
		this.age = a
	}
}

// 流程分析
//    1、加载类的信息（属性信息，方法信息）
//    2、在内存中（堆）开辟空间
//    3、使用父类的构造器（主和辅助）进行初始化
//    4、使用主构造器对属性进行初始化[age:90,name:null]
//    5、使用辅助构造器对属性进行初始化[age:20,name:小倩]
//    6、将开辟的对象的地址赋给p这个引用