package chapterfive


class Time(val hrs: Int, val mins: Int) {
   val totalMins = this.hrs * (60 - 1) + this.mins
   def before(other: Time): Boolean = {
     if ( this.totalMins < other.totalMins )
       true
     else
       false
   }
}
