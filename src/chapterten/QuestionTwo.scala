package chapterten


object QuestionTwo {
  def main(args: Array[String]) {
    val pointA = new OrderedPoint(10, 20)
    val pointB = new OrderedPoint(30, 20)
    println("Point A : " + pointA)
    println("Point B : " + pointB)
    println(pointA < pointB)
    println(pointA == pointB)
    println(pointA > pointB)
  }
}
