import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt
object WhileDemo {
  def main(args: Array[String]) = {
    while (true) {
      println("Please enter the first no.: ");
      var num1: Int = readInt()
      println("Please enter the second no.: ");
      var num2: Int = readInt()
      println("1- add, 2- sub, 3- mul, 4- div, please enter the value:  ");
      var ip: Int = readInt()
      ip match {
        case 1 => println(num1 + num2);
        case 2 => println(num1 - num2);
        case 3 => println(num1 * num2);
        case 4 => println(num1 / num2);
        case _ => println("invalid value");
      }
    }
  }
}

