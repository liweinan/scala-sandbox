import scala.actors.Actor._

object FooActor extends Actor {
  def act(): Unit = {
    for (1 to 5) {
      println("<>")
      Thread.sleep(1000)
    }
  }
}
