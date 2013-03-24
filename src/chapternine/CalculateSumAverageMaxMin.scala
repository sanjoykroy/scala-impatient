package chapternine

import io.Source


object CalculateSumAverageMaxMin {
  def main(args: Array[String]) {
    val source = Source.fromFile("D:\\floatNums.txt")
    val numbers = for (token <- source.mkString.split("\\s+")) yield token.toDouble
    println("Sum :: "+numbers.sum)
    println("Average :: "+numbers.sum / numbers.length)
    println("Max :: "+numbers.max)
    println("Min :: "+numbers.min)
    source.close()
  }
}
