import calculator.choice
import scala.util.control.Breaks._

object TestCalculator{
  def main(args: Array[String]): Unit = {
    val calc = new choice()
    breakable {
    while (true) {
      println(
        """Select the mode that you want to use:
        [1] - Sum
        [2] - Subtraction
        [3] - Multiplication
        [4] - Division
        [5] - Exit
        """)
      val option: Int = scala.io.StdIn.readInt()
      if (option == 5) {
          println("Exiting...")
          break
      }
      calc.choice(option)
    }
    }
  }
}
