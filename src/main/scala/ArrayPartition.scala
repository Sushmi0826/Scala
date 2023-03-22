object ArrayPartition {

  def main(args: Array[String]): Unit = {
    val myArr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var (even, odd) = myArr.partition((p) => {
      if (p % 2 == 0) {
        true;
      } else {
        false
      }
    })
    val (even1, odd1) = myArr.partition(_ % 2 == 0)
    even1.foreach(println(_))
    odd1.foreach(println(_))
  }
}
