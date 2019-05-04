/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:13
	* Project:ScalaLearning
	* FileName:OrderPizza.scala
	* Version 1.0
	*/
package Chapter17.SimpleFactory.pizzaStore.order

import Chapter17.SimpleFactory.pizzaStore.pizza.{GreekPizza, PepperPizza, Pizza}
import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {
	var orderType: String = _
			var pizza: Pizza = _
			breakable {
				do {
					println("请输入Pizza的类型(使用了简单工厂模式)：")
					orderType = StdIn.readLine()
					pizza = SimpleFactory.createPizza(orderType)
					if (pizza == null) {
						break()
					}
//			if (orderType.equals("greek")) {
//				this.pizza = new GreekPizza
//			}
//			else if (orderType.equals("pepeer")) {
//				this.pizza = new PepperPizza
//			}
//			else {
//				break()
//			}
			this.pizza.prepare()
			this.pizza.bake()
			this.pizza.cut()
			this.pizza.box()
		} while (true)
	}
}


