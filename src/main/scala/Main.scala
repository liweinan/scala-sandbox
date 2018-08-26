object Main extends App {
  println("Hello, World!")

  var sum = 0

  val v = Var("x")

  val op = BinOp("+", Number(1), v)

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e // Double negation
    case BinOp("+", e, Number(0)) => e // Adding zero
    case BinOp("*", e, Number(1)) => e // Multiplying by one
    case BinOp("+", x, y) => x
    case _ => expr
  }

  println(simplifyTop(op))

  op match {
    case BinOp(_, _, _) => println(op)
  }

  def describe(x: Any) = x match {
    case 5 => "FIVE"
    case true => "TRUE"
    case "hi" => "Hello, world!"
    case Nil => "EMPTY"
    case _ => {
      println("UNKNOWN")
    }
  }

  println(describe(Nil))

//  def foo: Unit = {
//    expr match {
//      case List(0, _*) => println("FOUND")
//      case _ => // nothing
//    }
//  }


}
