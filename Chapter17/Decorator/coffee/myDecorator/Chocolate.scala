/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:46
	* Project:ScalaLearning
	* FileName:Chocolate.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee.mydecorator

import Chapter17.Decorator.Coffee.Drink

class Chocolate(obj: Drink) extends Decorator(obj) {
	super.setDescription("Chocolate")
	super.setPrice(3.0f)
}
