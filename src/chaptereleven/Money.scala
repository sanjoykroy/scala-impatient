package chaptereleven


class Money(d: Int, c: Int) {
  private val dollar: Int = d
  private val cent: Int = c
  override def toString = "%d.%d".format(dollar, cent)
  def +(other: Money) = Money(dollar + other.dollar, cent + other.cent)
  def -(other: Money) = {
    val m1 = dollar * 100 + cent
    val m2 = other.dollar * 100 + other.cent
    if (m1 > m2)
      Money((m1 - m2) / 100, (m1 - m2) % 100)
    else
      Money((m1 - m2) / 100, -(m1 - m2) % 100)
  }
  def ==(other: Money) = (dollar * 100 + cent) == (other.dollar * 100 + other.cent)
  def <(other: Money) = (dollar * 100 + cent) < (other.dollar * 100 + other.cent)
  def >(other: Money) = (dollar * 100 + cent) > (other.dollar * 100 + other.cent)
}

object Money {
  def apply(d: Int, c: Int) = {
    var d1 = if (c > 100) (c / 100) else 0
    d1 = d1 + d
    val c1 = if (c > 100) (c % 100) else c
    new Money(d1, c1)
  }
  def unapply(input : Money) = Some((input.dollar, input.cent))
}
