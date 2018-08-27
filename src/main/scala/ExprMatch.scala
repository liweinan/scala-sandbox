object ExprMatch extends App {

  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }

  println(generalSize("Hello, world!"))
  println(generalSize(Map("x" -> 1, "y" -> 2)))
  println(generalSize(Map("x" -> 1, "y" -> 2, "z" -> 3)))
  println(generalSize(Math.PI))

  // useless, because type is erased during runtime, unless it is arrays.
  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }

  println(isIntIntMap(Map(1 -> 'x', 2 -> 'y')))
  println(isIntIntMap(Map(1 -> 1, 2 -> 10)))

  def varBind(x: Any) = x match {
    case UnOp("abs", e @ UnOp("abs", _)) => e
    case _ =>
  }

  val expr = UnOp("abs", UnOp("abs", Var("x")))
  println(expr)
  println(varBind(expr))
}
