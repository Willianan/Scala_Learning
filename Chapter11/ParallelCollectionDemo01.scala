/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/7 15:05
	* Project:ScalaLearning
	* FileName:ParallelCollectionDemo01.scala
	* Version 1.0
	*/


package Chapter11

// 扩展 --- 并行集合
/*
* 1、Scala为了充分使用多核CPU，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算
* 2、主要用到的算法有：
*   （1）Divide and Conquer：分治算法，Scala通过splitters、combiners等抽象层来实现，主要原理
*        是将计算工作分解很多任务，分发给一些处理器去完成，并将它们处理结果合并返回
*   （2）Work Stealin算法，主要用于任务调度负载均衡（load-balancing），通俗点完成自己的所有任务
*        之后，发现其他人还要任务没有完成，主动（或被安排）帮着完成，达到最快完成任务的目的。
* */
object ParallelCollectionDemo01 {
	def main(args: Array[String]): Unit = {
		(1 to 5).foreach(println(_))
		println()
		// 这里的输出结果是无序的，说明是将println任务分配给不同的CPU
		(1 to 5).par.foreach(println(_))

		// 查看并行集合中元素访问的线程
		val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }.distinct
		val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }.distinct
		println(result1	)
		println("-----------------------------")
		println(result2)
	}
}
