package chapternine

import io.Source


object PrintNonFloatingNumberTokens {
  def main(args: Array[String]) {
    val source = Source.fromFile("D:\\Sample.txt")
    val numPattern = "[0-9]+[.][0-9]+".r
    val words = for (token <- source.mkString.split("\\s+") if (numPattern.findAllIn(token).size == 0)) yield token
    println(words.mkString("\n"))
    source.close()
  }
}
