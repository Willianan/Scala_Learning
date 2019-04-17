/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 20:41
	* Project:ScalaLearning
	* FileName:MixInDemo02.scala
	* Version 1.0
	*/


package Chapter8.TraitMixIn

object MixInDemo02 {
	def main(args: Array[String]): Unit = {
		val mySQL5 = new MySQL5 with DB5 with File5
		mySQL5.insert(200)
	}
}

trait Operate5 {
	def insert(id: Int)
}

trait File5 extends Operate5 {
	// 说明
	//  1、如果在子特质中重写/实现了一个父特质的抽象方法，但同时调用super
	//  2、这时的方法不能完全实现，因此需要声明为abstract override
	//  3、这时super.insert(id)的调用就和动态混入顺序由密切关系
	abstract override def insert(id: Int): Unit = {
		println("将数据保存到文件中......")
		super.insert(id)
	}
}

trait DB5 extends Operate5 {
	override def insert(id: Int): Unit = {
		println("将数据保存到数据库中......")
	}
}

class MySQL5{}