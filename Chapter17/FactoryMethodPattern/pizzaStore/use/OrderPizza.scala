/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:15
	* Project:ScalaLearning
	* FileName:OrderPizza.scala
	* Version 1.0
	*/
package Chapter17.FactoryMethodPattern.pizzaStore.use

import Chapter17.FactoryMethodPattern.pizzaStore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

abstract class OrderPizza {
	var orderType: String = _
	var pizza: Pizza = _

	breakable {
		do {
			println("请输入Pizza的类型(使用了工厂方法模式)：")
			orderType = StdIn.readLine()
			pizza = createPizza(orderType)
			if (pizza == null) {
				break()
			}
			this.pizza.prepare()
			this.pizza.bake()
			this.pizza.cut()
			this.pizza.box()
		} while (true)
	}
	// 抽象方法
	def createPizza(orderType: String): Pizza
}
