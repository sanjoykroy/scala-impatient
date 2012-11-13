package chapterfour

import scala.collection.JavaConversions.mapAsScalaMap

/**
 * Question - 5
 * Word count using Java TreeMap
 */
object QuestionFive {
  def main(args: Array[String]) {
    val words: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in = new java.util.Scanner(new java.io.File("D:\\development\\scalaProjects\\scala-impatient\\src\\chapterfour\\myFile.txt"))
    while (in.hasNext) {
      val word = in.next.toLowerCase
      val count = words.getOrElse(word , 0)+1
      words.update(word, count)
    }
    println(words.toString())
  }
}
