package chaptertwelve


object QuestionSeven {
  def main(args: Array[String]) {
    val pairs = (1 to 10) zip (11 to 20)
    println(pairs)

    println( adjustToPair(_ * _)((6, 7)) )

    println(pairs.map(adjustToPair(_ + _)))
  }

  def adjustToPair(fun: (Int, Int) => Int) =  (x: (Int, Int)) => fun(x._1, x._2)
}
