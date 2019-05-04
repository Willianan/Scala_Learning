/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/13 20:25
	* Project:ScalaLearning
	* FileName:PizzaStore.scala
	* Version 1.0
	*/


package Chapter17.SimpleFactory.pizzaStore.order

object PizzaStore extends App {
	new OrderPizza
}
/*
* 传统的方式的优缺点
*   1、优点：比较好理解，简单易操作
*   2、缺点：违反了设计模式的OCP原则，即对扩展开放，对修改关闭。即当给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
*
*/
