/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 20:46
	* Project:ScalaLearning
	* FileName:OwnerInvocationHandler.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.DYN

import java.lang.reflect.{InvocationHandler, Method}

class OwnerInvocationHandler extends InvocationHandler {
	// 被调用的对象PersonBeanImpl
	var person: PersonBean = _

	// 构造器
	def this(person: PersonBean) {
		this
		this.person = person
	}

	// 说明
	// 这里的Proxy就是和OwnerInvocationHandler合作的代理
	@throws(classOf[Throwable])
	override def invoke(proxy: scala.Any, method: Method, args: Array[AnyRef]): AnyRef = {

		// 如果时get方法就直接调用
		if (method.getName().startsWith("get")) {
			return method.invoke(person)
		}
			// 自己不能调用setHotOrNotRating,给自己评分
		else if (method.getName().equals("setScore")) {
			return new IllegalAccessException()
		}
		else if (method.getName().startsWith("set")) {
			return method.invoke(person,args(0).toString)
		}
		null
	}
}
