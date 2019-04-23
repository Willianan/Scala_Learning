/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 14:14
	* Project:ScalaLearning
	* FileName:ArrayDemo05.scala
	* Version 1.0
	*/
package Chapter10

import scala.collection.mutable.ArrayBuffer


object ArrayDemo05 {
	// Scala集合和Java集合互相转换
	def main(args: Array[String]): Unit = {
		val array = ArrayBuffer("1","2","3")
		import scala.collection.JavaConversions.bufferAsJavaList
		/*  implicit def bufferAsJavaList[A](b: mutable.Buffer[A]): ju.List[A] = b match {
          case null                   => null
          case JListWrapper(wrapped)  => wrapped
          case _                      => new MutableBufferWrapper(b)
        }
  */
		// 使用ProcessBuilder 因为这里使用到 bufferAsJavaList隐式函数
		val JavaArr = new ProcessBuilder(array)
		// arrayList就是Java中的List
		val arrayList = JavaArr.command()
		println(arrayList)

		val a01 = new A {}
		B.test(a01)
	}
}

// 当一个类继承了一个trait，那么该类的实例，就可以传递给这个trait引用
trait MyTrait01{}

class A extends MyTrait01{}

object B{
	def test(m:MyTrait01): Unit ={
		println("B is Ok....")
	}
}
