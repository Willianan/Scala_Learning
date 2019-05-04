/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 14:41
	* Project:ScalaLearning
	* FileName:InternetWeather.scala
	* Version 1.0
	*/


package Chapter17.ObserverPattern.localInternetObserver

object InternetWeather {
	def main(args: Array[String]): Unit = {
		// 创建一个气象局的天气公告板
		val mCurrentConditions = new CurrentConditions()
		// 创建mWeatherData，并将mCurrentConditions设置
		val mWeatherData = new WeatherData(mCurrentConditions)
		mWeatherData.setData(30,150,40)
	}
}
