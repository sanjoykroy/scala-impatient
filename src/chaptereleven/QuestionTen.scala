package chaptereleven


object QuestionTen {
  def main(args: Array[String]) {
    val RichFileSeq(seg1, seg2, seg3) = RichFileSeq("home/test/Sample2.txt")
    println("%s %s %s".format(seg1, seg2, seg3))
  }
}
