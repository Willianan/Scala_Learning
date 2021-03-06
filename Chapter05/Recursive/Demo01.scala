/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/26 15:23
	* Project:ScalaLearning
	* FileName:Demo01.scala
	* Version 1.0
	*/


package Chapter5.Recursive

object Demo01 {
	def main(args: Array[String]): Unit = {
		test(4)
		test2(4)
	}
	def test(n : Int):Unit = {
		if (n > 2){
			test(n - 1)
		}
		println("n = " + n)
	}
	def test2(n : Int): Unit = {
		if (n > 2){
			test2(n-1)
		}
		else {
			println("n = " + n)
		}
	}
}
/*
* 1、执行一个函数时，就创建一个新的受保护的独立空间（新函数栈）
* 2、函数的局部变量是独立的，不会相互影响
* 3、递归必须向退出递归的条件逼近，否则就是无限递归
* 4、当一个函数执行完毕，或者遇到return就会返回，遵守谁调用就将结果返回给谁
* */
