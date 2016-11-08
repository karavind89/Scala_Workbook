/**
  * Created by aravikri on 11/2/2016.
  */

object Function_Call_By_Value extends App {

  def time(): Long = {
    println("In time()")
    System.nanoTime
  }

  def exec(t: Long): Long = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }

  println(exec(time()))

}