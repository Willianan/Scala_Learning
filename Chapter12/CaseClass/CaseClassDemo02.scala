/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 15:16
	* Project:ScalaLearning
	* FileName:CaseClassDemo02.scala
	* Version 1.0
	*/


package Chapter12.CaseClass

object CaseClassDemo02 {
	// 有一个类型为Amount的对象时，可以用模式匹配来匹配其类型，并将属性值绑定到变量（把样例类对象的属性值提取到某个变量）
	def main(args: Array[String]): Unit = {
		for (amt <- Array(Dollar2(1000.0),Currency2(1000.0,"RMB"),NoAmount2)) {
			val result = amt match {
				case Dollar2(v) => "$" + v
				case Currency2(v,u) => v + " " + u
				case NoAmount2 => ""
			}
			println(amt + ": " + result)
		}
	}
}
abstract class Amount2

case class Dollar2(value: Double) extends Amount2                    //样例类

case class Currency2(value: Double, unit: String) extends Amount2    //样例类

case object NoAmount2 extends Amount2                                //样例类