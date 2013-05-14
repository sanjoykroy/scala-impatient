package chaptertwelve


object QuestionFour {
  def main(args: Array[String]) {
    println(fac(-1))
    println(fac(4))
  }
  def fac(x: Int) = (1 to x).foldLeft(1)(_ * _)
}
