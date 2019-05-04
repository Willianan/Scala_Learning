/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 19:46
	* Project:ScalaLearning
	* FileName:myRemote.scala
	* Version 1.0
	*/


package Chapter17.ProxyPattern.RMI

import java.rmi.{Remote, RemoteException}

// 接口文件，该文件会给远程端和本地端使用
trait myRemote extends Remote {
	// 一个抽象的方法
	@throws(classOf[RemoteException])
	def sayHello(): String // throws RemoteException
}
