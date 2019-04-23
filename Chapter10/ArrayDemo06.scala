/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 14:31
	* Project:ScalaLearning
	* FileName:ArrayDemo06.scala
	* Version 1.0
	*/


package Chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayDemo06 {
	// Java的List转Scala数组

	def main(args: Array[String]): Unit = {
		val array = ArrayBuffer("1","2","3")
		import scala.collection.JavaConversions.bufferAsJavaList
		val JavaArr = new ProcessBuilder(array)
		val arrayList = JavaArr.command()
		println(arrayList)

		import scala.collection.JavaConversions.asScalaBuffer
		// asScalaBuffer 是一个隐式函数
		/*  implicit def asScalaBuffer[A](l: ju.List[A]): mutable.Buffer[A] = l match {
          case null                           => null
          case MutableBufferWrapper(wrapped)  => wrapped
          case _                              => new JListWrapper(l)
        }
  */
		import scala.collection.mutable
		val scalaArr:mutable.Buffer[String] = arrayList
		scalaArr.append("Jack")
		println(scalaArr)
	}
}
