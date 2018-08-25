class Rational(d: Int) {
  println(String.format("Hello, Martian! %d", d))
}

object Rational {
  def main(args: Array[String]): Unit = {
    new Rational(42)
  }
}


