package chaptertwelve


object QuestionOne {
  def main(args: Array[String]) {
    println(values(x => x * x, -5, 5))
  }

  def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(x => (x, fun(x))).toList
}
