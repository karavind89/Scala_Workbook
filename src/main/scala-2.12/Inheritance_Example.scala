/**
  * Created by aravikri on 11/2/2016.
  */
//Simple Class Example

class Point_(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x)
    println ("Point y location : " + y)
  }
}

// Inheritance Property (Overriding and Extends)

class Location(override val xc: Int, override val yc: Int,
               val zc :Int) extends Point_(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Call from Location class")
    println ("Point x location : " + x)
    println ("Point y location : " + y)
    println ("Point z location : " + z)
  }
}

object Inheritance_Example {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15)

    // Move to a new location
    loc.move(10, 10, 5)
  }
}
