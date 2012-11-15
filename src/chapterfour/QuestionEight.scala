package chapterfour

/**
 * Question - 8
 * Write a function minmax(values: Array[Int]) that returns a pair containing the
 * smallest and largest values in the array.
 */
object QuestionEight {
  def main(args: Array[String]) {
    val arr = Array(1,4,0,6,-2,4)
    println(minmax(arr))
  }

  def minmax(values: Array[Int]):Tuple2[Int, Int] = (values.min , values.max)
}
