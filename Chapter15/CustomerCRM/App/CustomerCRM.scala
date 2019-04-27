/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/10 16:13
	* Project:ScalaLearning
	* FileName:CustomerCRM.scala
	* Version 1.0
	*/


package Chapter15.CustomerCRM.App

import Chapter15.CustomerCRM.View.CustomerView

object CustomerCRM {
	def main(args: Array[String]): Unit = {
		new CustomerView().mainMenu()
	}
}
