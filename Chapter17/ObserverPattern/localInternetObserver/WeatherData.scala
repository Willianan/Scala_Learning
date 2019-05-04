/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 14:25
	* Project:ScalaLearning
	* FileName:WeatherData.scala
	* Version 1.0
	*/
package Chapter17.ObserverPattern.localInternetObserver

// 可以理解为气象局维护的一个提供天气情况数据的核心类
class WeatherData {
	private var mTemperature: Float = _ // 温度
	private var mPressure: Float = _ // 气压
	private var mHumidity: Float = _ // 湿度
	// 气象局的天气公告板
	private var mCurrentConditions: CurrentConditions = _

	def this(mCurrentConditions: CurrentConditions) {
		this
		this.mCurrentConditions = mCurrentConditions
	}

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
		mCurrentConditions.update(getTemperature(), getPressure(), getHumidity())
	}

	// 设置最新的天气情况的方法
	def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
		this.mTemperature = mTemperature
		this.mPressure = mPressure
		this.mHumidity = mHumidity
		// 修改公告板的最新数据
		dataChange()
	}
}
