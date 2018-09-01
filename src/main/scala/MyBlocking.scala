object MyBlocking extends App {
  def my_blocking(block: Unit)(block2: Unit): Unit = {
    block
    block2
  }
}

import MyBlocking.my_blocking

my_blocking {
  println("Hello, world!")
} {
  println("Coffee")
}