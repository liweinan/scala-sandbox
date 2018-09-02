object MyBlocking extends App {
  def my_blocking(block: Unit)(block2: Unit): Unit = {
    block
    block2
  }

  def apply(body: Unit): Unit =
    body
}

import MyBlocking.my_blocking

my_blocking {
  println("Hello, world!")
} {
  println("Coffee")
}

// apply method is called
MyBlocking {
  println("Is is a constructor?")
}