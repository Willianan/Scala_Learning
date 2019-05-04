/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:50
	* Project:ScalaLearning
	* FileName:BJFactory.scala
	* Version 1.0
	*/
package Chapter17.TAbstractFactoryPattern.pizzaStore.use

import Chapter17.TAbstractFactoryPattern.pizzaStore.pizza.{BJCheesePizza, BJGreekPizza, BJPepperPizza, Pizza}

// 实现了AbsFactory的一个子工厂类
class BJFactory extends AbsFactory {
	override def createPizza(t: String): Pizza = {
		var pizza: Pizza = null
		if (t.equals("cheese")) {
			pizza = new BJCheesePizza
		}
		else if (t.equals("pepper")) {
			pizza = new BJPepperPizza
		}
		else if (t.equals("greek")) {
			pizza = new BJGreekPizza
		}
		return pizza
	}
}
