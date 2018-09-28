/*
scala> class A {
     |   self =>
     |   lazy val x: Int = {
     |     val t = new Thread() {
     |       override def run() {
     |         self.synchronized {} // 死锁
     |       }
     |     }
     |     t.start()
     |     t.join()
     |     1
     |   }
     | }
defined class A

scala> val objA = new A
objA: A = A@48e74764

scala> objA.x
 */

class A {
  self =>
  lazy val x: Int = {
    val t = new Thread() {
      override def run() {
        self.synchronized {} // 死锁
      }
    }
    t.start()
    t.join()
    1
  }
}