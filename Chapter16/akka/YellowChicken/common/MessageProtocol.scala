/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/11 21:52
	* Project:Akka
	* FileName:MessageProtocol.scala
	* Version 1.0
	*/
package akka.YellowChicken.common


// 使用样例类来构建协议
// 客户端发给服务器协议（序列化的对象）
case class ClientMessage(mes:String)

// 服务器发给客户端的协议（样例类对象）
case class ServerMessage(mes:String)