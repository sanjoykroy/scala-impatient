package chapterfive


object QuestionThree {
  def main(args: Array[String]) {
    val myTime = new Time(12, 34)
    val otherTime = new Time(13, 2)
    println(myTime before otherTime)
    val otherTime2 = new Time(12, 2)
    println(myTime before otherTime2)
    val otherTime3 = new Time(12, 34)
    println(myTime before otherTime3)
  }
}
