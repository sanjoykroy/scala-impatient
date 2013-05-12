package chaptereleven


object QuestionFour {
  def main(args: Array[String]) {
    println(Money(3, 17) + Money(5, 30))
    println(Money(3, 17) - Money(5, 30))
    println(Money(1, 75) + Money(0, 50) == Money(2, 25))
    println(Money(3, 17) < Money(5, 30))
    println(Money(5, 30) > Money(3, 17))
  }
}
