/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/16 21:08
	* Project:ScalaLearning
	* FileName:MatchService.scala
	* Version 1.0
	*/
package Chapter17.ProxyPattern.DYN

import java.lang.reflect.Proxy

class MatchService {
	// 创建一个Person
	val Tom = getPersonInfo("Tom","男","爱好编程")
	// 得到一个给直接调用的代理，它替代被调用的对象
	val OwnerProxy = getOwnerProxy(Tom)

	println("Name is " + OwnerProxy.getName())
	println("Interests is " + OwnerProxy.getInterests())

	OwnerProxy.setInterests("爱好淘宝")
	println("Interests is " + OwnerProxy.getInterests())
	OwnerProxy.setScore(100)
	println("Score is " + OwnerProxy.getScore())


	println("******************测试NonOwnerInvocationHandler******************")
	val mary = getPersonInfo("Mary","女","爱好购物")
	val nonOwnerProxy = getNonOwnerProxy(mary)
	println("Name is " + nonOwnerProxy.getName())
	println("Interests is " + nonOwnerProxy.getInterests())
	// 其他人不能修改兴趣，通过代理进行控制不能调用setInterests
	nonOwnerProxy.setInterests("爱好小猫咪....")   // 动态代理控制
	println("Interests is " + nonOwnerProxy.getInterests())
	nonOwnerProxy.setScore(90)
	println("score is " + nonOwnerProxy.getScore())


	def getPersonInfo(name: String, gender: String, interests: String): PersonBean = {
		val person = new PersonBeanImpl()
		person.setName(name)
		person.setGender(gender)
		person.setInterests(interests)
		person
	}

	def getOwnerProxy(person: PersonBean): PersonBean = {
		Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),new OwnerInvocationHandler(person)).asInstanceOf[PersonBean]
	}

	def getNonOwnerProxy(person: PersonBean): PersonBean = {
		Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person)).asInstanceOf[PersonBean]
	}
}
