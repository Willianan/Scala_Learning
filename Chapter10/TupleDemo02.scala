/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 14:51
	* Project:ScalaLearning
	* FileName:TupleDemo02.scala
	* Version 1.0
	*/
package Chapter10

object TupleDemo02 {
	// 元组的访问
	/*
	* 访问元组中的数据，可以采用顺序号（_顺序号），也可以通过索引（productElement）访问
	* */
	def main(args: Array[String]): Unit = {
		val t1 = (1, "a", "b", true, 2)
		println(t1._1) // 从1开始
		println(t1.productElement(0)) // 从0开始
		/*  override def productElement(n: Int) = n match {
          case 0 => _1
          case 1 => _2
          case 2 => _3
          case 3 => _4
          case 4 => _5
          case _ => throw new IndexOutOfBoundsException(n.toString())
        }
    */
	}
}
