/**
  * Created by aravikri on 11/5/2016.
  */

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Exception_Handling {

    def main(args: Array[String]) {
      try {
        val f = new FileReader("input.txt")
      } catch {
        case ex: FileNotFoundException =>{
          println("Missing file exception")
        }

        case ex: IOException => {
          println("IO Exception")
        }
      }
      finally {
        println("Exiting finally...")
      }
    }


}
