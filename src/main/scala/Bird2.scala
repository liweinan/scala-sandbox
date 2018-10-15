//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

trait Swimming {
  def birdName: String

  def swim() = println(birdName + " is swimming")
}

trait Flying {
  def birdName: String

  def fly() = println(birdName + " is flying")
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

abstract class Bird

class Pigeon extends Bird with Swimming with Flying {
  val birdName = "pigeon"
}

class Hawk extends Bird with Swimming with Flying {
  val birdName = "hawk"
}

class Frigatebird extends Bird with Flying {
  val birdName = "frigate bird"
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

val birds = List(
  new Pigeon,
  new Hawk,
  new Frigatebird)

birds.foreach(bird =>
  bird match {
    case o: Swimming => o.swim()
    case o: Flying => o.fly()
  }
)

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

// :paste
// ...
// Exiting paste mode, now interpreting.
//
//
//scala>

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

