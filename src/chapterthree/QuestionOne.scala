package chapterthree

import collection.mutable.ArrayBuffer
import util.Random
import collection.mutable

/**
 * Question - 1
 * Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */
object QuestionOne {
  def main(args: Array[String]) {
     val arr = new Array[Int](5)
     for (i <- 0 to arr.length-1) {
        arr.update(i, getRandomValue(i+1))
     }
     println(arr.mkString(","))
  }

  def getRandomValue(n : Int) : Int = {
     val random = new Random()
     random.nextInt(n)
  }
}
