package chaptertwelve


object QuestionEight {
  def main(args: Array[String]) {
    val a = Array("Hello", "World")
    val b = Array(5, 5)
    println(a.corresponds(b)(_.length == _ ))
  }
}
