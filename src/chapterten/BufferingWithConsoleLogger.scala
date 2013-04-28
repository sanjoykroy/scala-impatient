package chapterten

import java.io.InputStream


trait BufferingWithConsoleLogger extends ConsoleLogger {
  this: InputStream =>
  private val DEFAULT_BUFFER_SIZE: Int = 150
  private val buf = new Array[Byte](DEFAULT_BUFFER_SIZE)
  private var pos:Int = 0
  private var n:Int = 0
  override def read() : Int = {
    if (pos >= n) {
      n = this.read(buf, 0, DEFAULT_BUFFER_SIZE)
      log("%d bytes are buffered".format(n))
      if (n >= 0) -1
    }
    pos = pos + 1
    buf(pos-1)
  }

}
