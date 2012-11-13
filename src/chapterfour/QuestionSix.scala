package chapterfour

/**
 * Question - 6
 * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
 * similarly for the other weekdays. Demonstrate that the elements are visited in insertion order.
 */
object QuestionSix {
  def main(args: Array[String]) {
    val days = scala.collection.mutable.LinkedHashMap(
                                                      "Monday" -> java.util.Calendar.MONDAY,
                                                      "Tuesday" ->   java.util.Calendar.TUESDAY,
                                                      "Wednesday" -> java.util.Calendar.WEDNESDAY,
                                                      "Thursday" -> java.util.Calendar.THURSDAY,
                                                      "Friday" -> java.util.Calendar.FRIDAY,
                                                      "Saturday" -> java.util.Calendar.SATURDAY,
                                                      "Sunday" -> java.util.Calendar.SUNDAY
                                                      )

    for((k, v) <- days) println( k +" - "+ v)
  }
}
