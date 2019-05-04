/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:24
	* Project:ScalaLearning
	* FileName:BJPepperPizza.scala
	* Version 1.0
	*/
package Chapter17.TAbstractFactoryPattern.pizzaStore.pizza

class BJPepperPizza extends Pizza {
	override def prepare(): Unit = {
		this.name = "北京胡椒Pizza"
		println(this.name + " preparing....")
	}
}
