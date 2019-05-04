/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:56
	* Project:ScalaLearning
	* FileName:CoffeeBar.scala
	* Version 1.0
	*/


package Chapter17.Decorator.Coffee

import Chapter17.Decorator.Coffee.mycoffee.{DeCaf, LongBlack}
import Chapter17.Decorator.Coffee.mydecorator.{Chocolate, Milk}

object CoffeeBar {
	def main(args: Array[String]): Unit = {
		println("Coffee Bar")
		var order: Drink = new DeCaf
		println("order1 price: " + order.cost())
		println("order1 price: " + order.getDescription())

		println("-----------------------------------------------")

		var order2: Drink = new LongBlack
		order2 = new Milk(order2)
		order2 = new Chocolate(order2)
		order2 = new Chocolate(order2)

		println("order2 price: " + order2.cost())
		println("order2 price: " + order2.getDescription())
	}
}
