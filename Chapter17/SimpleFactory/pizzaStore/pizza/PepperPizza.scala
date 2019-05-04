/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:12
	* Project:ScalaLearning
	* FileName:PepperPizza.scala
	* Version 1.0
	*/
package Chapter17.SimpleFactory.pizzaStore.pizza

class PepperPizza extends Pizza {
	override def prepare(): Unit = {
		this.name = "胡椒Pizza"
		println(this.name + " preparing.....")
	}
}
