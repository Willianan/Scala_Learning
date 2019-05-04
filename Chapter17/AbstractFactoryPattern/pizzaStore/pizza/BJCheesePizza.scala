/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:23
	* Project:ScalaLearning
	* FileName:BJCheesePizza.scala
	* Version 1.0
	*/
package Chapter17.TAbstractFactoryPattern.pizzaStore.pizza

class BJCheesePizza extends Pizza {
	override def prepare(): Unit = {
		this.name = "北京奶酪Pizza"
		println(this.name + " preparing....")
	}
}
