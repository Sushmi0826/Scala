object Arrays {
  def main(args: Array[String]): Unit = {
    var v = Array(1, 2, 4, 5, 6, 7, 8, 9, 10)
    v.foreach(n => {
      if (n == 5) {
        println("FIve")
      } else {
        println(n)
      }
    })
    //v.foreach(n => println(n))
    //v.foreach(println(_))
  }
}

