/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/28 14:52
	* Project:ScalaLearning
	* FileName:PropertyDemo.scala
	* Version 1.0
	*/


package Chapter6.oop

object PropertyDemo {
	def main(args: Array[String]): Unit = {
//		val p1 = new Person
//		println(p1.name)                // null
//		println(p1.address)             // String类型
		val a = new A
		println(a.var1)                   // null
		println(a.var2)                   // 0
		println(a.var3)                   // 0.0
		println(a.var4)                   // false
	}
}

class Person111 {
	var age: Int = _
	var sal: Float = _
	var name = null
	var address: String = null
}

class A {
	var var1 : String = _ // ""
	var var2 : Byte = _   // 0
	var var3 : Double = _ // 0.0
	var var4 : Boolean = _ // false
}

/*
* 属性/成员变量
*   1、属性的定义语法同变量，示例：[访问修饰符] var 属性名称[: 类型] = 属性值
*   2、属性的定义类型可以为任意类型，包含值类型或引用类型
*   3、Scala中声明一个属性，必须显示的初始化，然后根据初始化数据的类型自动推导，属性类型可以省略
*   4、如果赋值为null，则移动要加类型，因为不加类型，那么该属性的类型就是null类型
*   5、如果在定义属性时，暂时不赋值，也可以使用符号_(下划线)，让系统分配默认值
*   6、不同对象的属性时对立的，互不影响，一个对象对属性的更改，不影响另外一个
*
* */

