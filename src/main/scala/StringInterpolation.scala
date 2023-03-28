object StringInterpolation {
  def main (args: Array[String]): Unit = {
    var x = 10
    println(s"the value of x is $x")
    var l = 2.2
    var k = s"this is the value $x"
    println(k)
    println(f"this is string $l%.5f $k%S")
    println(raw"the value \n of x is $x")
    println(s"the valu$$e of x is $x")
  }

}
