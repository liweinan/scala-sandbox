import scala.actors.Actor._

object PlayWithActor extends App {
  val echoActor = actor {
    while (true) {
      receive {
        case msg =>
          println("-> " + msg)
      }
    }
  }

  echoActor ! "Hello, Martian!"
}