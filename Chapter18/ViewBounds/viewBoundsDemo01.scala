/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 15:34
	* Project:ScalaLearning
	* FileName:viewBoundsDemo01.scala
	* Version 1.0
	*/


package Chapter18.ViewBounds

object viewBoundsDemo {
	def main(args: Array[String]): Unit = {
		val commonCompare1 = new CommonCompare(20, 30)
		println(commonCompare1.greater)

		val commonCompare2 = new CommonCompare(Integer.valueOf(10),Integer.valueOf(40))
		println(commonCompare2.greater)

		val commonCompare3 = new CommonCompare[java.lang.Float](10.2f,40.32f)
		println(commonCompare3.greater)

		val commonCompare4= new CommonCompare(1023.2f,40456.32f)
		println(commonCompare4.greater)


	}
}
// 视图界定view bounds 会发生隐式转换
class CommonCompare[T <% Comparable[T]](obj1:T,obj2:T){
	def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
