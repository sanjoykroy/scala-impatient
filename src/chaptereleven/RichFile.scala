package chaptereleven

import java.io._

class RichFile(f: String) {
   private val file: File = new File(f)
}

object RichFile{
  def apply(f: String) = new RichFile(f)
  def unapply(other: RichFile) = {
    val path = other.file.getAbsolutePath
    val fileName = other.file.getName
    val ext = fileName.substring(fileName.lastIndexOf('.')+1)
    Some(path, fileName, ext)
  }
}