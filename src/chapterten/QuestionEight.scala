package chapterten

import java.io.FileInputStream


object QuestionEight {
  def main(args: Array[String]) {
    val fis = new FileInputStream("D:\\sample.txt") with Buffering
    var content: Int = 0
    while ((content = fis.read()) != -1) {
      print(content.toChar)
    }
    fis.close()
  }
}
