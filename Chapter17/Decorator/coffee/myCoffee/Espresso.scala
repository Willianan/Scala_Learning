/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:36
	* Project:ScalaLearning
	* FileName:Espresso.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee.mycoffee

class Espresso extends Coffee {
	super.setDescription("Espresso")
	super.setPrice(6.0f)
}
