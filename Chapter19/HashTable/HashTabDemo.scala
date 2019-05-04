/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/22 14:12
	* Project:ScalaLearning
	* FileName:HashTabDemo.scala
	* Version 1.0
	*/


package Chapter19.HashTable

import scala.io.StdIn
import util.control.Breaks._
object HashTabDemo {
	def main(args: Array[String]): Unit = {
		var key = " "
		val hashTab = new HashTab(7)
		while (true) {
			println("add: 添加雇员")
			println("list:显示雇员")
			println("find:查找雇员")
			println("exit:退出系统")

			key = StdIn.readLine()
			key match {
				case "add" => {
					println("请输入id:")
					val id = StdIn.readInt()
					println("输入名字：")
					val name = StdIn.readLine()
					val emp = new Emp(id,name)
					hashTab.add(emp)
				}
				case "list" => hashTab.list()
				case "find" => {
					println("输入待查找雇员的id：")
					val id = StdIn.readInt()
					hashTab.findEmpById(id)
				}
				case "exit" => System.exit(0)
			}
		}
	}
}

// 创建Emp类
class Emp(eId:Int,eName:String){
	val id = eId
	var name = eName
	var next: Emp = null
}

// 创建EmpLinkedList
class EmpLinkedList{
	// 定义头指针,这里的head直接指向一个雇员
	var head:Emp = null

	// 添加雇员的方法
	// 假定添加的雇员的id是自增的，即雇员分配的id总是从小到大
	// 找到链表的最后加入即可
	def add(emp: Emp): Unit ={
		// 如果是第一个雇员
		if (head == null) {
			head = emp
			return
		}
		// 定义辅助指针
		var cur = head
		breakable{
			while (true) {
				if (cur.next == null) {
					break()
				}
				cur = cur.next
			}
		}
		// 这时，cur指向了链表的最后
		cur.next = emp
	}

	// 遍历链表的方法
	def showList(i:Int): Unit ={
		if (head == null) {
			println(s"第${i}条链表为空")
			return
		}
		printf(s"第${i}条链表信息为：\t")
		var cur = head
		breakable{
			while (true){
				if (cur == null) {
					break()
				}
				// 输出雇员信息
				printf(" => id = %d name = %s\t",cur.id,cur.name)
				cur = cur.next
			}
		}
		println()
	}
	// 如果有，返回emp，否则返回null
	def findEmpById(id:Int): Emp = {
		if (head == null) {
			println("链表为空，没有数据.....")
			return null
		}
		var cur = head
		breakable {
			while (true) {
				if (cur == null) {
					break()
				}
				if (cur.id == id) {
					break()
				}
				cur = cur.next
			}
		}
		return cur
	}
}

class HashTab(val size:Int){
	val empLinkedListArray: Array[EmpLinkedList] = new Array[EmpLinkedList](size)
	// 初始化empLinkedListArray的各个元素
	for (i <- 0  until size) {
		empLinkedListArray(i) = new EmpLinkedList
	}
	def add(emp: Emp): Unit ={
		// 返回该员工应该加入到哪条链表中
		val empLinkedListNo = hashFun(emp.id)
		this.empLinkedListArray(empLinkedListNo).add(emp)
	}
	def list(): Unit ={   // 遍历整个hash表
		for (i <- 0 until size) {
			empLinkedListArray(i).showList(i)
		}
	}
	def findEmpById(id:Int): Unit ={
		val empLinkedListNo = hashFun(id)
		val emp = this.empLinkedListArray(empLinkedListNo).findEmpById(id)
		if (emp != null) {
			printf(s"在第${empLinkedListNo}个链表找到id = %d name = %s\n",id ,emp.name)
		}
		else {
			println(s"没有找到编号为${id}的雇员")
		}
	}
	// 散列函数，可以定制
	def hashFun(id:Int): Int = {
		id % size
	}
}
