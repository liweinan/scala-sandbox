import scala.language.implicitConversions

object PlayPlay extends App {

  class LoquaciousInt(x: Int) {
    def chat: Unit = for (i <- 1 to x) println("Hi!")
  }

  implicit def intToLoquaciousInt(x: Int) = new LoquaciousInt(x)

  3.chat
}