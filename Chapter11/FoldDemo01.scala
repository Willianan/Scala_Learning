/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/5 21:47
	* Project:ScalaLearning
	* FileName:FoldDemo01.scala
	* Version 1.0
	*/


package Chapter11

object FoldDemo01 {
	// 折叠
	// fold函数将上一步返回值作为函数的第一个参数继续传递参与运算，直到list中的所有元素被遍历
	//foldLeft和foldRight缩写方式分别是： /: 和 :\
	def main(args: Array[String]): Unit = {
		val list = List(1,2,3,4,5,6)

		//理解list.foldLeft(7)(minus)  理解成List(7,1,2,3,4,5,6) List.reduceLeft(minus)
		// 步骤(7-1)
		// 步骤((7-1)-2)
		// 步骤(((7-1)-2)-3)
		// 步骤((((7-1)-2)-3)-4)
		// 步骤(((((7-1)-2)-3)-4)-5)
		// 步骤((((((7-1)-2)-3)-4)-5)-6) = -14
		println(list.foldLeft(7)(minus))
		println((7/:list)(minus))
		println(list.foldRight(7)(minus))
		println((list:\7)(minus))

	}
	def minus(num1:Int,num2:Int): Int ={
		num1 - num2
	}
}
