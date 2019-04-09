/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/22 16:44
	* Project:ScalaLearning
	* FileName:Exercise01.scala
	* Version 1.0
	*/


package Chapter3.exercise

/*
  假如还有97天放假，问xx个星期零几天
 1、搞清楚需求
 2、思路分析
   （1）变量保存97
   （2）使用/7得到几个星期
 （3）xx天 使用%
 3、代码实现
 */
object Exercise01 {
	def main(args: Array[String]): Unit = {
		val days = 97
		println("统计结果是%d个星期零%d天",days / 7,days % 7)

		/*
		定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100），
		请求出华氏温度对应的摄氏温度。[测试：232.5]
		1.变量保存华氏温度，变量保存摄氏温度
		2.公式有，就直接使用
		 */
		val Fahrenheit = 232.5
		val Celsius = 5.0 / 9 * (Fahrenheit - 100)
		println("Fahrenheit:" + Fahrenheit+" became Celsius is "+Celsius)

	}

}
