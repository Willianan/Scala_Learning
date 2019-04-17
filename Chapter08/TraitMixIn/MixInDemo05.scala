/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 21:25
	* Project:ScalaLearning
	* FileName:MixInDemo05.scala
	* Version 1.0
	*/


package Chapter8.TraitMixIn

object MixInDemo05 {
	/*
	* 特质构造顺序
	* 第一种特质构造顺序（声明类的同时混入特质）
	* 1、调用当前类的超类构造器
	* 2、第一个特质的父特质构造器
	* 3、第一个特质的构造器
	* 4、第二个特质构造器的父特质构造器，如果已经执行过，就不再执行
	* 5、第二个特质构造器
	* 6、......重复4，5的步骤（如果有第三个特质，第四个特质......）
	* 7、当前类构造器
	* */
	def main(args: Array[String]): Unit = {
		val ff1 = new FF
		println(ff1)
		// 第二种特质构造顺序（再构造对象时，动态混入特质）
		/*
		* 1、调用当前类的超类构造器
		* 2、当前类构造器
		* 3、第一个特质构造器的父特质构造器
		* 4、第一个特质构造器
		* 5、第二个特质构造器的父特质构造器，如果已经执行过，就不再执行
		* 6、第二个特质构造器
		* 7、......重复5，6的步骤（如果有第3个，第4个特质......）
		* 8、当前类构造器
		*
		* */
		val ff2 = new KK with CC with DD
		println(ff2)
	}
}
/*
* 两种方式对构造顺序的影响
*   1、第一种方式实际是构建类对象，再混入特质时，该对象还没有创建
*   2、第二种方式实际是构造匿名子类，可以理解成再混入特质时，对象已经创建了
* */

trait AA {
	println("A...")
}

trait BB extends AA {
	println("B...")
}

trait CC extends BB{
	println("C...")
}

trait DD extends BB{
	println("D...")
}

class EE {//普通类
	println("E...")
}

class FF extends EE with CC with DD {//先继承了EE类，然后再继承CC和DD
	println("F...")
}

class KK extends EE { //继承EE类
	println("K...")
}