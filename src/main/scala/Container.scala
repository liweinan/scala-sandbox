object Container {

  //Hidden elements variable
  private val elements = Array("Books", "Pens", "Laptops")

  def apply(index: Int) = if (index < elements.length) elements(index) else "No element found"

}

/*
scala> :paste
// Entering paste mode (ctrl-D to finish)

object Container {

  //Hidden elements variable
  private val elements = Array("Books", "Pens", "Laptops")

  def apply(index: Int) = if (index < elements.length) elements(index) else "No element found"

}


// Exiting paste mode, now interpreting.

defined object Container

scala> Container { 2 }
res4: String = Laptops

scala>
 */