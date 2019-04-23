/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 15:02
	* Project:ScalaLearning
	* FileName:CaseCalssDemo01.scala
	* Version 1.0
	*/


package Chapter12.CaseClass

object CaseClassDemo01 {
	//样例类
	/*
	* 1、样例类任然是类
	* 2、样例类用case关键字声明
	* 3、样例类是为模式匹配而优化的类
	* 4、构造器中的每一个参数都成为val --- 除非它被显式地声明为var
	* 5、在样例类对应的伴生对象中提供apply方法，不用new关键字就能构造出相应的对象
	* 6、提供unapply方法让模式匹配可以工作
	* 7、将自动生成toString、equals、hasCode和copy方法
	* 8、除上述外，样例类和其他类型完全一样，可以添加方法和字段等进行扩展
	* */
	def main(args: Array[String]): Unit = {
		println()
	}
}

abstract class Amount

case class Dollar(value: Double) extends Amount                    //样例类

case class Currency(value: Double, unit: String) extends Amount    //样例类

case object NoAmount extends Amount                                //样例类