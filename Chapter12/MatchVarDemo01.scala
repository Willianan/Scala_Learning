/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 14:42
	* Project:ScalaLearning
	* FileName:MatchVarDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchVarDemo01 {
	// 变量声明中的模式
	def main(args: Array[String]): Unit = {
		val (x,y) = (1,2)
		println(x,y)
		val (q,r) = BigInt(10) /% 3  // 说明 q = BigInt(10) / 3  r = BigInt(10) % 3
		println(q,r)
		val array = Array(1,7,2,9)
		val Array(first,second,_*) = array      // 提出array的前两个元素
		println(first,second)
	}
}
