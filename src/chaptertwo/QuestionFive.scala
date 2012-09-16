package chaptertwo

/**
 * Question - 5
 * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
 */
object QuestionFive {
  def main(args: Array[String]) {
     countdown(8)
  }

  def countdown(n: Int){
    for(j <- 0 to n){
      println(n-j)
    }
  }
}
