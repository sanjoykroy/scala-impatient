package chaptertwo

/**
 *
 * Question - 6
 * Write a for loop for computing the product of the Unicode codes of all letters
 * in a string. For example, the product of the characters in "Hello" is 9415087488L.
 *
 */
object QuestionSix {
  def main(args: Array[String]) {
    var product:Long = 1
    for (str <- "Hello"){
      product = product * str.toInt
    }
    println(product)
  }
}
