package chaptertwo

/**
 *
 *  Question - 10
 *                                  n
 *  Write a function that computes x, where n is an integer.
 *

 */
object QuestionTen {
  def main(args: Array[String]) {
      println(compute(2, -1))
  }
  def compute(x: Int, n: Int) : Double = {
      if (n == 0)
          1
      else if ( n > 0 && (n % 2 == 0))
          compute(x , n / 2) * compute(x , n / 2)
      else if ( n > 0 && (n % 2 != 0))
          x * compute(x, n - 1)
      else
          1 / compute(x, -n)
  }


}
