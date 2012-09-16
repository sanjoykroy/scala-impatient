package chaptertwo

/**
 *  Question - 9
 *  Write a recursive function that computes the product of the Unicode codes of all letters of a string.
 *  For example, the product of the characters in "Hello" is 9415087488L.
 */
object QuestionNine {
  def main(args: Array[String]) {
    println(recursiveProduct("Hello"))
  }
  def recursiveProduct(s : String) : Long = {
      if (s.length == 1)
          s.head.toLong
      else
          s.head.toLong * recursiveProduct(s.tail)
  }
}
