package calculator

import calculator.calc

class choice {
  def choice(x: Int): Unit = {
    val calc = new calc()
    val allowed_options: List[Int] = List(1, 2, 3, 4)
    x match {
      case 1 =>
        val oper: String = "Sum"
        println("Insert the first number: ")
        val n1: Int = scala.io.StdIn.readInt()
        println("Insert the second number: ")
        val n2: Int = scala.io.StdIn.readInt()
        val result: Int = calc.sum(n1, n2)
        println(s"The $oper result is $result")
        println("Returning to menu...")

      case 2 =>
        val oper: String = "Subtraction"
        println("Insert the first number: ")
        val n1: Int = scala.io.StdIn.readInt()
        println("Insert the second number: ")
        val n2: Int = scala.io.StdIn.readInt()

        if (n1 > n2) {
          val result: Int = calc.sub(n1, n2)
          println(s"The $oper result is $result")
          println("Returning to menu...")

        } else {
          println(s"You're trying to subtract $n1 that are smaller than $n2")
          println("Returning to menu...")
        }

      case 3 =>
        val oper: String = "Multiplication"
        println("Insert the first number: ")
        val n1: Int = scala.io.StdIn.readInt()
        println("Insert the second number: ")
        val n2: Int = scala.io.StdIn.readInt()
        val result: Double = calc.mult(n1, n2)
        println(s"The $oper result is $result")
        println("Returning to menu...")

      case 4 =>
        val oper: String = "Division"
        println("Insert the first number: ")
        val n1: Int = scala.io.StdIn.readInt()
        println("Insert the second number: ")
        val n2: Int = scala.io.StdIn.readInt()

        if (n2 != 0) {
          val result: Double = calc.div(n1, n2)
          println(s"The $oper result is $result")
          println("Returning to menu...")
        } else {
          println(s"You're trying to divide $n1 to $n2")
          println("You cannot divide per zero.")
          println("Returning to menu...")
        }

      case _ =>
        if (!allowed_options.contains(x)) {
          println("You've inserted a not allowed value.")
          println("Returning to menu...")
        } else {
          println("You've broken my program.")
          println("Returning to menu...")
        }
    }
  }
}

//    if (x == 1) {
//      val oper: String = "Sum"
//      println("Insert the first number: ")
//      val n1: Int = scala.io.StdIn.readInt()
//      println("Insert the second number: ")
//      val n2: Int = scala.io.StdIn.readInt()
//      val result: Int = calc.sum(n1, n2)
//      println(s"The $oper result is $result")
//      println("Returning to menu...")
//
////    } else if (x == 2) {
//      val oper: String = "Subtraction"
//      println("Insert the first number: ")
//      val n1: Int = scala.io.StdIn.readInt()
//      println("Insert the second number: ")
//      val n2: Int = scala.io.StdIn.readInt()
//
//      if (n1 > n2) {
//        val result: Int = calc.sub(n1, n2)
//        println(s"The $oper result is $result")
//        println("Returning to menu...")
//
//      } else {
//        println(s"You're trying to subtract $n1 that are smaller than $n2")
//        println("Returning to menu...")
//      }
//
//    } else if (x == 3) {
//      val oper: String = "Multiplication"
//      println("Insert the first number: ")
//      val n1: Int = scala.io.StdIn.readInt()
//      println("Insert the second number: ")
//      val n2: Int = scala.io.StdIn.readInt()
//      val result: Double = calc.mult(n1, n2)
//      println(s"The $oper result is $result")
//      println("Returning to menu...")
//
//    } else if (x == 4) {
//      val oper: String = "Division"
//      println("Insert the first number: ")
//      val n1: Int = scala.io.StdIn.readInt()
//      println("Insert the second number: ")
//      val n2: Int = scala.io.StdIn.readInt()
//
//      if (n2 != 0) {
//        val result: Double = calc.div(n1, n2)
//        println(s"The $oper result is $result")
//        println("Returning to menu...")
//      } else {
//        println(s"You're trying to divide $n1 to $n2")
//        println("You cannot divide per zero.")
//        println("Returning to menu...")
//      }
//
//    } else {
//      if (!allowed_options.contains(x)) {
//        println("You've inserted a not allowed value.")
//        println("Returning to menu...")
//        } else {
//        println("You've broken my program.")
//        println("Returning to menu...")
//      }