/**
  * Created by aravikri on 11/2/2016.
  */
object Higher_Order_Functions {
  def main(args: Array[String]) {
    println( apply( layout, 10) )
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
}

