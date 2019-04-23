/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 14:58
	* Project:ScalaLearning
	* FileName:TupleDemo03.scala
	* Version 1.0
	*/


package Chapter10

object TupleDemo03 {
	// Tuple----元组数据的遍历
	// Tuple是一个整体，遍历需要调用其迭代器
	def main(args: Array[String]): Unit = {
		val t1 = (1, 2, "a", "B", true, 3, 4)
		for (item <- t1.productIterator) {
			/*  def productIterator: Iterator[Any] = new scala.collection.AbstractIterator[Any] {
            private var c: Int = 0
            private val cmax = productArity
            def hasNext = c < cmax
            def next() = { val result = productElement(c); c += 1; result }
          }
      */
			println(item)
		}
	}
}
