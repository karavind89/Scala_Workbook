/**
  * Created by aravikri on 11/3/2016.
  */
object Sets {

  def main(args: Array[String]) {

    //Define Sets
    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)


    //Concatenating Sets
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruit_combine = fruit1 ++ fruit2
    println("fruit1 ++ fruit2 : " + fruit)

    // use two sets with ++ as method
    fruit_combine = fruit1.++(fruit2)
    println("fruit1.++(fruit2) : " + fruit)

    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    // find common elements between two sets
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )

  }

}
