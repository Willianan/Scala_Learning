/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 14:36
	* Project:ScalaLearning
	* FileName:ChildrenJoinGame.scala
	* Version 1.0
	*/


package Chapter8.Accompany

object ChildrenJoinGame {
	def main(args: Array[String]): Unit = {
		val child0 = new Child("白骨精")
		val child1 = new Child("蜘蛛精")
		val child2 = new Child("黄鼠狼精")
		Child.JoinGame(child0)
		Child.JoinGame(child1)
		Child.JoinGame(child2)
		Child.showNum()
	}
}

class Child(cName:String){
	var name: String = cName
}

object Child{
	var totalChildNum = 0

	def JoinGame(child: Child): Unit ={
		printf("%s加入了游戏。\n",child.name)
		totalChildNum += 1
	}
	def showNum(): Unit ={
		printf("当前有%d个小孩玩游戏。\n",totalChildNum)
	}
}

