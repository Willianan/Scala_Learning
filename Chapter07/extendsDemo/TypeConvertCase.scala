/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 20:48
	* Project:ScalaLearning
	* FileName:TypeConvertCase.scala
	* Version 1.0
	*/
package Chapter7.extendsDemo

object TypeConvertCase {
	def main(args: Array[String]): Unit = {
		val student = new student4
		val emp = new emp4
		test(student)
		test(emp)
	}

	//写一个参数多态代码
	//因为在oop中一个父类的引用可以接收所有子类的引用，多态（参数多态）
	def test(p: Person4): Unit = {
		//使用Scala中类型检查和转换
		if (p.isInstanceOf[emp4]) { // 判断
			//p.asInstanceOf[T] 对p的类型没有任何改变，而是返回一个新的类型
			p.asInstanceOf[emp4].show()
		}
		else if (p.isInstanceOf[student4]) {
			p.asInstanceOf[student4].showInfo()
		}
		else {
			println("转换失败")
		}
	}
}

class Person4 {
	def printName(): Unit = {
		println("Person4 printName()")
	}

	def sayOk(): Unit = {
		println("Person4 sayOk()")
	}
}

class student4 extends Person4 {
	val stuId = 100

	override def printName(): Unit = {
		println("student4 printName()")
	}

	def showInfo(): Unit = {
		println("Student4 Info: " + this.stuId)
	}
}

class emp4 extends student4 {
	val empId = 500

	override def printName(): Unit = {
		println("emp4 printName()")
	}

	def show(): Unit = {
		println("emp4 Info: " + this.empId)
	}
}