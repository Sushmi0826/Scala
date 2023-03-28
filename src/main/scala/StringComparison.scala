object StringComparison {
  def main (args: Array[String]): Unit = {
    var a = "Hello"
    var b ="Hello"
    if (a == b ){
      println("a and b are equal")
    }
    else {
      println("a not equal to b")
    }
    if (a eq b ) {
      println("a and b are equal")
    }
    else {
      println("a and b are not equal")
    }
    var c = "World"
    var d = "world"
    if (c == d) {
      println("c and d are equal")
    }
    else {
      println("c not equal to d")
    }
    if (c.toUpperCase == d.toUpperCase) {
      println("c and d are equal")
    }
    else {
      println("c and d are not equal")
    }
    if (c.equalsIgnoreCase(d)) {
      println("c and d are equal")
    }
    else {
      println("c and d are not equal")
    }
  }
}