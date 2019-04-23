/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 20:50
	* Project:ScalaLearning
	* FileName:MapOperateDemo02.scala
	* Version 1.0
	*/
package Chapter11

object MapOperateDemo02 {
	def main(args: Array[String]): Unit = {
		/*
		请将List(3,5,7)中的所有元素都乘以2，将其结果放到一个新的集合返回，即返回一个新的List(6,10,14)
		*/
		val list = List(3, 5, 7)
		/*
		* 说明
		*   1、将list这个集合的元素依次遍历
		*   2、将各个元素传递给multiple函数 => 新Int
		*   3、将得到新Int，放入到一个新的list并返回
		*   4、因此multiple被调用三次
		* */
		val list2 = list.map(multiple)
		println("list2 = " + list2)


		// 深度理解map映射函数的机制-模拟实现
		val myList = MyList()
		val myList2 = myList.map(multiple)
		println("myList2 = " + myList2)
	}

	def multiple(n: Int): Int = {
		println(",,,,,")
		n * 2
	}
}

// 深度理解map映射函数的机制-模拟实现
class MyList{
	val list1 = List(3,5,7,9)
	// 新的集合
	var list2 = List[Int]()

	//写map
	def map(f:Int => Int): List[Int] ={
		// 遍历集合
		for (item <- this.list1) {
			list2 = list2 :+ f(item)
		}
		list2
	}
}

object MyList{
	def apply(): MyList = new MyList()
}
