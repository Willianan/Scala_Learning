/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/22 20:58
	* Project:ScalaLearning
	* FileName:BinarySortTree.scala
	* Version 1.0
	*/


package Chapter19.BinaryTtree

object BinarySortTreeDemo {
	def main(args: Array[String]): Unit = {
		//val array = Array(7, 3, 10, 12, 5, 1, 9, 2)
		val array = Array(7)
		val binarySortTree = new BinarySortTree
		for (item <- array) {
			binarySortTree.add(new Node(item))
		}
		binarySortTree.infixOrder()
		println()

		println("========== 删除节点 =========")
		binarySortTree.delNode(7)
		binarySortTree.infixOrder()
	}
}

class Node(var value: Int) {
	var left: Node = null
	var right: Node = null

	// 查找某个节点
	def search(value: Int): Node = {
		// 先判断当前节点是否是要删除的节点
		if (this.value == value) {
			return this
		}
		else if (value < this.value) {
			if (this.left == null) {
				return null
			}
			else {
				return this.left.search(value)
			}
		}
		else {
			if (this.right == null) {
				return null
			}
			else {
				return this.right.search(value)
			}
		}
	}

	// 查找某个节点的父结点
	def searchParent(value: Int): Node = {
		// 先判断当前节点的左子节点或右子节点是否是这个值
		if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
			return this
		}
		else {
			if (value < this.value && this.left != null) {
				return this.left.searchParent(value)
			}
			else if (this.right != null && value > this.value) {
				return this.right.searchParent(value)
			}
			else {
				null
			}
		}
	}

	def add(node: Node): Unit = {
		if (node == null) {
			return
		}
		// 如果要插入的值小于当前节点的值
		if (node.value < this.value) {
			if (this.left == null) {
				this.left = node
			}
			else {
				// 递归的进行插入
				this.left.add(node)
			}
		}
		else {
			if (this.right == null) {
				this.right = node
			}
			else {
				this.right.add(node)
			}
		}
	}

	def infixOrder(): Unit = {
		if (this.left != null) {
			this.left.infixOrder()
		}
		printf(value + "\t")

		if (this.right != null) {
			this.right.infixOrder()
		}
	}
}

class BinarySortTree {
	var root: Node = null
	// 删除某个子树的最小值的节点，并返回最小值
	def delRightTreeMin(node: Node): Int ={
		var target = node
		// 使用while循环找到右子树的最小值
		while (target.left != null) {
			target = target.left
		}
		val minValue = target.value
		// 删除最小值对应的节点
		delNode(minValue)
		return minValue
	}
	// 删除节点
	def delNode(value: Int): Unit = {
		if (root == null) {
			return null
		}
		// 先看有没有要删除的节点
		var targetNode = search(value)
		if (targetNode == null) { // 没有要删除的节点，就直接返回
			return
		}
		// 查找targetNode的父结点
		var parentNode = searchParent(value)
		if (parentNode == null){
			root = null
			return
		}
		// 1、先开了的是叶子节点
		if (targetNode.left == null && targetNode.right == null) {
			// 判断删除的节点是parentNode的左子节点还是右子节点
			if (parentNode.left != null && parentNode.left.value == value) {
				parentNode.left = null
			}
			else {
				parentNode.right = null
			}
		}
		else if (targetNode.left != null && targetNode.right != null){  // targetNode只有两个节点
			// 找到最小值并删除
			val value = delRightTreeMin(targetNode.right)
			targetNode.value = value
		}
		else {  // targetNode只有一个节点
			if (targetNode.left != null) {
				if (parentNode.left.value == value){
					parentNode.left = targetNode.left
				}
				else {
					parentNode.right = targetNode.left
				}
			}
			else {
				if (parentNode.left.value == value){
					parentNode.left = targetNode.right
				}
				else {
					parentNode.right = targetNode.right
				}
			}
		}
	}

	def add(node: Node): Unit = {
		if (root == null) {
			root = node
		}
		else {
			root.add(node)
		}
	}

	def infixOrder(): Unit = {
		if (root != null) {
			root.infixOrder()
		}
		else {
			println("当前二叉树为空，不能遍历")
		}
	}

	def search(value: Int): Node = {
		if (root != null) {
			return root.search(value)
		}
		else {
			return null
		}
	}

	def searchParent(value: Int): Node = {
		if (root != null) {
			return root.searchParent(value)
		}
		else {
			return null
		}
	}
}
