/**
  * Created by aravikri on 11/2/2016.
  */
object Anonymous {
  def main(args: Array[String]): Unit = {

      //function1
      var inc = (x:Int) => x+1
      var x = inc(7)

      println(x)

      //function2
      var mul = (x: Int, y: Int) => x*y

      println(mul(3, 4))

      //function3
      var userDir = () => { System.getProperty("user.dir") }

      println( userDir )


  }
}
