/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/10 15:58
	* Project:ScalaLearning
	* FileName:CustomerService.scala
	* Version 1.0
	*/
package Chapter15.CustomerCRM.Service

import Chapter15.CustomerCRM.Bean.Customer

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

class CustomerService {
	var customerNum = 1
	// customers是存放客户的，这里初始化，为了测试
	val customers = ArrayBuffer(new Customer("Tom",'男',10,"12345678901","Tom@sohu.com"))

	def list(): ArrayBuffer[Customer] ={
		this.customers
	}
	// 添加客户
	def add(customer: Customer): Boolean ={
		// 设置Id
		customerNum += 1
		customer.id = customerNum
		// 加入到Customers
		customers.append(customer)
		true
	}

	// 删除客户
	def del(id:Int): Boolean ={
		val index = findIndexById(id)
		if (id != -1) {
			customers.remove(index)
			true
		}
		else {
			println("该用户不存在")
			false
		}
	}

	// 根据id找到index
	def findIndexById(id:Int) = {
		var index = -1 // 默认-1，如果找到就改成对应的，否则返回-1
		// 遍历customers
		breakable {
			for (i <- 0 until customers.length) {
				if (customers(i).id == id) { // 找到
					index = i
					break()
				}
			}
		}
		index
	}
}
