/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 10:34
	* Project:ScalaLearning
	* FileName:packageDemo05.scala
	* Version 1.0
	*/

package Chapter7.scala2

import scala.beans.BeanProperty

class Manager(var name:String){
	// 第一种形式
	@BeanProperty var age1: Int = _
	// 第二种形式 和第一种形式一样，都是相对路径引入
	@scala.beans.BeanProperty var age2: Int = _
	// 第三种形式，是绝对路径引入，可以解决包名冲突
	@_root_.scala.beans.BeanProperty var age3: Int = _
}

object TestBean{
	def main(args: Array[String]): Unit = {
		val m = new Manager("Jack")
		println("m = " + m)
	}
}
