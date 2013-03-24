package chapternine

import io.Source


object PrintWordsWithMoreThanEightCharacters {
  def main(args: Array[String]) {
    val source = Source.fromFile("D:\\myFile.txt")
    for (token <- source.mkString.split("\\s+") if (token.length > 8)){
        println(token)
    }
    source.close()
  }
}
