package chaptertwo

/**
 * Question - 7
 * Compute the product of the Unicode codes of all letters in a string without using a loop.
 * For example, the product of the characters in "Hello" is 9415087488L.
 */
object QuestionSeven {
  def main(args: Array[String]) {
    println("Hello".map(_.toLong).product)
  }
}
