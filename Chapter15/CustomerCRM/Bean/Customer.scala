/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/10 15:38
	* Project:ScalaLearning
	* FileName:Customer.scala
	* Version 1.0
	*/
package Chapter15.CustomerCRM.Bean

class Customer {
	//属性
	var id: Int = 1
	var name: String = _
	var gender: Char = _
	var age: Short = _
	var tel: String = _
	var email: String = _
	// 设计一个辅助构造器
	def this(name:String,gender:Char,age:Short,tel:String,email:String) {
		this
		this.name = name
		this.gender = gender
		this.age = age
		this.tel = tel
		this.email = email
	}

	override def toString: String = {
		this.id + "\t\t" + this.name + "\t\t" + this.gender +
			"\t\t" + this.age + "\t\t" + this.tel + "\t\t" + this.email
	}
}

