package chaptereleven


class ASCIIArt(str: String) {

  private val dog =
    """
        /\_/\
       ( ' ' )
       (  -  )
        | | |
       (__|__)
    """

  private val hello =
    """
        -------
       / Hello \
      <  Scala |
       \ Coder /
        -------
    """
  override def toString = if (str.equalsIgnoreCase("dog")) dog else hello
  def |(other: ASCIIArt) = {
    val arr = toString.split("\r\n")
    val otherArr = other.toString.split("\r\n")
    arr.zip(otherArr).map(x => x._1 + x._2).mkString("\n")
  }
  def ^(other: ASCIIArt) = toString +  other
}

object ASCIIArt {
  def apply(str: String)= new ASCIIArt(str)
}
