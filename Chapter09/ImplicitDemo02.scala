/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/1 16:35
	* Project:ScalaLearning
	* FileName:ImplicitDemo02.scala
	* Version 1.0
	*/
package Chapter9

object ImplicitDemo02 {
	// 隐式转换丰富类库功能(OCP开发原则)
	def main(args: Array[String]): Unit = {
		// 编写一个隐式函数，丰富MySQL功能
		implicit def addDelete(mySQL: MySQL): DB = {
			new DB
		}
		val mysql = new MySQL
		mysql.insert()
		mysql.delete()      //addDelete$1(mysql).delete()
	}
}

class MySQL{
	def insert(): Unit ={
		println("insert")
	}
}

class DB{
	def delete(): Unit ={
		println("delete")
	}
}