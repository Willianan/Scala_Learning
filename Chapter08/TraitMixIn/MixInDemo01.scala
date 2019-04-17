/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 16:09
	* Project:ScalaLearning
	* FileName:MixInDemo01.scala
	* Version 1.0
	*/
package Chapter8.TraitMixIn
/*
* 带有特质的对象，动态混入
*   1、除了可以在类声明时继承特质以外，还可以在构建对象时混入特质，扩展目标类的功能
*   2、此种方式也可以应用于对抽象类功能进行扩展
*   3、动态混入时Scala特有的方式，可以在不修改类声明/定义的情况下，扩展类的功能，非常的灵活，耦合性低
*   4、动态混入可以在不影响原有的继承关系的基础上，给指定的类扩展功能
* */
object MixInDemo01 {
	def main(args: Array[String]): Unit = {
		// 在不修改类的定义基础上使用trait方法
		val oracleDB = new OracleDB with Operate
		oracleDB.insert(100)
		val mySQL = new MySQL with Operate
		mySQL.insert(999)

		// 如果一个抽象类有抽象方法，如何动态混入特质
		val mySQL_ = new MySQL_ with Operate {
			override def say(): Unit = {
				println("say")
			}
		}
		mySQL_.insert(365)
		mySQL_.say()
	}
}

trait Operate {
	def insert(id:Int): Unit ={
		println("插入数据为：" + id)
	}
}

class OracleDB{
}
abstract class MySQL{

}
abstract class MySQL_{
	def say()
}