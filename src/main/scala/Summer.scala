import ChecksumACC.calc

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calc(arg))
  }
}
