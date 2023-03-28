object high4 {
  def mathOperation(name:String): (Int,Int) => Int =
    (x:Int, y:Int) => {
      name match {
        case "addition" => x + y
        case "multiplication" => x * y
        case "division" => x / y
        case "subtraction" => x - y
      }
    }
  def add: (Int, Int) => Int = mathOperation(name = "addition")
  def mul: (Int, Int) => Int = mathOperation(name = "multiplication")
  def div: (Int, Int) => Int = mathOperation(name = "division")
  def sub: (Int, Int) => Int = mathOperation(name = "subtraction")
  def main(args: Array[String]): Unit = {
    var v = add(10, 20)
    println(v)
    var v1 = mul(10,20)
    println(v1)
    var v2 = div(10,20)
    println(v2)
    var v3 = sub(10,20)
    println(v3)
  }
} 
