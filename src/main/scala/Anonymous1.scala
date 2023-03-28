object Anonymous1 {
  def main(args: Array[String]) : Unit = {
    var sum=(a:Int,b:Int) => {
      a + b
    }
    var sub = (a: Int, b: Int) => {
      a - b
    }
    println(sum(2,3))
    println(sub(2,3))
  }
}
