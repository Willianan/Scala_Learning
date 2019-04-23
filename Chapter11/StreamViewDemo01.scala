/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 14:42
	* Project:ScalaLearning
	* FileName:StreamViewDemo01.scala
	* Version 1.0
	*/


package Chapter11

object StreamViewDemo01 {
	// 扩展 --- 视图View
	/*
	* Stream的懒加载特性，也可以对其他集合应用view方法来得到类似的效果，具有如下特点：
	*   1、view方法产生一个总是被懒执行的集合
	*   2、view不会缓存数据，每次都要重新计算
	* */

	// 找出1～100中，数字倒序排列和它本身相同的所有数
	def main(args: Array[String]): Unit = {
		// 没有使用view
		val viewSquares1 = (1 to 100).filter(eq)
		println(viewSquares1)


		// 对集合进行map、filter、reduce、fold...等方法，并不希望立即执行，而是在使用到结果才执行，
		// 则可以使用view来进行优化
		// 使用view
		val viewSquares2 = (1 to 100).view.filter(eq)
		println(viewSquares2)
		// 遍历
		for (item <- viewSquares2) {
			println(item)
		}
	}
	def eq(i:Int): Boolean ={
		i.toString.equals(i.toString.reverse)
	}
}
