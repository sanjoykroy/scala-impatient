package chaptereleven


class BitSequence(value: Long = 0L) {
  private var seq: Long = value
  def apply(pos: Int) = if ((seq & (1L << pos)) != 0)  1 else 0
  def update(pos: Int) = {
    seq = seq | (1L << pos)
    this
  }
  override def toString = "%64s".format(seq.toBinaryString).replace(" ", "0")
}
