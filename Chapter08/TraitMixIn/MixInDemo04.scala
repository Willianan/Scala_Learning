/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 21:12
	* Project:ScalaLearning
	* FileName:MixInDemo04.scala
	* Version 1.0
	*/


package Chapter8.TraitMixIn

//特质中的具体字段
//  特质中可以定义具体字段，如果初始化了就是具体字段，否则就是抽象字段。
//  混入该特质的类就是具有了该字段，字段不是继承，而是直接加入类，成为自己的字段
//  特质中未被初始化的字段在具体的子类中必须被重写
object MixInDemo04 {
	def main(args: Array[String]): Unit = {
		val mySQL7 = new MySQL7 with DB7 {
			override var age: Int = _
		}
		printf(mySQL7.operateType)
	}
}

trait Operate7 {
	var operateType: String   // 特质的抽象字段

	def insert()
}

trait DB7 extends Operate7 {
	var age: Int    // 特质的抽象字段
	override var operateType: String = "insert"

	override def insert(): Unit = {

	}
}

class MySQL7 {

}
