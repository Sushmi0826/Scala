object ArrayExamples {
  def main(args: Array[String]): Unit = {
    var myar: Array[String] = new Array[String](3) //to create

    myar(0) = "HELLO" // to add
    myar(1) = "Hai"
    myar(2) = "Hai"

    println(myar(1))
    for (i <- myar) {
      println(1)
    }
    var myarr2 = Array(1, 2, 3, 3)
    for (j <- myarr2) {
      println(j)
    }
  }
}