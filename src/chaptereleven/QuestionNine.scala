package chaptereleven


object QuestionNine {
  def main(args: Array[String]) {
    val RichFile(path, name, ext) = RichFile("D:\\Sample.txt")
    println("Path: %s File Name: %s Extension: %s".format(path, name, ext))
  }
}
