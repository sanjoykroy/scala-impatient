package chapterfour

/**
 * Question 1
 * Set up a map of prices for a number of gizmos that you covet.
 * Then produce a second map with the same keys and the prices at a 10 percent discount.
 */
object QuestionOne {
  def main(args: Array[String]) {
    val gizmos = Map("G1" -> 10, "G2" -> 30, "G3" -> 15)
    val discountedGizmos = for ((k, v) <- gizmos) yield (k, v - (v * 10 / 100))
    println(discountedGizmos.toString())
  }
}
