package chaptertwelve


object QuestionTwo {
  def main(args: Array[String]) {
    val arr = Array(12, 3, 45, -1, 23, 9)
    println(arr.reduceLeft(
      (s1, s2) => if (s1 > s2) s1 else s2
    ))
  }
}
