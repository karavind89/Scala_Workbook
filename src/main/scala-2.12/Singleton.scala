/**
  * Created by aravikri on 11/2/2016.
  */
import java.io._

class Point_Singleton(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

object Singleton {
  def main(args: Array[String]) {
    val point = new Point_Singleton(10, 20)
    printPoint

    def printPoint{
      println ("Point x location : " + point.x);
      println ("Point y location : " + point.y);
    }
  }
}
