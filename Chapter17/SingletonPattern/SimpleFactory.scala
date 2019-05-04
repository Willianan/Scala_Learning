/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:36
	* Project:ScalaLearning
	* FileName:SimpleFactory.scala
	* Version 1.0
	*/
package Chapter17.SimpleFactory.pizzaStore.order

import Chapter17.SimpleFactory.pizzaStore.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

object SimpleFactory {
	// 提供了一个创建Pizza的方法
	def createPizza(t: String): Pizza = {
		var pizza: Pizza = null
		if (t.equals("greek")) {
			pizza = new GreekPizza
		}
		else if (t.equals("pepper")) {
			pizza = new PepperPizza
		}
		else if (t.equals("cheese")) {
			pizza = new CheesePizza
		}
		return pizza
	}
}
