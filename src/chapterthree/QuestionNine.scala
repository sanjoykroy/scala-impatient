package chapterthree

/**
 * Question - 9
 * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
 * that are in America. Strip off the "America/" prefix and sort the result.
 */
object QuestionNine {
  def main(args: Array[String]) {

    val timeZones = java.util.TimeZone.getAvailableIDs filter( x => x.contains("America"))

    val sortedTimeZones = (
                            for {
                              timeZone <- timeZones
                            } yield timeZone.substring(timeZone.indexOf('/')+1, timeZone.length)
                          ).toArray
                           .sorted

    println(sortedTimeZones.mkString(","))
  }
}
