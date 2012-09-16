package chaptertwo


/**
 * Question - 1
 * The signum of a number is 1 if the number is positive, –1 if it is negative, and
 * 0 if it is zero. Write a function that computes this value.
 */

object QuestionOne {
  def main(args: Array[String]) {
      println(signum(3))
  }

  def signum(num : Int) =  if ( num > 0 ) 1 else if ( num < 0 ) -1 else 0
}
