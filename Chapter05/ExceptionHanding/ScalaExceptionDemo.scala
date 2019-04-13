/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/27 16:16
	* Project:ScalaLearning
	* FileName:SCalaExceptionDemo.scala
	* Version 1.0
	*/


package Chapter5.ExceptionHandling

object ScalaExceptionDemo {
	def main(args: Array[String]): Unit = {
		try {
			val r = 10 / 0
		}
		catch {
			//说明
			//  1、在Scala中只要一个catch
			//  2、在catch中有多个case，每个case可以匹配一个异常（case ex: ArithmeticException）
			//  3、=> 关键符号，表示后面是对该异常的处理代码块
			//  4、finally：最终要执行的
			case ex: ArithmeticException => {
				println("捕获了除数为零的算术异常")
			}
			case ex: Exception => println("捕获了异常")
		}
		finally {
			// 最终要执行的代码（释放资源）
			println("Scala finally .....")
		}
		println("ok,继续执行.....")
	}
}

/*
* 异常
* scala提供try和catch块来处理异常。try块用于包含可能出错的代码。catch块用于处理try块中发生的异常。
* 可以根据需要在程序中有任意数量的try...catch块
* */

//异常处理
/*
*   1、将可疑代码封装在try块中。在try块之后使用一个catch块处理程序来捕获异常。如果发生任何异常，catch处理程序
*   将处理它，程序将不会异常终止。
*   2、Scala的异常的工作机制和Java一样，但是Scala没有“checked（编译期）”异常，即Scala没有编译异常这个概念，
*   异常都是在运行时捕获处理。
*   3、用throw关键字，抛出一个异常对象。所有异常都是throwable的子类型。throw表达式是有类型的，就是Nothing，因为
*   Nothing时所有类型的子类型，所以throw表达式可以用在需要类型的地方
*   4、在Scala中，借用模式匹配的思想来做异常的匹配，因此在catch的代码里，是一系列case子句来匹配异常。当匹配上
*   后 => 有多条语句可以换行写，类似Java的switch case x: 代码块....
*   5、异常捕捕捉的机制于其他语言一样，如果异常发生，catch子句是按次序捕捉的。因此，在catch子句中，越具体的异常越要
*   靠前，越普通的异常越靠后，如果把普通的异常写在前，把具体的异常写在后没在Scala中也不会报错，但这样是非常不好的编程风格
*   6、finally子句用于执行，不管是正常处理还是有异常发生时都需要执行的步骤，一般用于对象的清理工作
*   7、Scala提供throws关键字来声明异常。可以使用方法定义声明异常。它向调用者函数提供此方法可能引发异常的信息。
*   它有助于调用函数处理并将该代码包含在try-catch块中，以避免程序异常终止。在Scala中，可以使用throws注释啦声明异常
* */

