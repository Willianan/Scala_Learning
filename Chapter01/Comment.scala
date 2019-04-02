/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/20 18:21
	* Project:ScalaLearning
	* FileName:Comment.scala
	* Version 1.0
	*/


package Chapter1

object Comment {
	def main(args: Array[String]): Unit = {
		// 文档注释使用scaladoc -d document-path xxx.scala-path
		println("Hello World!")
		print(sum(10,20))
	}
	/* function annotation
	 * @Auther:Charles·Van
	 * @Description 
	 * @example
	 *  n1 = 10 n2 = 20 sum = 30
	 * @Date:18:46 2019/3/20
	 * @Param [n1, n2]
	 * @return sum:int
	 **/
	def sum(n1:Int,n2:Int):Int = {
		return n1+n2
	}
}
