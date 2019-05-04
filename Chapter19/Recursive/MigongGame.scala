/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/21 14:21
	* Project:ScalaLearning
	* FileName:MigongGame.scala
	* Version 1.0
	*/


package Chapter19.Recursive

object MigongGame {
	def main(args: Array[String]): Unit = {
		// 地图
		val map = Array.ofDim[Int](8,7)
		// 上下全部是1
		for (i <- 0 until 7) {
			map(0)(i) = 1
			map(7)(i) = 1
		}
		// 左右全部是1
		for (i <- 0 until 8){
			map(i)(0) = 1
			map(i)(6) = 1
		}
		// 设置挡板
		map(3)(1) = 1
		map(3)(2) = 1
		// 打印地图
		for (i <- 0 until 8) {
			for (j <- 0 until 7) {
				printf(map(i)(j) + " ")
			}
			println()
		}
		// 测试递归回溯方法
		setWay(map,1,1)
		// 打印新的地图
		println("=======================")
		for (i <- 0 until 8) {
			for (j <- 0 until 7) {
				printf(map(i)(j) + " ")
			}
			println()
		}
	}

	// 使用递归回溯
	def setWay(map:Array[Array[Int]],i:Int,j:Int):Boolean = {
		/*
		 * @functional description: 迷宫地图路线策略
		 * @param map:表示地图
		 * @param i,j:指定从地图哪个点出发
		 * @return:boolean
		 * @Author:Charles Van
		 * @Date:2019/4/21 15:42
		 */
		if (map(6)(5) == 2) { // 表示已经找到路了
			return true
		}
		else {
			if(map(i)(j) == 0){  // 0:可以走还没有
				// 这里开始递归回溯
				map(i)(j) = 2
				if (setWay(map,i+1,j)){ // 往下找
					return true
				}
				else if (setWay(map,i,j+1)){   // 往右找
					return true
				}
				else if (setWay(map,i-1,j)){   // 往上找
					return true
				}
				else if (setWay(map,i,j-1)){
					return true
				}
				else {
					// 走不通
					map(i)(j) = 3
					return false
				}
			}
			else {// 如果map(i)(j) !=0
				return false
			}
		}
	}
}

