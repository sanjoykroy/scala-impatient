package chaptereleven

class RichFileSeq(f: String) {
  private val filePath: String= f
}

object RichFileSeq{
  def apply(f: String) = new RichFileSeq(f)
  def unapplySeq(other: RichFileSeq): Option[Seq[String]] = {
    val path = other.filePath
    if (path == "") None else Some(path.split("/"))
  }
}