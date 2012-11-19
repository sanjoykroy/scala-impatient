package chaptersix

object MilesToKilometers extends UnitConversion {
  def convert(toConvert: Double) = toConvert * 1.609344

  def main(args: Array[String]) {
      println(convert(2))
  }
}
