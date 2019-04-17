/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 15:40
	* Project:ScalaLearning
	* FileName:TraitDemo02.scala
	* Version 1.0
	*/


package Chapter8.Trait
// trait的再说明
/*
* 1、Scala提供特质（trait），特质可以同时拥有抽象方法和具体方法，一个类可以实现/继承多个特质
* 2、特质中没有实现方法就是抽象方法。类通过extends关键字继承特质，通过with可以继承多个特质
* 3、所有的Java接口都可以当作Scala特质使用
* */
object TraitDemo02 {
	def main(args: Array[String]): Unit = {
		//创建一个AA
		val aa = new AA
		aa.sayOk()
		aa.sayHello()
	}
}

/*
* 当一个trait有抽象方法和非抽象方法时
*   1、一个trait在底层对于两个Trait02.class 接口
*   2、还对应trait02$class.class Trait02$class抽象类
* */
trait Trait02{
	// 抽象方法
	def sayOk()
	// 普通方法
	def sayHello(): Unit ={
		println("Trait02 sayHello......")
	}
}
/*
* 当trait有接口和抽象类时
*   class AA extends Trait02在底层对应class AA implements Trait02
*   当在AA类中使用Trait02的实现的方法，就通过Trait02$class调用
* */
class AA extends Trait02{
	override def sayOk(): Unit = {
		println("AA SayOk......")
	}
}