package chapterthree

/**
 * Question - 2
 * Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */
object QuestionTwo {
  def main(args: Array[String]) {
     val arr = Array(1, 2, 3, 4, 5)
     var i = 0
     while (i+1 < arr.length) {
        val tmp = arr(i)
        arr(i) = arr(i+1)
        arr(i+1) = tmp
        i = i + 2
     }
     println(arr.mkString(","))
  }
}
