/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 20:11
	* Project:ScalaLearning
	* FileName:ImplicitClassDemo05.scala
	* Version 1.0
	*/


package Chapter9
// 隐式类
/*
* 在Scala2.10后提供了隐式类，可以使用implicit声明类，隐式类非常强大，同样可以扩展类的功能，比前面使用隐式转换
* 丰富类库功能更加方便，在集合中隐式类会发挥重要的作用。
*
* 隐式类使用的特点：
*   1、其所带的构造参数有且只有一个
*   2、隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的（top-level objects）
*   3、隐式类不能是case calss（样例类）
*   4、作用域内不能有与之同名称的标识符
* */
object ImplicitClassDemo05 {
	def main(args: Array[String]): Unit = {
		// DB1会对应生成隐式类
		// DB1是一个隐式类，当在该隐式类的作用域的范围内创建一个实例，该隐式类就会生效，这个工作是编译器完成。
		implicit class DB1(val m:MySQL1){
			def addSuffix(): String ={
				m + "scala"
			}
		}
		val mySQL1= new MySQL1
		mySQL1.sayOK()
		// mySQL1.addSuffix() <==> DB1$1(mySQL1).addSuffix()
		// DB1$1(mySQL1)返回的类型是ImplicitClass$DB1$2
		println(mySQL1.addSuffix())
	}
}

class MySQL1{
	def sayOK(): Unit ={
		println("sayOk...")
	}
}

