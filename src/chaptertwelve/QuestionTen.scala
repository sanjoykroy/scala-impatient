package chaptertwelve


object QuestionTen {

  def main(args: Array[String]) {
    var x = 10
    until (x == 0) {
      x -= 1
      println(x)
    }
    val y = 10
    unless (y == 0) {
      println("Hello")
    }
  }

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
    }
  }
}

