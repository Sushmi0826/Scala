object PartialFunction {
  def main(args: Array[String]): Unit = {
    val abill = getBill(vatPercentage = 20, serviceTax = 100, netBill = 400)
    println(abill)

    val actbill = calculateBill(400)
    println(s"===> $actbill")
  }
  def calculateBill: Double => Double = getBill(vatPercentage = 20, serviceTax = 100, _: Double);
  def getBill(vatPercentage: Int, serviceTax: Int, netBill: Double): Double = {
      netBill * (vatPercentage / 100.0) + serviceTax + netBill;
  }
}