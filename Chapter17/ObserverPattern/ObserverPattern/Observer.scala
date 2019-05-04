/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 15:10
	* Project:ScalaLearning
	* FileName:Observer.scala
	* Version 1.0
	*/
package Chapter17.ObserverPattern.ObserverPattern

trait Observer {
	// 抽象方法，等待其他的观察者实现
	def update(mTemperature: Float, mPressure: Float, mHumidity: Float)
}
