/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 20:34
	* Project:ScalaLearning
	* FileName:PersonBean.scala
	* Version 1.0
	*/

package Chapter17.ProxyPattern.DYN

// Subject
trait PersonBean {
	def getName():String
	def getGender():String
	def getInterests():String
	def getScore():Int
	def setName(name:String)
	def setGender(gender:String)
	def setInterests(interests:String)
	def setScore(score:Int)
}

