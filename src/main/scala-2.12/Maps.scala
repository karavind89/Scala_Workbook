/**
  * Created by aravikri on 11/3/2016.
  */
object Maps {

  def main(args: Array[String]) {

    //Simple Map
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val nums: Map[Int, Int] = Map()

    // Iterate and Print Key and Values
    colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}

    //Check for a key in Map
    if( colors.contains( "red" )) {
      println("Red key exists with value :"  + colors("red"))
    } else {
      println("Red key does not exist")
    }

    //Basic Operations on MAP
    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )

    //Concatenating Maps

    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colors_combine = colors1 ++ colors2
    println( "colors1 ++ colors2 : " + colors )

    // use two maps with ++ as method
    colors_combine = colors1.++(colors2)
    println( "colors1.++(colors2)) : " + colors )


  }

}
