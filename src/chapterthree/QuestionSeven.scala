package chapterthree

/**
 * Question - 7
 * Write a code snippet that produces all values from an array with duplicates removed.
 */
object QuestionSeven {
  def main(args: Array[String]) {
    val arr = Array(0, 2, 3, 4, 3, 6, 0)
    println(arr.distinct.mkString(","))
  }

}
