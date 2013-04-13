package chapterten

import java.awt.Point


class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[Point] {
  def compare(that: Point): Int = {
    if (this.x <= that.x) {
      if (this.x == that.x) {
        if (this.y < that.y) -1
        else if (this.y > that.y) 1
        else 0
      } else -1
    } else 1
  }
  override def toString = "[%f, %f]".format(getX, getY)
}
