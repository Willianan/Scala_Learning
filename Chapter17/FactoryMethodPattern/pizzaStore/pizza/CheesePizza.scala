/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:41
	* Project:ScalaLearning
	* FileName:CheesePizza.scala
	* Version 1.0
	*/
package Chapter17.FactoryMethodPattern.pizzaStore.pizza

class CheesePizza extends Pizza {
	override def prepare(): Unit = {
		this.name = "奶酪Pizza"
		println(this.name + " preparing....")
	}
}
