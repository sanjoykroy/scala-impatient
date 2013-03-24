package chapternine

import scala.io.Source

object ReverseLines {
  def main(args: Array[String]) {
    val source = Source.fromFile("D:\\myFile.txt")
    val source2 = Source.fromString(source.mkString.reverse)
    val lineIterator = source2.getLines()
    for (l <- lineIterator)
      println(l.reverse)
    source2.close()
    source.close()
  }
}
