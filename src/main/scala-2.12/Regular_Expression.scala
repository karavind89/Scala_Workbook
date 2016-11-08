/**
  * Created by aravikri on 11/4/2016.
  */

import scala.util.matching.Regex

object Regular_Expression {

  def main(args: Array[String]) {
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str)
  }

}
