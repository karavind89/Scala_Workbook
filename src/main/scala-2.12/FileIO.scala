/**
  * Created by aravikri on 11/5/2016.
  */
import java.io._

object FileIO {

  def main(args: Array[String]) {

    //Write to a File
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("Hello Scala")
    writer.close()

    //Get Input from User
    print("Please enter your input : " )
    val line = scala.io.StdIn.readLine()

    println("Thanks, you just typed: " + line)

    //Reading from file
    println("Following is the content read:" )

    scala.io.Source.fromFile("test.txt" ).foreach {
      print
    }




  }
}
