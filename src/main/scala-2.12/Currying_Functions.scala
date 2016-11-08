/**
  * Created by aravikri on 11/3/2016.
  */
object Currying_Functions {
  def main(args: Array[String]) {
    val str1:String = "Hello, "
    val str2:String = "Scala!"

    println( "str1 + str2 = " +  strcat(str1)(str2) )
  }

  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}