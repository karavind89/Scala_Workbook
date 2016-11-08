/**
  * Created by aravikri on 11/4/2016.
  */


object Iterator {

  def main(args: Array[String]) {
    val x = List(2, 3, 5, 7, 11)
    val names = Vector("Bob", "Fred", "Joe", "Julia", "Kim")
    val nums = Seq(1, 2, 3)


    //Iterate through Lists - Method1
    x.foreach {
      println
    }

    //Iterate through Lists - Method2
    for (name <- x) println(name)

    //Check condition while Iterating
    for (name <- names if name.startsWith("J")) println(name)

    //Looping Conditions
    for (n <- names) println(n)
    for (n <- names) println(n.capitalize)
    for (n <- names) {
      // imagine this requires several lines
      println(n.capitalize)
    }

    //Simple Generator
    for (i <- 1 to 3) println(i)

    //Multiple Generator
    val nums1 = Seq(1,2,3)
    val letters = Seq('a', 'b', 'c')
    val res = for {
      n <- nums1
      c <- letters
    } yield (n, c)
    println(res)

    //Generator with conditions
    for (i <- 1 to 10 if i < 4) println(i)

    //for-yield exampls
    val names2 = for (e <- names) yield e.capitalize
    println(names2)

    //Same with Map
    val out = names.map(_.capitalize)
    println(out)


    //Loop Counter ,it is like enumerator in python
    for (i <- 0 until names.length) {
      println(s"$i is ${names(i)}")
    }

    val nameMap = Map("firstName" -> "Ed", "lastName" -> "Chigliak")

    //Looping through Map - Method 1
    for ((k,v) <- nameMap) {
      println(s"key: $k, value: $v")
    }

    //Looping through Map - Method 2
    val result = for ((k,v) <- nameMap) yield {
      s"key: $k, value: $v"
    }
    println(result)


    val ratings = Map(
      "Lady in the Water"-> 3.0,
      "Snakes on a Plane"-> 4.0,
      "You, Me and Dupree"-> 3.5
    )

    //Looping through Map - Method 3
    ratings.foreach {
      case(movie, rating) => println(s"key: $movie, value: $rating")
    }

    //Looping through Map - Method 4
    ratings.foreach(x => println(s"key: ${x._1}, value: ${x._2}"))

    //Get Keys and Values for Maps
    ratings.keys.foreach((movie) => println(movie))
    ratings.keys.foreach(println)
    ratings.values.foreach((rating) => println(rating))

    //Looping using foreach
    names.foreach(println)
    names.foreach(e => println(e.toUpperCase))
    names.foreach {
      // imagine this requires multiple lines
      e => println(e.toUpperCase)
    }




  }
}
