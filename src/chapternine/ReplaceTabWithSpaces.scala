package chapternine

import java.io.PrintWriter
import io.Source


object ReplaceTabWithSpaces {
  def main(args: Array[String]) {
    val out = new PrintWriter("D:\\myFileOut.txt")
    val source = Source.fromFile("D:\\myFile2.txt")
    val iter = source.buffered
    while(iter.hasNext) {
      val c = iter.next()
      if (c == '\t'){
        out.print("          ")
      } else {
        out.print(c)
      }
    }
    source.close()
    out.close()

  }
}
