/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 13:59
	* Project:ScalaLearning
	* FileName:Accompany.scala
	* Version 1.0
	*/


package Chapter8.Accompany

object Accompany {
	def main(args: Array[String]): Unit = {
		println(ScalaPerson.sex)//true  在底层等价于ScalaPerson$.MODULE$.sex
		ScalaPerson.sayHi()     // 在底层等价于ScalaPerson$.MODULE$.sayHi()
	}
}

/*
* 1、当同一个文件中，有 class xxx 和 object xxx
* 2、class xxx 称为伴生类，将非静态的内容写到该类中
* 3、object xxx  称为伴生对象，将静态的内容写入到该对象（类）
* 4、class xxx 编译后底层生成xxx类：xxx.class
* 5、object xxx 编译后底层生成xxx$类：xxx$.class
* 6、对于伴生对象的内容，可以直接通过xxx.属性或方法
* */

//伴生类
class ScalaPerson{
	var name: String = _
}

// 伴生对象
object ScalaPerson{
	var sex: Boolean = true
	def sayHi(): Unit ={
		println("Hello....")
	}
}

/*
* 静态属性和静态方法
*
*   1、Scala中伴生对象采用object关键字声明，伴生对象中声明的全是“静态”内容，可以通过伴生对象名称直接调用
*   2、伴生对象对于的类称之为伴生类，伴生对象的名称应该和伴生类名一致
*   3、伴生对象中的属性和方法都可以通过伴生对象名（类名）直接调用访问
*   4、从语法角度来讲，所谓的伴生对象其实就是类的静态方法和成员的集合
*   5、从技术角度来讲，Scala还是没有生成静态的内容，只不过是将伴生对象生成了一个新的类，实现属性和方法的调用。
*   6、从底层原理看，伴生对象实现静态特性是依赖于public static final MODULE$实现的
*   7、伴生对象的声明应该和伴生类的声明在同一个源码文件中（如果不再同一个文件中会运行错误），但是如果没有伴生类，
*      也就没有所谓的伴生对象了，所以放在哪里都无所谓了
*   8、如果class A独立存在，那么A就是一个类，如果object A独立存在，那么A就是一个“静态”性质的对象（即类对象），
*       在object A中声明的属性和方法可以通过A.属性和A.方法来实现调用
*   9、当一个文件中，存在伴生类和伴生对象时，文件的图标会发变化
*
* */
