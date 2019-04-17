/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 19:45
	* Project:ScalaLearning
	* FileName:AddTrait.scala
	* Version 1.0
	*/


package Chapter8.TraitMixIn

// 混入多个特质的特点（叠加特质）
// 特质声明顺序从左到右，方法执行顺序从右到左
object AddTrait {
	def main(args: Array[String]): Unit = {
		/*
		* 说明
		*   1、创建mySQL4实例时，动态的混入DB和File
		* */
		//问题1：当创建一个动态混入对象时，其顺序是怎样的（即从左到右）
		//  1、Operate4...
		//  2、Data4...
		//  3、DB4...
		//  4、File4...
		//Scala在叠加特质的时候，会首先从后面的特质开始执行
		val mySQL4 = new MySQL4 with DB4 with File4
		println(mySQL4)

		//问题2：当执行一个动态混入对象的方法时，其执行的顺序是怎样的
		//（1）顺序是从右到左开始执行，（2）当执行到suoper时，是指左边的特质（3）如果左边没有特质了，则super就父类特质
		//  1、向文件
		//  2、向数据库
		//  3、插入数据为：1000
		//  4、
		mySQL4.insert(1000)
	}
}

trait Operate4 {    // 特质
	println("Operate4...")

	def insert(id: Int) // 抽象方法
}

trait Data4 extends Operate4{    // 特质，继承了Operate0
	println("Data4")

	override def insert(id: Int): Unit = {  // 实现重写Operate0的insert
		println("插入数据为：" + id)
	}
}

trait DB4 extends Data4{  //特质，继承Data
	println("DB4...")

	override def insert(id: Int): Unit = {    // 重写Data的insert
		println("向数据库")
		super.insert(id)
	}
}

trait File4 extends Data4 {   //特质，继承了Data
	println("File4...")

	override def insert(id: Int): Unit = {    // 重写Data的insert
		println("向文件")
		super.insert(id)    //调用了insert方法（难点），这里super在动态混入时，不一定时父类
	}
}

class MySQL4{}    //普通类

/*
* 1、特质声明从左到右
* 2、Scala在执行叠加对象的方法时，会首先从后面的特质开始执行（从右到左）
* 3、Scala特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
* 4、如果想要调用具体特质的方法，可以指定：super[特质].xxx(...).其中的泛型必须时该特质的直接超类类型
* */
