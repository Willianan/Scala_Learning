/**
	* Auther:Charles·Van
	* E-mail:williananjhon@hotmail.com
	* Date:2019/4/8 15:48
	* Project:ScalaLearning
	* FileName:salesDemo.scala
	* Version 1.0
	*/


package Chapter12.CaseClass

/*
现有一些商品，请使用Scala设计相关的样例类，完成商品捆绑打折出售。要求：
	1、商品捆绑可以是单个商品，也可以是多个商品
	2、打折时按照折扣x元进行设计
	3、能够统计出所有捆绑商品打折后的最终价格
*/
object salesDemo {
	def main(args: Array[String]): Unit = {
		val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
		val res = sale match {
			// 进行对象匹配时，不行接收某个值，则使用下划线忽略即可，_*表示忽略所有
			case Bundle(_, _, Book(_, price), _*) => price
			// 通过@表示法将嵌套的值绑定到变量。_*办第剩余Item到rest
			case Bundle(_,_,art@ Book(_,_),rest @ _*) => (art,rest)
		}
		println("price = " + price(sale))
		def price(item: Item): Double ={
			item match {
				case Book(_,price) => price
				case Bundle(_,discount,items @ _*) => items.map(price).sum - discount
			}
		}
	}
}

// 设计样例类
// 密封类
/*
* 1、如果想让case类所有子类都必须在声明该类的相同的源文件中定义，可以将样例类的通用超类声明为sealed
*    这个超类称之为密封类
* 2、密封就是不能在其他文件中定义子类
* */
abstract sealed class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item
