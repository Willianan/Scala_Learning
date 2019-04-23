/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/6 16:21
	* Project:ScalaLearning
	* FileName:IteratorDemo01.scala
	* Version 1.0
	*/


package Chapter11

object IteratorDemo01 {
	// 扩展 --- 迭代器
	// 通过iterator方法从集合中获得一个迭代器，通过while循环和for表达式对集合进行遍历
	def main(args: Array[String]): Unit = {
		/*
		1、iterator的构建实际是AbstractIterator的一个匿名子类，该类提供了
		def iterator: Iterator[A] = new AbstractIterator[A] {
    var these = self
    def hasNext: Boolean = !these.isEmpty
    def next(): A =
      if (hasNext) {
        val result = these.head; these = these.tail; result
      } else Iterator.empty.next()

      2、该AbstractIterator子类提供了hasNext next等方法
		*/
		val iterator = List(1,2,3,4,5).iterator
		println("--------- 遍历方式1 ---------")
		while (iterator.hasNext) {
			println(iterator.next())
		}
		println("--------- 遍历方式2 ---------")
		for (enum <- iterator) {
			println(enum)
		}
	}
}
