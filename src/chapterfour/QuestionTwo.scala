package chapterfour

import collection.mutable

/**
 * Question - 2
 * Write a program that reads words from a file. Use a mutable map to count how often each word appears.
 */
object QuestionTwo {
  def main(args: Array[String]) {
    val words = mutable.Map[String, Int]()
    val in = new java.util.Scanner(new java.io.File("D:\\development\\scalaProjects\\scala-impatient\\src\\chapterfour\\myFile.txt"))
    var word = ""
    while (in.hasNext) {
      word = in.next.toLowerCase
      words.update(word, words.getOrElse(word, 0)+1)
    }
    println(words.toString())
  }
}
