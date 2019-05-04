/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 20:38
	* Project:ScalaLearning
	* FileName:PersonBeanImpl.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.DYN

// 要被调用的对象
class PersonBeanImpl extends PersonBean {

	var name: String = _
	var gender: String = _
	var interests: String = _
	var score: Int = _

	override def getName(): String = {
		return name
	}

	override def getGender(): String = {
		gender
	}

	override def getInterests(): String = {
		interests
	}

	override def getScore(): Int = {
		score
	}

	// 自己可以调用，其他用户不能调用
	override def setName(name: String): Unit = {
		this.name = name
	}

	// 自己可以调用，其他用户不能调用
	override def setGender(gender: String): Unit ={
		this.gender = gender
	}

	// 自己可以调用，其他用户不能调用
	override def setInterests(interests: String): Unit = {
		this.interests = interests
	}

	// 自己不能调用，其他用户可以调用
	override def setScore(score: Int): Unit = {
		this.score = score
	}
}
