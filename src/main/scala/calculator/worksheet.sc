import scala.util.{Failure, Success, Try}
//def isPair(x: Int): Boolean = x % 2 == 0
//
//def isOdd(x: Int): Boolean = !isPair(x)
//
//isPair(10)
//isOdd(11)
//
//val list = List(1, 2, 3, 4, 5, 6)
//
//val ListPair = list.filter(x => isPair(x))
//
//val ListOdd = list.filterNot(x => isPair(x))
//
//val twoMultiplier = list.map(x => x * 2)

//val calc: Calculator = new Calculator
//
//calc.sum(10, 20)
//calc.sub(20, 10)
//calc.+:(10, 40)
//calc.mult(10, 10)
//calc.div(50, 5)

//def +: (Int, Int) => Int = soma _
//
//def -: (Int, Int) => Int = sub _
//
//def *: (Int, Int) => Int = mult _
//
//def /: (Int, Int) => Int = div _

//def /(a: Int, b: Int): Int = divisao(a, b)

//def divisao(x: Int, y: Int): Int = Try(x / y).getOrElse(0)
//import java.util.Calendar
//
//// Call by value
//def printTimeMili(t: Long): Unit = {
//  println(t)
//  Tread.sleep( millis = 200 )
//  println(t)
//  Tread.sleep( millis = 200 )
//  println(t)
//}
//printTimeMili(Calendar.getInstance().getTimeinMillis)
//
//def printTimeMiliCBN(t: => Long) = {
//  println(t)
//  Tread.sleep(millis=200)
//  println(t)
//  Tread.sleep(millis=200)
//  println(t)
//}
//printTimeMiliCBN(Calendar.getInstance().getTimeinMillis)

//object OptionUse extends App {
//  //Option -> Some(valor), None
//  val divisionPerZero= Try(10/0).getOrElse(0)
//  println(divisionPerZero)
//}

//object OptionUse extends App {
//  val zeroDivide = Try(10/0)
//  val result = zeroDivide match {
//    case Success(value) => value
//    case Failure(_) => 0
//  }
//  println(result)
//}
//
//object OptionUse extends App {
//  val zeroDivide = Try(10/0).toOption
//  val result = zeroDivide match {
//    case Some(value) => value
//    case _ => 0
//  }
//  println(result)
//}