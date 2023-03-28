import scala.io.StdIn.readInt

object Factorials {
  def main (args: Array[String]): Unit = {
    var s = 1
    println("Please enter the no.: ");
    var n: Int = readInt()
    for (i <- 1 to n) {
      s = s * i
    }
    println(s)

  }

}
