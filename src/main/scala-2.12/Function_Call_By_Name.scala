/**
  * Created by aravikri on 11/2/2016.
  */

object Function_Call_By_Name extends App {

  def time() = {
    println("Entered time() ...")
    System.nanoTime
  }

  // uses a by-name parameter here
  def exec(t: => Long) = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }

  println(exec(time()))

}