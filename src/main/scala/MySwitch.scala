def switch[T](i: T)(actions: (T, () => Unit)*)(default: => Unit) = {
  val acts = actions.dropWhile(_._1 != i).map {
    _._2
  }
  if (acts.isEmpty) default
  else acts.foreach {
    _ ()
  }
}

def myMethod(i: Int): Unit =
  switch(i)(
    0 -> { () => println("do 0") },
    1 -> { () => println("do 1") },
    2 -> { () =>
      println("do 2")
      return // instead of break
    },
    3 -> { () => println("do 3") }
  )(default = println("do default"))


myMethod(1)
// do 1
// do 2

myMethod(3)
// do 3

myMethod(5)
// do default

/*

do 1
do 2
do 3
do default
switch: [T](i: T)(actions: (T, () => Unit)*)(default: => Unit)Unit
myMethod: (i: Int)Unit

scala>

 */