/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/19 15:26
	* Project:ScalaLearning
	* FileName:SingleLinkedListDemo.scala
	* Version 1.0
	*/


package Chapter19.LinkedList

import util.control.Breaks._

object SingleLinkedListDemo {
	def main(args: Array[String]): Unit = {
		// 测试
		val hero1 = new HeroNode(1, "宋江", "及时雨")
		val hero3 = new HeroNode(3, "吴用", "智多星")
		val hero4 = new HeroNode(4, "公孙胜", "入云龙")
		val hero2 = new HeroNode(2, "卢俊义", "玉麒麟")
		val singleLinkedList = new SingleLinkedList
		singleLinkedList.add(hero1)
		singleLinkedList.add(hero3)
		singleLinkedList.add(hero4)
		singleLinkedList.add(hero2)

		val newHeroNode = new HeroNode(3,"宋江3","及时雨3")
		singleLinkedList.update(newHeroNode)
//		singleLinkedList.add2(hero1)
//		singleLinkedList.add2(hero3)
//		singleLinkedList.add2(hero4)
//		singleLinkedList.add2(hero2)
		println("---------------------------------")
		singleLinkedList.list()
		singleLinkedList.delete(10)
		singleLinkedList.delete(3)
		singleLinkedList.list()

	}
}

// 定义单向链表
class SingleLinkedList {
	// 先初始化一个头结点，头结点一般不会动
	val head = new HeroNode(0, "", "")

	// 编写添加方法
	// 第一种方式：在添加英雄时，直接添加到链表的尾部
	def add(heroNode: HeroNode): Unit = {
		// 因为头结点不能动，因此需要有一个临时结点作为辅助
		var temp = head
		breakable {
			while (true) {
				if (temp.next == null) { // 说明temp已经时链表的最后
					break()
				}
				// 如果没有到最后就继续往下寻找
				temp = temp.next
			}
		}
		// 当退出while循环后，temp就是链表的最后
		temp.next = heroNode
	}

	// 第二种方式：添加时，根据排名将英雄插入到指定位置
	// 如果有这个排名，则添加失败
	def add2(heroNode: HeroNode): Unit ={
		// 注意：在找这个添加位置时，时将这个结点加入到temp的后面
		// 因此在比较时，是将当前的heroNode和temp.next比较
		var temp = head
		var flag =  false     // flag 是用于判断是否该英雄的编号已经存在，默认为false
		breakable{
			while (true) {
				if (temp.next == null) {
					break()
				}
				if (temp.next.no > heroNode.no){    // 位置找到，当前这个结点，应当加入到temp后
					break()
				}
				else if (temp.next.no == heroNode.no) {   // 已经有这个结点
					flag = true
					break()
				}
				temp = temp.next
			}
		}
		if (flag) {
			printf("待插入的英雄排名 %d 已经有了，不能加入....",heroNode.no)
		}
		else {
			// 加入，注意顺序问题
			heroNode.next = temp.next
			temp.next = heroNode
		}
	}
	// 修改结点的值,根据编号为前提
	def update(newHeroNode: HeroNode): Unit ={
		// 先找到结点
		if (head.next == null) {
			println("链表为空，不能修改...")
			return
		}
		var temp = head.next
		var flag = false

		breakable{
			while (true) {
				if (temp == null) {
					break()
				}
				if (temp.no == newHeroNode.no) {
					flag = true
					break()
				}
				temp = temp.next
			}
		}
		// 判断是否找到
		if (flag) {
			temp.name = newHeroNode.name
			temp.nickname = newHeroNode.nickname
		}
		else {
			printf("没有找到排名为 %d 的结点，不能修改\n",newHeroNode.no)
		}
	}
	// 删除结点
	//  1、head 不能动
	//  2、使用temp变量，要删除的应该是temp的下一个结点，即：在比较时，始终比较的是temp.next的结点值
	def delete(no:Int): Unit ={
		var temp = head.next
		var flag = false      // 标志用于确实是否有要删除的结点
		breakable {
			while (true) {
				if (temp.next == null) {
					break()
				}
				if (temp.next.no == no) {
					flag = true
					break()
				}
				temp = temp.next
			}
		}
		if (flag){
			temp.next = temp.next.next
		}
		else {
			printf("要删除的第 %d 个结点不存在\n",no)
		}
	}

	// 遍历单向链表
	def list(): Unit = {
		// 判断当前链表是否为空
		if (head.next == null) {
			println("链表为空！")
			return
		}
		// 因为头结点不能动，因此需要有一个临时结点作为辅助
		// 因为head结点数据不需要关心，因此temp = head.next
		var temp = head.next
		breakable {
			while (true) {
				// 判断是否到最后
				if (temp == null) {
					break()
				}
				println("当前英雄的信息：")
				println("排名：" + temp.no + "\t姓名：" + temp.name + "\t外号：" + temp.nickname)
				temp = temp.next
			}
		}
	}

}

class HeroNode(hNo: Int, hName: String, hNickname: String) {
	var no: Int = hNo
	var name: String = hName
	var nickname: String = hNickname
	var next: HeroNode = null // next默认为null
}