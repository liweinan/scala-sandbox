object ViewBoundsBox {

  import scala.language.implicitConversions

  object Serialization {

    case class Writable(value: Any) {
      def serialized: String = s"-- $value --"
    }

    implicit def fromInt(i: Int) = Writable(i)

    implicit def fromFloat(f: Float) = Writable(f)

    implicit def fromString(s: String) = Writable(s)
  }

  import Serialization._

  object RemoteConnection {
    def write[T <% Writable](t: T): Unit =
      println(t.serialized) // Use stdout as the "remote connection"
  }

  RemoteConnection.write(100) // Prints -- 100 --
  RemoteConnection.write(3.14f) // Prints -- 3.14 --
  RemoteConnection.write("hello!") // Prints -- hello! --
  // RemoteConnection.write((1, 2))                                       5

}