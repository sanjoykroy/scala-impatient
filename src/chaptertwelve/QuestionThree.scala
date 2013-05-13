package chaptertwelve


object QuestionThree {
  def main(args: Array[String]) {
    println(fac(4))
  }
  def fac(x: Int) = if(x == 0) 1 else (1 to x).reduceLeft(_ * _)
}
