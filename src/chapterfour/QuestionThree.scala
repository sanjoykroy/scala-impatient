package chapterfour

/**
 * Question - 3
 * Word count using immutable map
 */
object QuestionThree {
  def main(args: Array[String]) {
    var words = Map[String, Int]()
    val in = new java.util.Scanner(new java.io.File("D:\\development\\scalaProjects\\scala-impatient\\src\\chapterfour\\myFile.txt"))
    while (in.hasNext) {
      val word = in.next.toLowerCase
      val count = words.getOrElse(word , 0)+1
      words = words + (word -> count)
    }
    println(words.toString())
  }
}
