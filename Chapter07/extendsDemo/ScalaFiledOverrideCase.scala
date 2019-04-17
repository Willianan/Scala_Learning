/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 9:28
	* Project:ScalaLearning
	* FileName:ScalaFiledOverrideCase.scala
	* Version 1.0
	*/


package Chapter7.extendsDemo

object ScalaFiledOverrideCase {

	/*
	* 覆写字段
	*   1、def只能重写另一个def（即：方法只能重写另一个方法）
	*   2、val只能重写另一个val属性或重写不带参数的def
	*   3、var只能重写另一个抽象的var属性
	* */
	def main(args: Array[String]): Unit = {
		println("xxxxxxxxxxxxx")
		val bbbbb = new BBBBB
		// bbbb.name = "Jack"       //*1*编译通过 相当于调用了父类的name_$eq()
		// println(bbbb.name)       //*1*编译通过 相当于调用了子类的name()
		// 这样出现数据设置和数据获取不一致
		println(bbbbb.sal)
	}
}


class AAAAA{
	//var name: String = ""     //*1* 底层会生成public name() 和 public name_$eq()
	val name: String = ""       // 底层会生成public name()

	def sal(): Int ={
		return 10
	}
}

class BBBBB extends AAAAA{
	override val name: String = "Tom"         //底层生成public name()
	override val sal: Int = 0
}

//有一个抽象的字段（属性）
/*
* 1、抽象的字段（属性）：就是没有初始化的字段（属性）
* 2、当一个类含有抽象属性时，则该类需要标记abstract
* 3、对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法（name()  name_$eq()）
* */
abstract class A03{
	var name: String      // 抽象
	var age: Int
}

class Sub_A03 extends A03{
	// 说明
	//    1、如果在子类中去重写父类的抽象属性，本质上是实现了抽象方法
	//    2、因此这里可以写override，也可以不用写
	override var name: String = ""
	var age: Int = 10
}