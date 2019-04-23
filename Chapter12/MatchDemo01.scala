/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 15:56
	* Project:ScalaLearning
	* FileName:MatchDemo01.scala
	* Version 1.0
	*/


package Chapter12

object MatchDemo01 {
	// 模式匹配（match）
	/*
	* scala中的模式匹配类似于Java中的switch语法，但是更加强大
	*
	* 模式匹配语法中，采用match关键字声明，每个分支采用case关键字声明，但需要匹配时，会从第一个case分支开始，
	* 如果匹配成功，那么执行对应的逻辑代码，如果匹配不成功，继续执行下一个分支进行判断，如果所有case都不匹配，
	* 那么会执行case _分支，类似Java中default语句
	* */
	def main(args: Array[String]): Unit = {
		val oper = '#'
		val n1 = 20
		val n2 = 10
		var res = 0
		oper match {
			case '+' => res = n1 + n2
			case '-' => res = n1 - n2
			case '*' => res = n1 * n2
			case '/' => res = n1 / n2
			case _ => println("operate error")
		}
		println("res = " + res)
	}
}

/*
* 1、如果所有case都不匹配，那么会执行case _ 分支
* 2、如果所有case都不匹配，又没有case _ 分支，那么会抛出MatchError
* 3、每个case中，不用break语句，自动中断case
* 4、可以在match中使用其他类型，而不仅仅是字符
* 5、=> 等价于 Java swtich的:
* 6、=> 后面的代码块到下一个case，是作为一个整体执行，可以使用{}括起来，也可以不用
* */
