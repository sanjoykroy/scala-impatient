package chapterfive


object QuestionOne {
  def main(args: Array[String]) {
    val counter = new Counter
    for(i <- 1 to Int.MaxValue) {
      counter.increment()
    }
    counter.increment()
    println(counter.current)
  }
}
