/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 19:59
	* Project:ScalaLearning
	* FileName:extends02.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object extends02 {
	def main(args: Array[String]): Unit = {
		val sub = new Sub()
		sub.sayOk()
	}
}
// 父类（基类）
class Base{
	var n1: Int = 1           // public n1() public n1_$eq()
	protected var n2: Int = 2
	private var n3: Int = 3   // private n3() private n3_$eq()
	def test100(): Unit = {   // 默认 public test100()
		println("base 100......")
	}
	protected def test200(): Unit = {     // public
		println("base 200.....")
	}
	private def test300(): Unit = {     // private test300()
		println("base 300.....")
	}
}
// Sub 继承 Base
class Sub extends Base {
	def sayOk(): Unit = {
		this.n1 = 20        // 这里访问本质 this.n1_$eq()
		this.n2 = 40
		println("范围：" + this.n1 + this.n2)
		test100()
		test200()         //在子类中可以使用protected
	}
}

/*
* 子类继承了所有的属性，只是私有的属性不能直接访问，需要通过公共的方法去访问
* */