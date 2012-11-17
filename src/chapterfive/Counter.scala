package chapterfive

class Counter {
  private var value = 0
  def increment() { value += 1 ; if ( value < 0 ) value = 0 }
  def current() = value
}
