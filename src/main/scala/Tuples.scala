object Tuples {
  def main(args: Array[String]): Unit = {
    var myTuple = (1, 2.0, 31, 4.1, "test")
    var myTuple2 = new Tuple5(5, 2.0, 31, 4.1, "test")
    var myTuple3 = new Tuple6(1, 2.0, 31, 4.1, "test", (2, 2))
    var myTuple6 = Tuple6(1, 2.0, 31, 4.1, "test", (2, 3))

    println(myTuple._1)
    println(myTuple3._6._1)
    myTuple2.productIterator.foreach((x) => {
      println(x)
    });
    myTuple2.productIterator.foreach((x) => println(x));
    myTuple2.productIterator.foreach(println(_));
    var myTuple4 = ("a" -> "b")
    println(myTuple4)
    var (z, i) = myTuple4
    println(z)
    println(i)
  }
}
