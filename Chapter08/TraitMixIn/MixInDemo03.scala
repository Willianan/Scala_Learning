/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 21:01
	* Project:ScalaLearning
	* FileName:MixInDemo03.scala
	* Version 1.0
	*/
package Chapter8.TraitMixIn

object MixInDemo03 {
	// 富接口：该特质既有抽象方法，也有非抽象方法
	def main(args: Array[String]): Unit = {
		val oracle = new MyOracle with DB6
		oracle.insert(200)
		oracle.pageQuery(20,100)
	}
}

trait Operate6 {
	def insert(id: Int)
	def pageQuery(pageNo:Int,pageSize:Int): Unit ={
		printf("查找第%d页,第%d个数据...\n",pageNo,pageSize)
		println("开始分页查找...")
	}
}

trait DB6 extends Operate6 {
	override def insert(id: Int): Unit = {
		println("输入查询数据：" + id)
	}
}

class MyOracle {

}