/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/27 15:21
	* Project:ScalaLearning
	* FileName:VarParameters.scala
	* Version 1.0
	*/


package Chapter5

object VarParameters {
	def main(args: Array[String]): Unit = {
		println(sum(10,30,10,23,45,76))
	}
	def sum(n1:Int,args:Int*) : Int = {
		println("args.length: "+ args.length)
		var sum = n1
		for (item <- args) {
			sum += item
		}
		sum
	}
}
