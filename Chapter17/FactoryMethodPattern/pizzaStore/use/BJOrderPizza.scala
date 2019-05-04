/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:27
	* Project:ScalaLearning
	* FileName:BJOrderPizza.scala
	* Version 1.0
	*/
package Chapter17.FactoryMethodPattern.pizzaStore.use

import Chapter17.FactoryMethodPattern.pizzaStore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

class BJOrderPizza extends OrderPizza {
	override def createPizza(orderType: String): Pizza = {
		var pizza: Pizza = null
		if (orderType.equals("peper")) {
			pizza = new BJPepperPizza
		}
		else if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza
		}
		pizza
	}
}

