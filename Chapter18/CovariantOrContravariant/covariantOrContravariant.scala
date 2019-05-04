/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/17 17:11
	* Project:ScalaLearning
	* FileName:covariantOrContravariant.scala
	* Version 1.0
	*/


package Chapter18.CovariantOrContravariant

object covariantOrContravariant {
	def main(args: Array[String]): Unit = {
		val t1:Temp[Sub] = new Temp[Sub]("hello!")
		println(t1)
		val t2:Temp1[Super] = new Temp1[Sub]("hello....")
		println(t2)
		val t3:Temp2[Sub] = new Temp2[Super]("hello!!!!!!!")
		println(t3)
	}
}

// 逆变
class Temp2[-A](title:String){
	override def toString: String = title
}

// 协变
class Temp1[+A](title:String){
	override def toString: String = title
}


// 不变
class Temp[A](title:String){
	override def toString: String = title
}

// 支持协变
class Super // 父类

// Sub是Super的子类
class Sub extends Super