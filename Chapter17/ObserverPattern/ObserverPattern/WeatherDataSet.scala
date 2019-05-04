/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 15:16
	* Project:ScalaLearning
	* FileName:WeatherDataSet.scala
	* Version 1.0
	*/
package Chapter17.ObserverPattern.ObserverPattern

import scala.collection.mutable.ListBuffer

class WeatherDataSet extends Subject {

	private var mTemperature: Float = _ // 温度D
	private var mPressure: Float = _ // 气压
	private var mHumidity: Float = _ // 湿度

	// 集合，用于管理所有的观察者
	private var mObservers: ListBuffer[Observer] = ListBuffer()

	def getTemperature() = {
		mTemperature
	}
	def getPressure() = {
		mPressure
	}
	def getHumidity() = {
		mHumidity
	}

	// 将最新数据的update
	def dataChange() = {
		notifyObserver()
	}

	// 设置最新的天气情况的方法
	def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
		this.mTemperature = mTemperature
		this.mPressure = mPressure
		this.mHumidity = mHumidity
		// 修改公告板的最新数据
		dataChange()
	}
	// 注册
	override def registerObserver(o: Observer): Unit = {
		mObservers.append(o)
	}
	// 移除
	override def removeObserver(o: Observer): Unit = {
		if (mObservers.contains(o)){
			mObservers -= o
		}
	}
	// 通知
	override def notifyObserver(): Unit = {
		for (observer <- mObservers) {
			observer.update(mTemperature,mPressure,mHumidity)
		}
	}
}
