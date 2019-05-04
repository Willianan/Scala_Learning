/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/15 21:46
	* Project:ScalaLearning
	* FileName:Soy.scala
	* Version 1.0
	*/
package Chapter17.Decorator.Coffee.mydecorator

import Chapter17.Decorator.Coffee.Drink

class Soy(obj:Drink) extends Decorator(obj) {
	super.setDescription("Soy")
	super.setPrice(1.5f)
}
