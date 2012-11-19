package chaptersix


object GallonsToLiters extends UnitConversion {
  def convert(toConvert: Double) = toConvert * 4.54609

  def main(args: Array[String]) {
    println(convert(3))
  }
}
