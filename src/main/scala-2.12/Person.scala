/**
  * Created by aravikri on 10/31/2016.
  */
//define the class
class Person(val firstName: String, val lastName: String) {

  println("the constructor begins")
  val fullName = firstName + " " + lastName

    // define some methods
  def foo { println("foo") }
  def printFullName {
    // access the fullName field, which is created above
    println(fullName)
  }

  println(fullName)
  println("still in the constructor")

}
