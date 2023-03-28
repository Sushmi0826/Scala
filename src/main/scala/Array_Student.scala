import scala.io.StdIn.{readInt, readLine}

object Array_Student {
  var students: Array[String] = new Array[String](10)
  var i = 0;

  def addstudent(): Unit = {
    println("Please enter the name")
    var sname = readLine()
    students(i) = sname
    i = i + 1
  }
  def Liststudent(): Unit = {
    println("Studnt Name")
    println("----")
    for (k <- 0 to i - 1) {
      println(students(k))
    }
  }
  def main(args: Array[String]): Unit = {
    while (true) {
      println("Please choose your operation")
      println("1. add students \t 2. list student")
      var ch: Int = readInt()
      ch match {
        case 1 => addstudent()
        case 2 => Liststudent()
        case _ => println(s" invalid option")
      }
    }
  }
}