package chaptertwo

/**
 * Question - 4
 * Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 */
object QuestionFour {
  def main(args: Array[String]) {
    for(j <- 0 to 10){
      println(10-j)
    }
  }
}
