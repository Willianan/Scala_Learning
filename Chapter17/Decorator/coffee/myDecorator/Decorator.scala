/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:46
	* Project:ScalaLearning
	* FileName:Decorator.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee.mydecorator

import Chapter17.Decorator.Coffee.Drink

// 这个就是Decorator装饰者
class Decorator extends Drink{
	// obj就是被装饰的对象
	private var obj:Drink = null
	// 实现了cost方法
	def this(obj:Drink){
		this
		this.obj = obj
	}
	override def cost(): Float = {
		super.getPrice() + obj.cost()
	}

	// 获取信息时，也需要递归获取
	override def getDescription(): String = {
		super.getDescription() + "&&" + obj.getDescription()
	}
}
