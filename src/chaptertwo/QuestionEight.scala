package chaptertwo

/**
 *  Question - 8
 *  Write a function product(s : String) that computes the product of the Unicode codes of all letters
 *  in that string. For example, the product of the characters in "Hello" is 9415087488L.
 */
object QuestionEight {
  def main(args: Array[String]) {
    println(product("Hello"))
  }
  def product(s: String):Long ={
    return "Hello".map(_.toLong).product
  }
}
