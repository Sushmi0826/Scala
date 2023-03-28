object Functions {
  def main(args: Array[String]): Unit = {
    //var result = sum(10,20)
    println("sum: "+ sum(10, 20))
    println("factorial: "+fact(5))
  }

  def sum(a: Int, b: Int): Int = {
    var sum = a + b
    return sum
  }
  //def factorial(c: Int): Int = {
  //  var s = 1
  //  for (i <- 1 to c) {
  // s = s * i
  //  }
  //  return s
  //}
  def fact(c:Int): Int = {
    return if(c<=1) 1 else c*fact(c-1)  //Terinary operations
  }
}
