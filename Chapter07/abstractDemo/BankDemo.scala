/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 16:03
	* Project:ScalaLearning
	* FileName:BankDemo.scala
	* Version 1.0
	*/


package Chapter7.abstractDemo

object BankDemo {
	def main(args: Array[String]): Unit = {
		val account = new Account("gh12343432432",8000,"121121")
		account.query("121121")
		account.withDraw("121121",3000)
		account.query("121121")
		account.deposit("121121",4500)
		account.query("121121")

	}
}
// 编写一个Account类
class Account(inAccount:String,inBalance:Double,inPwd:String){
	private val accountNo = inAccount
	private var balance = inBalance
	private var pwd = inPwd

	def query(pwd:String): Unit ={
		if (!this.pwd.equals(pwd)) {
			println("password error")
			return
		}
		printf("账号为%s 当前余额是%.2f\n",this.accountNo,this.balance)
	}

	def withDraw(pwd:String,money:Double): Any ={
		if (!this.pwd.equals(pwd)) {
			println("密码错误")
			return
		}
		if (this.balance < money) {
			println("余额不足")
			return
		}
		this.balance -= money
		money
	}
	def deposit(pwd:String,money:Double): Any ={
		if (!this.pwd.equals(pwd)) {
			println("密码错误")
			return
		}
		this.balance += money
		money
	}
}
/*
* 1、在Scala中为了简化代码的开发，当声明属性时，本身就自动提供了对应setter/getter方法，如果属性声明为private，那么自动生成
* 的setter/getter方法也是private的，如果属性省略访问权限修饰符，那么自动生成的setter/getter方法也是public的
* 2、如果只是对一个属性进行简单的set和get，只要声明一下该属性（属性使用默认访问修饰符）不要专门写getset，默认会创建。访问时，
* 直接对象，变量。也是为了报错访问一致性
* 3、从形式上看直接访问属性，其实在底层任然时访问的方法
* 4、有了上面的特性，目前很多新的框架在进行反射时，也支持对属性的直接反射。
* */
