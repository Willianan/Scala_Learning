/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/3 15:52
	* Project:ScalaLearning
	* FileName:ListDemo03.scala
	* Version 1.0
	*/
package Chapter10

object ListDemo03 {
	// List元素的追加
	/*
	* 向列表中增加元素，会返回新的列表/集合对象，注意：Scala中List元素的追加形式非常独特
	* */
	def main(args: Array[String]): Unit = {
		// 方式1：在列表的最后增加数据
		val list1 = List(1,2,3,"Hello")
		// :+元素符表示子啊列表的最后增加数据
		val list2 = list1 :+ 4
		println(list1)
		println(list2)

		println("----------------------------")
		// 方式2：在列表的最前面增加数据
		// +:运算符表示在列表的最前面增加数据
		val list3 = 4 +: list1
		println(list1)
		println(list3)

		println("================================")
		// 方式3：在列表的最后增加数据
		/*
		*   1、符号:: 表示向集合中新建集合添加元素
		*   2、运算时，集合对象一定要放置在最右边
		*   3、元素规则：从右向左
		*   4、:::运算符是将集合中的每一个元素加入到空集合中
		* */

		// 1、list()
		// 2、将list1放入到list()
		val list4 = 4 :: 5 :: 6 :: list1 :: Nil
		println(list4)      // List(4, 5, 6, List(1, 2, 3, Hello))
		val list5 = 4 :: 5 :: 6 :: list1 ::: Nil
		println(list5)     // List(4, 5, 6, 1, 2, 3, Hello)
	}
}
