/**
		* Auther:Charles·Van
		* E-mail:williananjhon@hotmail.com
		* Date:2019/4/13 21:15
		* Project:ScalaLearning
		* FileName:OrderPizza.scala
		* Version 1.0
		*/
	package Chapter17.TAbstractFactoryPattern.pizzaStore.use

	import Chapter17.TAbstractFactoryPattern.pizzaStore.pizza.Pizza
	import scala.io.StdIn
	import scala.util.control.Breaks.{break, breakable}




	class OrderPizza {

		var absFactory: AbsFactory = _
		def this(absFactory: AbsFactory) {
			// 多态
			this
			breakable {
				do {
					var orderType: String = null
					var pizza: Pizza = null
					println("请输入Pizza的类型(使用了抽象工厂模式)：")
					orderType = StdIn.readLine()
					pizza = absFactory.createPizza(orderType)
					if (pizza == null) {
						break()
					}
					pizza.prepare()
					pizza.bake()
					pizza.cut()
					pizza.box()
				} while(true)
			}
		}
	}