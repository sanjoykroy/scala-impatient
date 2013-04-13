package chapterten

trait RectangleLike {

  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def setFrame(x: Double, y: Double, width: Double, height: Double)

  def translate(dx: Double, dy: Double) {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(dx: Double, dy: Double) {
    setFrame(getX - dx, getY - dy, getWidth + 3 * dx, getHeight + 3 * dy)
  }

  override def toString = "[%f, %f, %f, %f]".format(getX, getY, getWidth, getHeight)
}


