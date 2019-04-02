/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 15:51
	* Project:ScalaLearning
	* FileName:PrintDemo.scala
	* Version 1.0
	*/


package Chapter1

object PrintDemo {
	def main(args: Array[String]): Unit = {
		// Scala 输出的三种方式
		//1、字符串通过+连接（类似java）
		//2、printf用法（类似C语言）字符串通过%传值
		//3、字符串通过$引用（类似PHP）
		var str1:String = "Hello"
		var str2:String = " World"
		println(str1+str2)
		//格式化输出
		var name:String = "Tom"
		var age :Int = 23
		var sal:Float = 10.23f
		var height:Double = 183.67
		printf("name:%s,age:%d,sal:%.2f,height:%.3f",name,age,sal,height)
		// scala支持使用$输出内容,编译器会去解析$对应的变量
		println(s"\n个人信息:\n姓名：$name\n年龄：$age\n薪水：$sal\n身高：$height")
		//如下{}中的内容为一个表达式
		println(s"\n个人信息:\n姓名：${name}\n年龄：${age+10}\n薪水：${sal * 100}\n身高：${height}")

	}

}
