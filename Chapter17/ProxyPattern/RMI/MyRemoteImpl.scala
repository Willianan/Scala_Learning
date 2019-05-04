/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 19:50
	* Project:ScalaLearning
	* FileName:MyRemoteImpl.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.RMI

import java.rmi.registry.LocateRegistry
import java.rmi.{Naming, RemoteException}
import java.rmi.server.UnicastRemoteObject

// 实现myRemote
class MyRemoteImpl extends UnicastRemoteObject with myRemote {
	@throws(classOf[RemoteException])
	override def sayHello(): String = {
		"Hello World!......."
	}
}

// 完成对服务(sayHello)的注册 对服务管理
object MyRemoteImpl {
	def main(args: Array[String]): Unit = {
		val service: myRemote = new MyRemoteImpl()
		// 第一种注册方式
		//LocateRegistry.createRegistry(9999)
		//Naming.rebind("RemoteHello", service)
		// 第二种注册方式
		Naming.rebind("rmi://127.0.0.1:9999/RemoteHello",service)
		println("远程服务开启，在127.0.0.1的9999端口监听，服务名为RemoteHello")
	}
}
