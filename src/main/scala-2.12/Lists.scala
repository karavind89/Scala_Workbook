/**
  * Created by aravikri on 11/3/2016.
  */
object Lists {

  def main(args: Array[String]) {

    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    println(dim)
    println(dim(0))
    println(dim(0)(0))

    //another way of defining Lists
    val fruits = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums_nil = Nil

    println( "Head of fruit : " + fruits.head )
    println( "Tail of fruit : " + fruits.tail )
    println( "Check if fruit is empty : " + fruits.isEmpty )
    println( "Check if nums is empty : " + fruits.isEmpty )

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    /**
      * Concatenating Lists
      */

    // use two or more lists with ::: operator
    var fruitss = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " + fruitss )

    // use two lists with Set.:::() method
    fruitss = fruit1.:::(fruit2)
    println( "fruit1.:::(fruit2) : " + fruitss )

    // pass two or more lists as arguments
    fruitss = List.concat(fruit1, fruit2)
    println( "List.concat(fruit1, fruit2) : " + fruitss  )


  }
}
