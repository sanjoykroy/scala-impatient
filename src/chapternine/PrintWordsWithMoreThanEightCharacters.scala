package chapternine

import io.Source


object PrintWordsWithMoreThanEightCharacters {
  def main(args: Array[String]) {
    val source = Source.fromFile("D:\\myFile.txt")
    val words = for (token <- source.mkString.split("\\s+") if (token.length > 8)) yield token
    println(words.mkString("\n"))
    source.close()
  }
}
