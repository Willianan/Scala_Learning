/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 22:00
	* Project:ScalaLearning
	* FileName:FunctionCurry02.scala
	* Version 1.0
	*/


package Chapter13

object FunctionCurry02 {
	/*
		比较两个字符串在忽略大小写的情况下是否相等，注意，这里是两个任务：
			1、全部转大写（或小写）
			2、比较是否相等
	*/
	def main(args: Array[String]): Unit = {
		val str1 = "hello"
		println(str1.checkEq("HELLO")(eq))
		println(str1.checkEq("HELLO")(_.equals(_)))
	}
	// 方式1
	def eq2(s1:String)(s2:String): Boolean = {
		s1.toLowerCase == s2.toLowerCase
	}
	// 方式2：可以接收两个字符串，比较是否相等
	def eq(s1:String,s2:String): Boolean = {
		s1.equals(s2)
	}
	// 隐式类
	implicit class TestEq(s:String){
		//体现了将比较字符串的事情，分解成两个任务完成
		//  1、checkEq 完成转换大小写任务
		//  2、f函数完成比较任务
		def checkEq(ss:String)(f:(String,String)=> Boolean): Boolean = {
			f(s.toLowerCase,ss.toLowerCase)
		}
	}
}
