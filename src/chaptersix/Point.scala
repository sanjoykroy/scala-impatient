package chaptersix

class Point(val x: Int, val y: Int) {
  override def toString(): String = "X : "+ x + " Y: "+y
}

object Point {
  def apply(a: Int, b: Int) = new Point(a, b)
}

