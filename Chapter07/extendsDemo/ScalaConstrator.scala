/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 21:17
	* Project:ScalaLearning
	* FileName:ScalaConstrator.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object ScalaConstrator {

	/*
	* 1、类由一个主构造器和任意数量的辅助构造器，而每个辅助构造器都必须先调用主构造器(也可以间接调用)
	* 2、只有主构造器可以调用父类的构造器，辅助构造器不能直接调用父类的构造器
	*     class Person(name: String){
	*     }
	*     class Emp(name: String) extends Person(name){
	*       // 将子类参数传递给父类构造器
	*     }
	* */
	def main(args: Array[String]): Unit = {
		//执行流程
		//  1、因为Scala遵守先构建父类部分extends person()
		//  2、person.....
		//  3、Emp.....（Emp的主构造器）
		val emp = new emp5
		println("============================")
		//执行流程
		//  1、因为Scala遵守先构建父类部分extends person()
		//  2、person.....
		//  3、Emp.....（Emp的主构造器）
		//  4、Emp 辅助构造器....
		val emp2 = new emp5("mary")

	}
}

// 父类person
class Person5{
	var name = "zhangsan"
	println("person.....")
}

// 子类Emp继承person
class emp5 extends Person5{
	println("Emp.....")
	// 辅助构造器
	def this(name: String){
		this            // 必须调用主构造器
		this.name
		println("Emp 辅助构造器....")
	}
}
