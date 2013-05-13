package chaptereleven


class Matrix(r: Int, c: Int) {
   private val row: Int = r
   private val col: Int = c
   private val matrix = Array.ofDim[Int](row,col)

   def update(r: Int, c: Int, v: Int): Unit =  {
     matrix(r)(c) = v
   }

   def +(other: Matrix) = {
     val result = new Matrix(row, col)
     if (row == other.row && col == other.col){
       for(r <- 0 until this.row; c <- 0 until this.col) {
         result(r, c) = this.matrix(r)(c) + other.matrix(r)(c)
       }
     }
     result
   }

   def *(other: Matrix) = {
     val result = new Matrix(row, col)
     if (col == other.row){
       for(r <- 0 until this.row; c <- 0 until this.col) {
         result(r, c) = ( for (k <- 0 until this.row) yield matrix(r)(k) * other.matrix(c)(k) ).sum
       }
     }
     result
   }

   def *(factor: Int) = {
     val result = new Matrix(row, col)
     for(r <- 0 until this.row; c <- 0 until this.col) {
         result(r, c) = this.matrix(r)(c) * factor
     }
     result
   }

   override def toString = matrix.map(_.mkString(" ")).mkString("\n")
}

