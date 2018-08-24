import ChecksumACC.calc

object FallWinterSpringSummer {
  def main(args: Array[String]): Unit = {
    for (season <- List("fall", "winter", "spring", "summer"))
      println(season + ": " + calc(season))
  }
}
