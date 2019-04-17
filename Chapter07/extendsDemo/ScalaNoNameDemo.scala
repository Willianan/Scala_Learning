/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 11:00
	* Project:ScalaLearning
	* FileName:ScalaNoNameDemo.scala
	* Version 1.0
	*/
package Chapter7.extendsDemo

object ScalaNoNameDemo {
	// 匿名子类
	//通过包含带有定义或重写代码块的方式传教一个匿名的子类

	def main(args: Array[String]): Unit = {
		val monster = new Monster {
			override var name: String = "Tom"

			override def cry(): Unit = {
				println("llll.....lllll.....")
			}
		}
		monster.cry()
		println(monster.name)
	}
}

abstract class Monster{
	var name: String
	def cry()
}
