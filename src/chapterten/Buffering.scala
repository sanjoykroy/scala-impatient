package chapterten

import java.io.InputStream


trait Buffering {
  this: InputStream =>
    private val DEFAULT_BUFFER_SIZE: Int = 8912
    private val buf = new Array[Byte](DEFAULT_BUFFER_SIZE)
    private var pos:Int = 0
    private var n:Int = 0
    override def read() : Int = {
      if (pos >= n) {
        n = this.read(buf, 0, DEFAULT_BUFFER_SIZE)
        if (n >= 0) -1
      }
      pos = pos + 1
      buf(pos-1)
    }
}
