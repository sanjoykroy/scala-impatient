package chapterfive


class Time(val hrs: Int, val mins: Int) {
   def before(other: Time): Boolean = {
     if ( this.hrs < other.hrs )
       true
     else if ( this.hrs == other.hrs && this.mins < other.mins )
       true
     else
       false
   }
}
