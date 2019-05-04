/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:48
	* Project:ScalaLearning
	* FileName:AbsFactory.scala
	* Version 1.0
	*/

package Chapter17.TAbstractFactoryPattern.pizzaStore.use

import Chapter17.TAbstractFactoryPattern.pizzaStore.pizza.Pizza

trait AbsFactory {
	def createPizza(t:String):Pizza
}
