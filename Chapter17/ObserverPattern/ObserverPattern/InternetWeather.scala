/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 15:26
	* Project:ScalaLearning
	* FileName:InternetWeather.scala
	* Version 1.0
	*/


package Chapter17.ObserverPattern.ObserverPattern

object InternetWeather {
	def main(args: Array[String]): Unit = {
		// 创建一个气象局的天气公告板
		val mCurrentConditions = new CurrentConditions()
		val sinaCurrentConditions = new SinaCurrentConditions()

		val mWeatherDataSet = new WeatherDataSet()
		// mCurrentConditions注册
		mWeatherDataSet.registerObserver(mCurrentConditions)
		mWeatherDataSet.registerObserver(sinaCurrentConditions)
		mWeatherDataSet.setData(30,150,40)

	}
}
