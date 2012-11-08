package chapterthree

/**
 *  Question - 5
 *  How do you compute the average of an Array[Double]?
 */
object QuestionFive {
  def main(args: Array[String]) {
     val arr = Array(1.0, 2.5, 3.5, 4.0, 5.5)
     println("Average :: "+ arr.sum / arr.length)
  }
}
