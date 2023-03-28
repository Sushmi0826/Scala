object MatrixArr {
  def main(args: Array[String]): Unit = {
    var Arr = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 6), Array(7, 8, 9, 10), Array(11, 12, 13, 14))
    for (i <- 0 to 3)
    {
      for (j <- 0 to 3)
      {
        //print(i, j)
        print(" "+Arr(i)(j))  //Accessing the elements
      }
      println()
    }
  }
}
