object ImplicitDemo extends App {

  class MyFoo {

  }

  def calc(): Unit = {
    def bar(): Unit = {

    }
  }

  println("Hello")

  implicit val myFoo = new MyFoo();

  def my_world(int

  i) (
  implicit MyFoo x
  ): Unit = {
    println(x)
  }

  my_world(42)
  my_world(42, new MyFoo)

  import scala.language.implicitConversions
  implicit def intToString(i: Int): String = {
    println("HAHAHAHAHAH")
    i.toString
  }

  def alert(msg: String): Unit = {
    println(msg)
  }

  def accept(block: () => Unit): Unit = {
    block
  }

  accept({
    println("Hello, world!")
  } {

  }

}