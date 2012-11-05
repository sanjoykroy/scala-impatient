package chapterthree

/**
 * Question - 3
 * Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
 */
object QuestionThree {
  def main(args: Array[String]) {
     val arr = Array(1, 2, 3, 4, 5)
     val newArr = (for {b <- arr.grouped(2); c <- b.reverse} yield c).toArray
     println(newArr.mkString(","))
  }
}
