/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 16:57
	* Project:ScalaLearning
	* FileName:MatchTypeDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchTypeDemo01 {
	// 类型匹配
	// 可以匹配对象的任意类型，避免使用isInstanceOf和asInstenceOf方法
	def main(args: Array[String]): Unit = {
		val a = 6
		// 说明：obj实例类型 根据a的值来返回
		val obj = if (a == 1) 1
		else if (a == 2) "2"
		else if (a == 3) BigInt(3)
		else if (a == 4) Map("aa" -> 1)
		else if (a == 5) Map(1 -> "aa")
		else if (a == 6) Array(1, 2, 3)
		else if (a == 7) Array("aa", 1)
		else if (a == 8) Array("aa")

		// 说明
		// 1、根据obj的类型来匹配
		// 返回值
		val result = obj match {
			case a: Int => a
			case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
			case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
			case d: Array[String] => "对象是一个字符串数组"
			case e: Array[Int] => "对象是一个数字数组"
			case f: BigInt => Int.MaxValue
			case _ => "啥也不是"
		}
		println(result)
	}
}
/*
* 1、Map[Sting,Int]和Map[Int,String]是两种不同的类型，其他类推
* 2、在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错
* 3、一个说明：
*     val result = obj match{
*       case i: Int => i    // 表示将i = obj（其他类推），然后再判断类型
*      }
* 4、如果case _ 出现在match中间，则表示隐藏变量名，即不使用，而不是表示默认匹配
* */
