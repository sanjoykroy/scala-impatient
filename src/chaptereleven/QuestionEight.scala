package chaptereleven


object QuestionEight {
  def main(args: Array[String]) {
    val mat1 = new Matrix(2,2)
    mat1(0,0) = 1
    mat1(0,1) = 2
    mat1(1,0) = 3
    mat1(1,1) = 2
    println(mat1)
    val mat2 = new Matrix(2,2)
    mat2(0,0) = 1
    mat2(0,1) = 1
    mat2(1,0) = 1
    mat2(1,1) = 1
    println(mat2)
    println(mat1 + mat2)
    println(mat1 * mat2)
    println(mat1 * 2)
  }
}
