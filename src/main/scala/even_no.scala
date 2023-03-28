import scala.io.StdIn.readInt


object even_no {
  def main(args: Array[String]): Unit = {
    println("Please enter the first no.: ");
    var num1: Int = readInt()
    println("Please enter the second no.: ");
    var num2: Int = readInt()
    for (i <- num1 to num2 if i % 6 != 0 && i % 2 == 0) {
      println(s"The even no. are: $i")
    }
  }
}
