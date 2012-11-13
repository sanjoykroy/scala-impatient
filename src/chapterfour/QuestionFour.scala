package chapterfour

import collection.immutable.SortedMap

/**
 * Question - 4
 * Word count using Sorted Map
 */
object QuestionFour {
  def main(args: Array[String]) {
    var words = SortedMap[String, Int]()
    val in = new java.util.Scanner(new java.io.File("D:\\development\\scalaProjects\\scala-impatient\\src\\chapterfour\\myFile.txt"))
    while (in.hasNext) {
      val word = in.next.toLowerCase
      val count = words.getOrElse(word , 0)+1
      words = words + (word -> count)
    }
    println(words.toString())
  }
}
