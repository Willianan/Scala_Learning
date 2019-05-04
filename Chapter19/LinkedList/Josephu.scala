/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/20 10:20
	* Project:ScalaLearning
	* FileName:Josephu.scala
	* Version 1.0
	*/


package Chapter19.LinkedList

import util.control.Breaks.{break,breakable}
object Josephu {
	def main(args: Array[String]): Unit = {
		val josephuGame = new josephuGame
		josephuGame.addChild(7)
		josephuGame.showChildren()
		josephuGame.countChildren(4,3,7)
	}
}

// 定义小孩
class Child(no:Int){
	val No:Int = no
	var next:Child = null
}

class josephuGame{
	// 定义一个初始的头结点
	var first:Child = new Child(-1)
	// 添加小孩[形成一个单向环形的链表]
	// nums:共有几个小孩
	def addChild(nums:Int): Unit ={
		if (nums < 1) {
			println("nums的值不正确")
			return
		}
		var curChild:Child = null
		for (no <- 1 to nums) {
			// 根据编号创建小孩
			val child = new Child(no)
			if (no == 1) {
				first = child
				first.next = first  // 形成一个环形的链表
				curChild = first
			}
			else {
				curChild.next = child
				child.next = first
				curChild = child
			}
		}
	}
	// 编写countChildren，完成游戏
	def countChildren(startNo:Int,countNum:Int,nums:Int): Unit ={
		/* 
		 * @functional description: 实现约瑟夫问题
		 * @param startNo:从第几个开始数
		 * @param countNum:间隔的数
		 * @param nums:总共多少人
		 * @return:void
		 * @Author:Charles Van
		 * @Date:2019/4/20 11:44
		 */
		if (first.next == null || startNo < 1 || startNo > nums) {
			println("参数有误，请重新输入.....")
			return
		}
		var helper = first
		// 将helper指针定位到first前面
		breakable{
			while (true) {
				if (helper.next == first) {
					break()
				}
				helper = helper.next
			}
		}
		// 将first指针移动到startNo，helper指针对应移动
		for (i <- 0 until startNo - 1) {
			first = first.next
			helper = helper.next
		}
		// 开始数数，按照给定的值，每数到一个小孩就出圈，直到环形链表只有一个结点
		breakable{
			while (true) {
				if (helper == first) {
					break()
				}
				// 开始countNum个数[first和helper会对应的移动]
				for (i <- 0 until countNum - 1) {
					first = first.next
					helper = helper.next
				}
				// 输出出圈的人的信息
				printf("第%d个小孩出圈\n",first.No)
				// 将first指向的结点删除
				first = first.next
				helper.next = first
			}
		}
		printf("最后留在圈里面第%d个小孩....",first.No)
	}
	// 遍历单向环形链表
	def showChildren(): Unit ={
		if (first.next == null) {
			println("没有任何小孩......")
			return
		}
		// 因为first不能动，借助一个辅助指针完成遍历
		var curChild = first
		breakable{
			while (true) {
				printf("小孩的编号：%d\n",curChild.No)
				if (curChild.next == first) {
					break()
				}
				curChild = curChild.next  // 后移
			}
		}
	}
}
