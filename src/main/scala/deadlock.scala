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
        self.synchronized {} // 死锁，主线程和t都在等待对方退出。
      }
    }
    t.start()
    t.join() // 主线程等待t结束，但是t在等待主线程结束。
    1
  }
}