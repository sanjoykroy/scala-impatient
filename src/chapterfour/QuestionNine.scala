package chapterfour

/**
 * Question - 9
 * Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
 * the counts of values less than v, equal to v, and greater than v.
 */
object QuestionNine {
  def main(args: Array[String]) {
    val arr = Array(12,3,-4,29,1,19,2)
    println(lteqgt(arr, 2))
  }

  def lteqgt(values: Array[Int], v: Int) = Tuple3(
                                                   values.filter( _ < v ).length,
                                                   values.filter( _ == v ).length,
                                                   values.filter( _ > v ).length
                                                 )
}
