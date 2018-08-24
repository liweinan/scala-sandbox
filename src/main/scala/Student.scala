class Student(sid: Int, sname: String) {
  val id = sid
  val name = sname

  override def toString() = this.id + "," + this.name
}

object Student {
  def displayDetails(st: Student) = {
    println("details: " + st.id + "," + st.name)
  }
}
