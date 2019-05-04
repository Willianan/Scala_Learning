/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 15:08
	* Project:ScalaLearning
	* FileName:Subject.scala
	* Version 1.0
	*/
package Chapter17.ObserverPattern.ObserverPattern

trait Subject {
	def registerObserver(o:Observer)
	def removeObserver(o:Observer)
	def notifyObserver()
}
