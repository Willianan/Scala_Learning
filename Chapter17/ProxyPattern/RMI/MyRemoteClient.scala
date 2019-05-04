/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 20:11
	* Project:ScalaLearning
	* FileName:MyRemoteClient.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.RMI

import java.rmi.Naming

class MyRemoteClient {
	def go() = {
		val service = Naming.lookup("rmi://127.0.0.1:9999/RemoteHello").asInstanceOf[MyRemoteImpl]
		val str = service.sayHello()
		println("Str = " + str)
	}
}

object MyRemoteClient{
	def main(args: Array[String]): Unit = {
		new MyRemoteClient().go()
	}
}
