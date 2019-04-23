/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 15:35
	* Project:ScalaLearning
	* FileName:OperatorDemo01.scala
	* Version 1.0
	*/


package Chapter11

object OperatorDemo01 {
	// 扩展 --- 操作符
	/*
	* 1、如果想在变量名、类名等定义中使用语法关键字（保留字），可以配合反引号
	* 2、中置操作符：A操作符B 等价于 A.操作符(B)
	* 3、后置操作符：A操作符 等价于A.操作符，如果操作符定义的是哈韩不带()则调用时不能加括号
	* 4、前置操作符：+、-、!、~等操作符A 等同于 A.unary_操作符
	* 5、赋值操作符：A 操作符= B  等同于 A = A 操作符 B
	* */
	def main(args: Array[String]): Unit = {
		val n1 = 1
		val n2 = 2
		var r1 = n1 + n2
		var r2 = n1.+(n2)
		println("r1 = " + r1 + " r2 = " + r2)

		// 2
		val monster = new Monster
		monster + 10
		monster.+(10)
		println("Monster.money = " + monster.money)

		// 3
		val oper = new Operate
		println(oper++)
		println(oper.++)

		// 4
		val oper1 = new Operate1
		!oper1

	}
}

class Monster{
	var money: Int = 0

	// 对操作符进行重载
	def +(n:Int): Unit ={
		this.money += n
	}
}

class Operate{
	// 定义函数/方法省略()
	def ++ = "123"
}

class Operate1 {
	// 声明前置运算符
	// unary: 一元运算符
	def unary_! = println("!!!!!!")
}