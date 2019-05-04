/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/20 9:41
	* Project:ScalaLearning
	* FileName:DoubleLinkedList.scala
	* Version 1.0
	*/


package Chapter19.LinkedList

import scala.util.control.Breaks.{break, breakable}

object DoubleLinkedListDemo {
	def main(args: Array[String]): Unit = {
		val hero1 = new HeroNode2(1, "宋江", "及时雨")
		val hero3 = new HeroNode2(3, "吴用", "智多星")
		val hero4 = new HeroNode2(4, "公孙胜", "入云龙")
		val hero2 = new HeroNode2(2, "卢俊义", "玉麒麟")
		val doubleLinkedList = new DoubleLinkedList
		doubleLinkedList.add(hero1)
		doubleLinkedList.add(hero3)
		doubleLinkedList.add(hero4)
		doubleLinkedList.add(hero2)
		doubleLinkedList.list()
		println("==================================")
		val hero5 = new HeroNode2(2,"xxx","zzz")
		doubleLinkedList.update(hero5)
		doubleLinkedList.list()

		doubleLinkedList.delete(3)
		doubleLinkedList.delete(2)
		println("------------------------------")
		doubleLinkedList.list()
	}
}

class DoubleLinkedList{
	val head = new HeroNode2(0,"","")
	// 添加 -- 遍历 -- 修改 -- 删除
	// 添加
	def add(heroNode: HeroNode2): Unit = {
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
		heroNode.pre = temp
	}


	// 遍历双向链表
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

	// 修改结点的值,根据编号为前提
	def update(newHeroNode: HeroNode2): Unit ={
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
	// 自我删除
	def delete(no:Int): Unit ={
		// 判断当前链表是否为空
		if (head.next == null) {
			println("链表为空...")
			return
		}
		var temp = head.next
		var flag = false      // 标志用于确实是否有要删除的结点
		breakable {
			while (true) {
				if (temp == null) {
					break()
				}
				if (temp.no == no) {
					flag = true
					break()
				}
				temp = temp.next
			}
		}
		if (flag){
			temp.pre.next = temp.next
			if (temp.next != null){
				temp.next.pre = temp.pre
			}
		}
		else {
			printf("要删除的第 %d 个结点不存在\n",no)
		}
	}
}


class HeroNode2(hNo: Int, hName: String, hNickname: String) {
	var no: Int = hNo
	var name: String = hName
	var nickname: String = hNickname
	var pre:HeroNode2 = null    // 前驱结点pre默认为null
	var next: HeroNode2 = null // 后驱结点next默认为null
}