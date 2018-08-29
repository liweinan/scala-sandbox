import akka.actor.ActorSystem

object LifecycleDemo extends App {
  val system = ActorSystem("LifecycleDemo")
  implicit val materializer = ActorMaterializer.create(system)

  println(Thread.currentThread().getName)

  Source.single("Hello")
    .map(_ + " Stream World!")
    .to(Sink.foreach(s ⇒ println(Thread.currentThread().getName + " " + s)))
    .run()

  println("running")
  system.terminate()

}
