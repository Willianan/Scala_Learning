/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/30 9:12
	* Project:ScalaLearning
	* FileName:testTiger.scala
	* Version 1.0
	*/


package Chapter7.ScalaPackage

object testTiger {
	def main(args: Array[String]): Unit = {
		// 使用xh的Tiger
		val tiger1 = new Chapter7.ScalaPackage.xh.Tiger
		// 使用xm的Tiger
		val tiger2 = new Chapter7.ScalaPackage.xm.Tiger
		println(tiger1 + " " + tiger2)

	}
}

// 基本语法：package 包名
/*
* Scala包的三大作用
*   1、区分相同名字的类
*   2、当类很多时，可以很好的管理类
*   3、控制访问范围
*   4、可以对类的功能进行扩展
*
* */
// Scala中包名和源码所在的系统文件目录结构可以不一致，但是编译后的字节码文件路径和包名会保持一致。

/*
* Scala包的命名
*   命名规则：
*     只能包含数字、字母、下划线、小圆点，但是不能用数字开头，也不要使用关键字
*   命名规范：
*     一般都是小写字母+小圆点
*     一般是com.公司名.项目名.业务模块名
* */