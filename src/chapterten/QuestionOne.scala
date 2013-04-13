package chapterten


object QuestionOne {
  def main(args: Array[String]) {
    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    println(egg)

    egg.translate(10, -10)
    println(egg)

    egg.grow(10, 20)
    println(egg)
  }
}
