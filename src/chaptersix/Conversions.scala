package chaptersix

/**
 * Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
 */
object Conversions {
  def inchesToCentimeters(inches: Double): Double = inches * 2.54
  def gallonsToLiters(gallons: Double): Double = gallons * 4.54609
  def milesToKilometers(miles: Double): Double = miles * 1.609344

  def main(args: Array[String]) {
    println(inchesToCentimeters(2))
    println(gallonsToLiters(3))
    println(milesToKilometers(2))
  }
}
