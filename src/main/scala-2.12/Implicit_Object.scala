/**
  * Created by aravikri on 11/2/2016.
  */
object Implicit_Object {
  implicit class IntTimes(x: Int) {
    def times [A](f: =>A): Unit = {
      def loop(current: Int): Unit =

        if(current > 0){
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}
