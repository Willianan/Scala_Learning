/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/10 15:58
	* Project:ScalaLearning
	* FileName:CustomerView.scala
	* Version 1.0
	*/
package Chapter15.CustomerCRM.View

import Chapter15.CustomerCRM.Bean.Customer
import Chapter15.CustomerCRM.Service.CustomerService

import scala.io.StdIn
import util.control.Breaks._

class CustomerView {
	// 定于一个循环变量，控制是否退出while
	var loop = true
	// 定义一个key接收用户的输入
	var key: Char = _
	val customerService = new CustomerService()

	def mainMenu(): Unit = {

		do {
			println("----------------------------客户信息管理软件----------------------------")
			println("                             1 添加客户信息")
			println("                             2 修改客户信息")
			println("                             3 删除客户信息")
			println("                             4 客户信息列表")
			println("                             5    退   出  ")
			println("                      请选择（1～5）：")
			key = StdIn.readChar()
			key match {
				case '1' => this.add()
				case '2' => println("修改客户信息")
				case '3' => this.del()
				case '4' => this.list()
				case '5' => this.loop = false
			}

		} while (loop)
		println("你退出了软件系统")
	}

	def list(): Unit = {
		println()
		println("----------------------------客户信息列表----------------------------")
		println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
		// 遍历
		// 1、获取CustomerService的customers ArrayBuffer
		val customers = customerService.list()
		for (customer <- customers) {
			// 重写Customer的toString方法，返回信息（并格式化）
			println(customer)
		}
		println("-----------------------------客户列表完成-----------------------------")
	}

	def add(): Unit = {
		println()
		println("-----------------------------添加客户信息-----------------------------")
		println("姓名：")
		val name = StdIn.readLine()
		println("性别：")
		val gander = StdIn.readChar()
		println("年龄：")
		val age = StdIn.readShort()
		println("电话：")
		val tel = StdIn.readLine()
		println("邮箱：")
		val email = StdIn.readLine()
		val customer = new Customer(name, gander, age, tel, email)
		customerService.add(customer)

		println("-----------------------------添加客户完成-----------------------------")
	}

	def del(): Unit = {
		println()
		println("-----------------------------删除客户信息-----------------------------")
		println("请选择待删除客户编号（-1退出）：")
		val id = StdIn.readChar()
		if (id == -1) {
			println("-----------------------------删除没有完成---------------------------")
			return
		}
		println("确认是否删除(Y/N)：")
		var choice = ' '
		breakable {
			do {
				choice = StdIn.readChar().toLower
				if (choice == 'y' || choice == 'n') {
					break()
				}
				println("确认是否删除(Y/N)：")
			} while (true)
		}
		if (choice == 'y') {
			if (customerService.del(id)) {
				println("----------------------------删除客户完成---------------------------")
				return
			}
			else {
				println("----------------------------删除客户完成---------------------------")
			}
		}
		println("-----------------------------删除完成-----------------------------")
	}
}
