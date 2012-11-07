package chapterthree

/**
 *  Question - 4
 *  Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that
 *  are zero or negative, in their original order
 */
object QuestionFour {
  def main(args: Array[String]) {
    val arr = Array(1, -2, 3, -4, 5, 0)
    val posArr = (for {b <- arr.filter(a => a > 0)} yield b).toArray
    val negArr = (for {c <- arr.filter(a => a <= 0)} yield c).toArray
    val newArr = posArr ++ negArr
    println(newArr.mkString(","))
  }
}
