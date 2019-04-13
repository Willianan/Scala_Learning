/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/29 15:56
	* Project:ScalaLearning
	* FileName:BeanPropertDemo.scala
	* Version 1.0
	*/


package Chapter6.Constructor

import scala.beans.BeanProperty

object BeanPropertDemo {
	def main(args: Array[String]): Unit = {
		val car = new Car
		car.name = "BWM"
		println(car.name)

		// 使用@BeanProperty自动生成getXXX 和 setXXX
		// 并且对原来底层自动生成类似XXX(),XXX_$eq()方法没有冲突，二者可以共存
		car.setName("QQ")
		println(car.getName)
	}
}

class Car {
	@BeanProperty var name: String = null
}

