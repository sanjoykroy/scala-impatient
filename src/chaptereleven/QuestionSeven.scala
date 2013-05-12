package chaptereleven


object QuestionSeven {
  def main(args: Array[String]) {
    val bitSeq = new BitSequence(4L)
    println(bitSeq)
    println(bitSeq.apply(2))
    println(bitSeq.update(1))
    println(bitSeq.update(3))
  }
}
