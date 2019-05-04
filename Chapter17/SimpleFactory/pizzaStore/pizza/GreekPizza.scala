/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:09
	* Project:ScalaLearning
	* FileName:GreekPizza.scala
	* Version 1.0
	*/
package Chapter17.SimpleFactory.pizzaStore.pizza

class GreekPizza extends Pizza {
	override def prepare(): Unit = {
		this.name = "希腊Pizza"
		println(this.name + " preparing....")
	}
}
