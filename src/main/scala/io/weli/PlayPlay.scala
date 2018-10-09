import scala.language.implicitConversions

object PlayPlay extends App {

  // 给Int类型加个chat方法。
  class LoquaciousInt(x: Int) {
    def chat: Unit = for (i <- 1 to x) println("Hi!")
  }


  implicit def intToLoquaciousInt(x: Int) = new LoquaciousInt(x)

  3.chat
}