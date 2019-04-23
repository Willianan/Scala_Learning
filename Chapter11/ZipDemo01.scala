/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/6 15:21
	* Project:ScalaLearning
	* FileName:ZipDemo01.scala
	* Version 1.0
	*/


package Chapter11

object ZipDemo01 {
	// 扩展--拉链（合并）
	// 将两个集合进行对偶元组合并，可以使用拉链
	def main(args: Array[String]): Unit = {
		val list1 = List(1,2,3)
		val list2 = List(4,5,6)

		val list3 = list1.zip(list2)      // List((1,4), (2,5), (3,6))
		println("list3 = " + list3)

		//取出对偶元组的数据
		for (item <- list3) {
			println(item._1 + " " + item._2)  // 取出时，按照元组的方式取出
		}
	}
}
/*
* 1、拉链的本质就是两个集合的合并操作，合并后每个元素是一个对偶元组。
* 2、操作规则：一个集合出一个元素，另外一个集合出一个元素，组成对偶元组的一个元素
* 3、如果两个集合个数不对应，会造成数据丢失
* 4、集合不限于List，也可以是其他集合
* 5、如果要取出合并后的各个对偶元组的数据，可以遍历
*
* */
