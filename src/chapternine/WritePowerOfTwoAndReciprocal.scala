package chapternine

import java.io.PrintWriter


object WritePowerOfTwoAndReciprocal {
  def main(args: Array[String]) {
    val out = new PrintWriter("D:\\numbers.txt")
    for (num <- 0 to 20){
      if (num==0){
        out.print("%7d     %f\n".format(1, 1.0))
      } else {
        val powOfTwo = scala.math.pow(2, num)
        val reciprocal = 1 / powOfTwo
        out.print("%7d     %6f\n".format(powOfTwo.toInt, reciprocal))
      }
    }
    out.close()
  }
}
