/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:38
	* Project:ScalaLearning
	* FileName:Coffee.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee.mycoffee

import Chapter17.Decorator.Coffee.Drink


// 缓冲层
class Coffee extends Drink{
	override def cost(): Float = {
		super.getPrice()
	}
}
