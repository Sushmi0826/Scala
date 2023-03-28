object Anonymous {
  def main(args: Array[String]): Unit = {
    var str1 = "Hello"
    var str2 = " Welcome"
    var str3 = s"$str1".concat(s"$str2")  //string interpolation
    println(str3)
  }
}

