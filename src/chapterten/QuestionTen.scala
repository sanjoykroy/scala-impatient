package chapterten


object QuestionTen {
  def main(args: Array[String]) {
    val fis = new java.io.FileInputStream("D:\\sample.txt") with IterableInputStream
    for(c <- fis) print(c.toChar)
  }
}
