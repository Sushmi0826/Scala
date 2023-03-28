object Anno2 {
  def main(args: Array[String]): Unit = {
    //statement
    var x1: Int = 10

    //expression
    var k = {
      val a = 10
      val a2 = 10
      val a3 = 10
      val a4 = 10
      a * a2 * a3 * a4
    }

    println("-----------------")
    println(k)
    println(x1)
    println("-----------------")

  }
}
