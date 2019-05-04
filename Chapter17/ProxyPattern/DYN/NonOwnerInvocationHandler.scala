/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 21:02
	* Project:ScalaLearning
	* FileName:NonOwnerInvocationHandler.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.DYN

import java.lang.reflect.{InvocationHandler, Method}

class NonOwnerInvocationHandler extends InvocationHandler{
	var person:PersonBean = _

	def this(person:PersonBean){
		this
		this.person = person
	}
	@throws(classOf[Throwable])
	override def invoke(proxy: Any, method: Method, args: Array[AnyRef]): AnyRef = {
		// 如果时get方法就直接调用
		if (method.getName().startsWith("get")) {
			return method.invoke(person)
		}
			// 其他用户可以调用setHotOrNotRating,进行评分
		else if (method.getName().equals("setScore")) {
			return method.invoke(person,Integer.valueOf(args(0).toString))
		}
			// 其他用户不能调用set方法
		else if (method.getName().startsWith("set")) {
			return new IllegalAccessException()
		}
		null
	}
}
