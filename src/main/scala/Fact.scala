import java.math.BigInteger

import ChecksumACC.calc

object Fact {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calc(arg))

  }

  def fact(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(fact(x.subtract(BigInteger.ONE)))
}
