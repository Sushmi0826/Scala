object higher_squares {
  def squares(a: Int): Int = {
    a * a
  }
  def cubes(a: Int): Int ={
    a * a * a
  }
  def main(args: Array[String]): Unit = {
    var x = squares(2)
    println(x)
    var y = cubes(3)
    println(y)
  }
}
