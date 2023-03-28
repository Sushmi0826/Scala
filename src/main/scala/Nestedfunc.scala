object Nestedfunc {
  def myCalculater(a: Int, b: Int, func: (Int, Int) => Int): Int = {
    var x = func(a, b)
    return a + b * x
  }
  def main(args: Array[String]): Unit = {
    var c = myCalculater(10, 20, add)
    println (c)
  }
  def add(a: Int, b: Int): Int = {
    return (a + a) * (b + b)
  }
}
