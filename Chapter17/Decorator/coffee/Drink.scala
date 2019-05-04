/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:30
	* Project:ScalaLearning
	* FileName:Drink.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee

// 抽象类
// Drink表示饮品
abstract class Drink {
	var description = ""
	private var price = 0.0f
	def setDescription(description:String): Unit ={
		this.description = description
	}

	def getDescription():String = {
		description + "价格：" + this.getPrice()
	}

	def getPrice(): Float = {
		price
	}
	def setPrice(price:Float): Unit ={
		this.price = price
	}
	def cost():Float
}
