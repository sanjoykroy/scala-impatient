package chaptersix


object InchesToCentimeters extends UnitConversion {
  def convert(toConvert: Double) = toConvert * 2.54

  def main(args: Array[String]) {
    println(convert(2))
  }
}
