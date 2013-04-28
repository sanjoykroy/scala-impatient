package chapterten

import java.beans.{PropertyChangeEvent, PropertyChangeListener}


object QuestionFive {
  def main(args: Array[String]) {
    val point = new java.awt.Point(10, 20) with PropertyChangeSupportLike
    println(point)
    val listener = new PropertyChangeListener {
      def propertyChange(evt: PropertyChangeEvent) {
        println("Old Value : " + evt.getOldValue)
        println("New Value : " + evt.getNewValue)
      }
    }
    point.addPropertyChangeListener(listener)
    point.firePropertyChange("x", 10, 30)
    point.firePropertyChange("y", 20, 40)
    println(point.hasListeners("x"))
    println(point.hasListeners("y"))
  }
}
