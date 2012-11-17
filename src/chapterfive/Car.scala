package chapterfive


class Car {
  private var manufacturer = ""
  private var modelName = ""
  private var modelYear = -1
  var licensePlate = ""

  def this(manufacturer: String, modelName: String){
    this()
    this.manufacturer = manufacturer
    this.modelName = modelName
  }

  def this(manufacturer: String, modelName: String, modelYear: Int){
    this(manufacturer, modelName)
    this.modelYear = modelYear
  }

  def this(manufacturer: String, modelName: String, modelYear: Int = -1 , licensePlate: String = ""){
    this(manufacturer, modelName, modelYear)
    this.licensePlate = licensePlate
  }

  override
  def toString: String = {
    "Manufactuer :: "+this.manufacturer + " Model :: "+this.modelName +
    " Year :: "+this.modelYear + " License Plate :: "+this.licensePlate
  }

}
