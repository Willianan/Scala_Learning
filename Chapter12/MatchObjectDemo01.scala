/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 14:07
	* Project:ScalaLearning
	* FileName:MatchObjectDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchObjectDemo01 {
	// 对象匹配
	// case中对象的unapply方法（对象提取器）返回some激活则为匹配成功
	// 返回none集合则为匹配失败
	def main(args: Array[String]): Unit = {
		val number: Double = 36.0
		number match {
				// 说明case Square(n)的运行机制
				//    1、当匹配到case Square(n)
				//    2、调用Square的unapply(z: Double): Option[Double]，其中z = number
				//    3、如果对象提取器unapply(z: Double): Option[Double]，返回some（6.0），则匹配成功
				//       同时将6.0赋给Square(n)的n
			case Square(n) => println(n)
			case _ => println("nothing matched")
		}
	}
}
// 说明
//    1、unapply方法是对象提取器
//    2、接收z: Double 类型
//    3、返回类型是Option[Double]
//    4、返回的值是Some(math.sqrt(z))，并放入some()中
object Square {
	def unapply(z: Double): Option[Double] = Some(math.sqrt(z))

	def apply(z: Double): Double = z * z
}