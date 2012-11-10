package chapterthree

import java.awt.datatransfer._
import collection.mutable.ListBuffer

/**
 * Question - 10
 */
object QuestionTen {
  def main(args: Array[String]) {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val natives = ListBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
    println(natives.mkString(","))
  }
}
