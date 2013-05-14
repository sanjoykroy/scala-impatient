package chaptertwelve


object QuestionSix {
  def main(args: Array[String]) {
    println(largest(x => 10 * x - x * x, 1 to 10))
  }
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).reduceLeft(
      (x, y) => if (x._2 > y._2) x else y
   )._1
}
