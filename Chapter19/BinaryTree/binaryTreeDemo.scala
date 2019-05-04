/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/22 15:23
	* Project:ScalaLearning
	* FileName:binaryTreeDemo.scala
	* Version 1.0
	*/


package Chapter19.BinaryTtree

object binaryTreeDemo {
	def main(args: Array[String]): Unit = {
		// 先使用比较简单的方法直接关联
		val heroNode1 = new HeroNode(1,"宋江")
		val heroNode2 = new HeroNode(2,"吴用")
		val heroNode3 = new HeroNode(3,"卢俊义")
		val heroNode4 = new HeroNode(4,"林冲")
		val heroNode5 = new HeroNode(5,"关胜")

		heroNode1.left = heroNode2
		heroNode1.right = heroNode3
		heroNode3.left = heroNode5
		heroNode3.right = heroNode4

		val binaryTree = new BinaryTree
		binaryTree.root = heroNode1
//		println("---------- 前序遍历 ----------")
//		binaryTree.preOrder()
//		println("---------- 中序遍历 ----------")
//		binaryTree.infixOrder()
//		println("---------- 后续遍历 ----------")
//		binaryTree.postOrder()
		println("========= 前序查找 =========")
		val resNode = binaryTree.preOrderSearch(5)
		if (resNode != null) {
			printf("找到编号为：%d，名字为：%s\n",resNode.no,resNode.name)
		}
		else {
			println("没有找到")
		}
		println("========= 中序查找 =========")
		val resNode1 = binaryTree.infixOrderSearch(5)
		if (resNode1 != null) {
			printf("找到编号为：%d，名字为：%s\n",resNode1.no,resNode1.name)
		}
		else {
			println("没有找到")
		}

		println("========= 后序查找 =========")
		val resNode2 = binaryTree.postOrderSearch(5)
		if (resNode2 != null) {
			printf("找到编号为：%d，名字为：%s\n",resNode2.no,resNode2.name)
		}
		else {
			println("没有找到")
		}
	}
}

class HeroNode(hNo:Int,hName:String){
	val no = hNo
	var name = hName
	var left:HeroNode = null
	var right:HeroNode = null

	def delNode(no:Int): Unit ={
		// 首先比较当前节点的左子节点是否为要删除的节点
		if (this.left != null && this.left.no == no) {
			this.left = null
			return
		}
		// 比较当前节点的右子节点是否为要删除的节点
		if (this.right != null && this.right.no == no) {
			this.right = null
			return
		}
		// 向左递归删除
		if (this.left != null) {
			this.left.delNode(no)
		}
		// 向右递归删除
		if (this.right != null) {
			this.right.delNode(no)
		}
	}

	// 前序遍历
	def preOrder(): Unit ={
		// 先输出当前节点信息
		printf("节点信息 no = %d name = %s\n",no,name)
		// 向左递归输出左子树
		if (this.left != null) {
			this.left.preOrder()
		}
		// 向右子树递归输出
		if (this.right != null) {
			this.right.preOrder()
		}
	}

	// 前序查找
	def preOrderSearch(no:Int): HeroNode ={
		println("---------")
		if (this.no == no) {
			return this
		}
		var resNode:HeroNode = null
		// 向左递归查找
		if (this.left != null) {
			resNode = this.left.preOrderSearch(no)
		}
		if (resNode != null) {
			return resNode
		}
		if (this.right != null) {
			resNode = this.right.preOrderSearch(no)
		}
		return resNode
	}

	// 中序遍历
	def infixOrder(): Unit ={
		if (this.left != null) {
			this.left.infixOrder()
		}
		// 输出当前节点信息
		printf("节点信息 no = %d name = %s\n",no,name)

		if (this.right != null) {
			this.right.infixOrder()
		}
	}

	// 中序查找
	def infixOrderSearch(no:Int): HeroNode ={
		var resNode:HeroNode = null
		// 向左递归查找
		if (this.left != null) {
			resNode = this.left.infixOrderSearch(no)
		}
		if (resNode != null) {
			return resNode
		}
		println("===========")
		if (this.no == no) {
			return this
		}
		// 向右递归查找
		if (this.right != null) {
			resNode = this.right.infixOrderSearch(no)
		}
		return resNode
	}

	// 后序遍历
	def postOrder(): Unit ={
		if (this.left != null) {
			this.left.postOrder()
		}
		if (this.right != null) {
			this.right.postOrder()
		}
		// 输出当前节点信息
		printf("节点信息 no = %d name = %s\n",no,name)
	}

	def postOrderSearch(no:Int): HeroNode = {
		var resNode:HeroNode = null
		// 向左递归查找
		if (this.left != null) {
			resNode = this.left.postOrderSearch(no)
		}
		if (resNode != null) {
			return resNode
		}
		// 向右递归查找
		if (this.right != null) {
			resNode = this.right.postOrderSearch(no)
		}
		if (resNode != null) {
			return resNode
		}
		println("xxxxxxx")
		if (this.no == no) {
			return this
		}
		resNode
	}
}

class BinaryTree{
	var root:HeroNode = null
	// 前序查找
	def preOrderSearch(no:Int):HeroNode = {
		if (root != null) {
			return root.preOrderSearch(no)
		}
		else {
			return null
		}
	}

	// 前序遍历
	def preOrder(): Unit ={
		if (root == null) {
			println("当前二叉树为空")
			return
		}
		root.preOrder()
	}
	// 中序遍历
	def infixOrder(): Unit ={
		if (root == null){
			println("当前二叉树为空")
			return
		}
		root.infixOrder()
	}
		// 中序查找
	def infixOrderSearch(no:Int):HeroNode ={
		if (root != null) {
			return root.infixOrderSearch(no)
		}
		else {
			return null
		}
	}

	// 后序遍历
	def postOrder(): Unit ={
		if (root == null){
			println("当前二叉树为空")
			return
		}
		root.postOrder()
	}
	// 后序查找
	def postOrderSearch(no:Int):HeroNode = {
		if (root != null) {
			return root.postOrderSearch(no)
		}
		else {
			return null
		}
	}
}
