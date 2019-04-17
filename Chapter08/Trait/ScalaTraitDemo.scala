/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/3/31 15:09
	* Project:ScalaLearning
	* FileName:ScalaTraitDemo.scala
	* Version 1.0
	*/


package Chapter8.Trait
// Scala接口
//  从面向对象来看，接口并不属于面向对象的范畴，Scala是纯面向对象的语言，在Scala中没有接口。
//  Scala语言中，采用特质trait(特征)来代替接口的概念，也就是说，多个类具有相同的特质(特征)时，
//  就可以将这个特质(特征)独立出来，采用关键字trait声明
object ScalaTraitDemo {
	def main(args: Array[String]): Unit = {

	}
}
//trait的声明
//  trait 特质名{
//    trait体
//  }
// trait命名：一般首字母大写
// 在Scala中，Java中的接口可以当作特质使用

/*
* Scala中trait的使用
* 一个类具有某种特质(特征)，就意味着这个类满足了这个特质（特征）的所有要素，所以在使用时，也采用了extends关键字，
* 如果有多个特质或存在父类，那么需要采用with关键字连接
*
* 1、没有父类
*    class 类名 extends 特质1 with 特质2 with 特质3......
* 2、有父类
*   class 类名 extends 父类 with 特质1 with 特质2 with 特质3......
* */
object T1 extends Serializable{

}

object T2 extends Cloneable{

}