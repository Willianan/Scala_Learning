/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 15:36
	* Project:ScalaLearning
	* FileName:SinaCurrentConditions.scala
	* Version 1.0
	*/
package Chapter17.ObserverPattern.ObserverPattern

class SinaCurrentConditions extends Observer {
	private var mTemperature: Float = _ // 温度
	private var mPressure: Float = _ // 气压
	private var mHumidity: Float = _ // 湿度

	def display() = {
		println("*****************Sina公告板*******************")
		println("*** Today mTemperature：" + mTemperature + " ***")
		println("*** Today mPressure：" + mPressure + " ***")
		println("*** Today mHumidity：" + mHumidity + " ***")
	}

	override def update(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
		this.mTemperature = mTemperature
		this.mPressure = mPressure
		this.mHumidity = mHumidity
		display()
	}
}
