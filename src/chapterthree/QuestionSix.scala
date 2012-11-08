package chapterthree

import collection.mutable.ArrayBuffer

/**
 * Question - 6
 * How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
 * How do you do the same with an ArrayBuffer[Int]?
 */
object QuestionSix {
  def main(args: Array[String]) {
    val arr = Array(2, 0, 4, 1, 10, 5, 16, -1, 8, 2)
    println(arr.sorted.reverse.mkString(","))
    val arrBuffer = ArrayBuffer(2, 0, 4, 1, 10, 5, 16, -1, 8, 2)
    println(arrBuffer.sorted.reverse.mkString(","))
  }
}
