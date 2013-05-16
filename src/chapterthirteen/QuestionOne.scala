package chapterthirteen


object QuestionOne {
  def main(args: Array[String]) {

    val freq = scala.collection.mutable.Map[Char, scala.collection.mutable.LinkedHashSet[Int]]()

    val s = "Mississippi"

    for ((c, i) <- s.zipWithIndex) freq(c) = freq.getOrElse(c, scala.collection.mutable.LinkedHashSet(s.indexOf(c))) + i

    println(freq)

  }
}
