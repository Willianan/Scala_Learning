/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 21:17
	* Project:ScalaLearning
	* FileName:Pizza.scala
	* Version 1.0
	*/
package Chapter17.TAbstractFactoryPattern.pizzaStore.pizza

abstract class Pizza {
	var name:String = _
	// 假定每种pizza的准备原材料不同，因此做成抽象的
	def prepare() // 抽象方法

	def cut(): Unit ={
		println(this.name + " cutting....")
	}
	def bake(): Unit ={
		println(this.name + " baking.....")
	}
	def box(): Unit ={
		println(this.name + " boxing.....")
	}
}
