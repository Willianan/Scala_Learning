/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/22 20:16
	* Project:ScalaLearning
	* FileName:ArrayTreeDemo.scala
	* Version 1.0
	*/


package Chapter19.BinaryTtree

object ArrayTreeDemo {
	def main(args: Array[String]): Unit = {
		val array = Array(1,2,3,4,5,6,7)
		val arrayTree = new ArrayTree(array)
		arrayTree.preOrder()
		println()
		arrayTree.infixOrder()
		println()
		arrayTree.postOrder()

	}
}

class ArrayTree(val array: Array[Int]){
	// 对 preOrder进行重载
	def preOrder(): Unit ={
		this.preOrder(0)
	}
	def infixOrder(): Unit ={
		this.infixOrder(0)
	}
	def postOrder(): Unit ={
		this.postOrder(0)
	}
	private def preOrder(index:Int): Unit ={
		if (array == null || array.length == 0) {
			println("数组为空，不能按照二叉树遍历")
			return
		}
		printf(array(index)+ "\t")
		// 向左递归遍历
		if ((index * 2 + 1) < array.length) {
				preOrder(index * 2 + 1)
		}
		// 向右递归遍历
		if ((index * 2 + 2) < array.length) {
			preOrder(index * 2 + 2)
		}
	}
	private def infixOrder(index:Int): Unit ={
		if (array == null || array.length == 0) {
			println("数组为空，不能按照二叉树遍历")
			return
		}
		// 向左递归遍历
		if ((index * 2 + 1) < array.length) {
			infixOrder(index * 2 + 1)
		}
		printf(array(index)+ "\t")
		// 向右递归遍历
		if ((index * 2 + 2) < array.length) {
			infixOrder(index * 2 + 2)
		}
	}
	private def postOrder(index:Int): Unit ={
		if (array == null || array.length == 0) {
			println("数组为空，不能按照二叉树遍历")
			return
		}
		// 向左递归遍历
		if ((index * 2 + 1) < array.length) {
			postOrder(index * 2 + 1)
		}
		// 向右递归遍历
		if ((index * 2 + 2) < array.length) {
			postOrder(index * 2 + 2)
		}
		printf(array(index)+ "\t")
	}
}
