object BirdBox {

  abstract class Bird {
    def flyMessage: String

    def fly() = println(flyMessage)

    def swim() = println("I'm swimming")
  }

  class Pigeon extends Bird {
    val flyMessage = "I'm a good flyer"
  }

  class Hawk extends Bird {
    val flyMessage = "I'm an excellent flyer"
  }

  val birds = List(
    new Pigeon,
    new Hawk
  )

  birds.foreach(bird => bird.fly())

}