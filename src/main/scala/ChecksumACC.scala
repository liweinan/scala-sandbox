import scala.collection.mutable.Map

class ChecksumACC {
  private var sum = 0

  def add(b: Byte) {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumACC {
  private val cache = Map[String, Int]()

  def calc(s: String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumACC
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}

