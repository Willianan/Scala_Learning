/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 21:50
	* Project:ScalaLearning
	* FileName:ExtendsTraitDemo01.scala
	* Version 1.0
	*/
package Chapter8.ExtendsTrait
/*
* 扩展类的特质
*   1、特质可以继承类，用来拓展该类的一些功能
*   2、所有混入该特质的类，会自动成为那个特质所继承的超类的子类
* */
object ExtendsTraitDemo01 {
	def main(args: Array[String]): Unit = {

	}
}
// 说明
//    1、loggedException 继承了Exception
//    2、loggedException特质就可以使用Exception中的getMessage()方法
//    3、如果混入该特质的类，已经继承了另一个类（A类），则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误。
trait loggedException extends Exception {
	def log(): Unit = {
		println(getMessage())   // 方法来自Exception类
	}
}

//// UnhappyException就是Exception的子类
//class UnhappyException extends loggedException{
//	// 已经是Exception的子类，可以重写方法
//	override def log = "错误消息！"
//}
//
//// 因为IndexOutOfBoundsException是loggedException特质的超类Exception的子类
//class UnhappyException2 extends IndexOutOfBoundsException with loggedException {
//	override def log = "错误信息!"
//}
