package chapterfour

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
 * Question - 7
 * Print a table of all Java properties
 */
object QuestionSeven {
  def main(args: Array[String]) {
    val props: scala.collection.Map[String, String] = System.getProperties
    var maxKeyLength = props.keySet.head.length
    for ((k,v) <- props ; if (k.length > maxKeyLength)) maxKeyLength = k.length

    for ((k,v) <- props){
      val numSpaces = maxKeyLength - k.length
      if(numSpaces > 0)
        println(k + String.format("%" + numSpaces +"s", " ") + "| " + v)
      else
        println(k + "| " + v)
    }
  }
}
