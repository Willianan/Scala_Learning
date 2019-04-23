/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 15:24
	* Project:ScalaLearning
	* FileName:CaseClassDemo03.scala
	* Version 1.0
	*/


package Chapter12.CaseClass

object CaseClassDemo03 {
	// 样例类的copy方法和带名参数
	// copy创建一个于现有对象值相同的新对象，并可以通过带名参数来修改属性
	def main(args: Array[String]): Unit = {
		val amt = Currency3(29.95,"RMB")
		val amt1 = amt.copy()     //创建一个新的对象，但是属性值一样
		val amt2 = amt.copy(value = 19.95)  // 创建了一个新对象，但是修改了属性值
		val amt3 = amt.copy(unit = "英镑")
		println(amt)
		println(amt2)
		println(amt3)
	}
}

abstract class Amount3

case class Dollar3(value: Double) extends Amount3                    //样例类

case class Currency3(value: Double, unit: String) extends Amount3    //样例类

case object NoAmount3 extends Amount3                                //样例类