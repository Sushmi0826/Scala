object TestArrays {
  def main(args: Array[String]): Unit = {
    val myArr = Array.ofDim[Int](n1 = 2, n2 = 2)
    var n: Int = 1
    val myArr2 = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 6))
    //myArr(0)(0) = 10
    //myArr(0)(1) = 20
    //println(myArr(0)(0))
    //for (i <- 0 to n ; j<- 0 until n)
    //{
      //print(i, j)
      //println("=" + myArr(i)(j))
    myArr2.foreach(printArr)
    }
  def printArr(arr:Array[Int]) : Unit = {
    arr.foreach(printvalue)
    println("\n")
  }
  def printvalue(i:Int): Unit = {
    print(s"$i,")
  }
}
