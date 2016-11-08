/**
  * Created by aravikri on 11/3/2016.
  */
object Tuples {
  def main(args: Array[String]) {

    val t = (4,3,2,1)
    //Access Tuple values
    val sum = t._1 + t._2 + t._3 + t._4

    //Iterate through Tuples
    t.productIterator.foreach{ i =>println("Value = " + i )}

    println( "Sum of elements: "  + sum )
  }
}
