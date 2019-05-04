/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 21:57
	* Project:ScalaLearning
	* FileName:GenericDemo02.scala
	* Version 1.0
	*/
package Chapter18.Generic

import Chapter18.Generic.SeasonEnum

object GenericDemo02 {
	def main(args: Array[String]): Unit = {
//		val class01 = new EnglishClass[SeasonEnum.SeasonEnum, String, String](SeasonEnum.spring, "0705班", "高级班")
//		println("class01: " + class01.classSeason + " " + class01.className + " " + class01.classType)
	}
}

class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

// Scala枚举类型
class SeasonEnum extends Enumeration {
	type SeasonEnum = Value // 自定义SeasonEnum，Value类型才能使用
	val spring, autumn, summer, winter = Value
}

