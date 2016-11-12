/**
  * Created by aravind on 11/12/16.
  */
object Example_of_Methods_Available {

  def main(args: Array[String]): Unit = {

    val evens = List(2, 4, 6)
    val odds = List(1, 3, 5)

    println(evens ++ odds) // List(2, 4, 6, 1, 3, 5)
    println(evens ++: odds) // List(2, 4, 6, 1, 3, 5)
    println(0 +: evens) // List(0, 2, 4, 6)
    println(odds :+ 7) // List(1, 3, 5, 7)
    println(0 :: evens) // List(0, 2, 4, 6)
    println(evens :: odds) // List(List(2, 4, 6), 1, 3, 5)
    println(evens ::: odds) // List(2, 4, 6, 1, 3, 5)
    println((0 /: evens) (_ + _)) // 12
    println((evens :\ 0) (_ + _)) // 12


    val a = "foo bar baz"
    val foo = "foo"
    val bar = "bar"
    val names = List("Al", "Christina", "Kim")
    val firstTen = (1 to 10).toList
    val fiveToFifteen = (5 to 15).toList


    println(foo * 3) // foofoofoo
    println(a.capitalize) // Foo bar baz

    // collect and collectFirst take a partial function
    println(firstTen.collect { case x if x % 2 == 0 => x }) // List(2, 4, 6, 8, 10)
    println(firstTen.collectFirst { case x if x > 1 => x }) // Some(2)

    println(a.count(_ == 'a')) // 2

    println(a.diff("foo")) // " bar baz"
    println(a.distinct) // "fo barz"
    println(a.drop(4)) // "bar baz"
    println(a.dropRight(2)) // "foo bar b"
    println(a.dropWhile(_ != ' ')) // " bar baz"

    println(a.endsWith("baz")) // true
    println(evens.exists(_ > 2)) // true

    println(a.filter(_ != 'a')) // "foo br bz"
    println(a.filterNot(_ != 'a')) // "aa"
    println(a.filterNot(_ == 'a')) // "foo br bz"
    println(firstTen.find(_ > 4)) // Some(5)
    println(names.flatten) // List(A, l, C, h, r, i, s, t, i, n, a, K, i, m)
    println(names.flatMap(_.toUpperCase)) // List(A, L, C, H, R, I, S, T, I, N, A, K, I, M)

    println(firstTen.fold(0)(_ + _)) // 55
    println(firstTen.fold(1)(_ + _)) // 56
    println(firstTen.fold(2)(_ + _)) // 57

    println(firstTen.fold(0)(_ + _)) // 55
    println(firstTen.foldLeft(0)(_ + _)) // 55
    println(firstTen.foldRight(0)(_ + _)) // 55

    println(firstTen.foldLeft(0)(_ - _)) // -55
    println(firstTen.foldRight(0)(_ - _)) // -5

    println(evens.forall(_ >= 2)) // true
    println(a.foreach(println(_))) // prints one character per line
    println(a.foreach(println)) // prints one character per line
    println(a.getBytes.foreach(println)) // prints the byte value of each character, one value per line

    println(firstTen.groupBy(_ > 5)) // Map(false -> List(1, 2, 3, 4, 5), true -> List(6, 7, 8, 9, 10))
    println(firstTen.grouped(2)) // Iterator[List[Int]] = non-empty iterator
    println(firstTen.grouped(2).toList) // List(List(1, 2), List(3, 4), List(5, 6), List(7, 8), List(9, 10))
    println(firstTen.grouped(5).toList) // List(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10))

    println(firstTen.hasDefiniteSize) // true
    println(firstTen.toStream.hasDefiniteSize) // false (changes to 'true' after you consume the stream)
    println(a.head) // f
    println(a.headOption) // Some(f)

    println(a.indexOf('a')) // 5
    println(firstTen.indexOf(5)) // 4
    println(firstTen.indexOfSlice(Seq(4, 5, 6))) // 3
    println(firstTen.indexWhere(_ == 5)) // 4
    println(firstTen.indices) // Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("foo".indices) // Range(0, 1, 2)
    println("foo bar".init) // "foo ba"

    println("foo".isDefinedAt(1)) // true
    println("foo".isDefinedAt(3)) // false

    // isEmpty
    println(List(1, 2, 3).isEmpty) // false
    println(Nil.isEmpty) // true
    println(None.isEmpty) // true
    println(Some(1).isEmpty) // false

    println(firstTen.intersect(fiveToFifteen)) // List(5, 6, 7, 8, 9, 10)
    println(a.isEmpty) // false


    println(List(1, 2, 3).last) // 3
    println(a.lastIndexOf('o')) // 2
    println(List(1, 1, 2, 2, 1, 1, 3, 3).lastIndexOfSlice(Seq(1, 1))) // 4
    println(List(1, 1, 2, 2, 1, 1, 3, 3).lastIndexWhere(_ == 1)) // 5
    println(List(1, 2, 3).lastOption) // Some(3)
    println(a.length) // 11

    println(a.map(_.toUpper)) // FOO BAR BAZ
    //println(a.map(_.byteValue))                 // Vector(102, 111, 111, 32, 98, 97, 114, 32, 98, 97, 122)
    println(names.max) // "Kim"
    println(names.min) // "Al"
    println(a.mkString(",")) // f,o,o, ,b,a,r, ,b,a,z
    println(a.mkString("->", ",", "<-")) // ->f,o,o, ,b,a,r, ,b,a,z<-

    println(a.nonEmpty) // true

    println(a.par) // a parallel array, ParArray(f, o, o,  , b, a, r,  , b, a, z)
    println(a.partition(_ > 'e')) // (foorz, " ba ba")  // a Tuple2
    println(firstTen.partition(_ > 5)) // (List(6, 7, 8, 9, 10),List(1, 2, 3, 4, 5))

    println(firstTen.reduce(_ + _)) // 55
    println(firstTen.reduceLeft(_ - _)) // -53
    println(firstTen.reduceRight(_ - _)) // Int = -5
    println(a.replace('o', 'x')) // fxx bar baz
    println(a.replace("o", "x")) // fxx bar baz
    println(a.replaceAll("o", "x")) // fxx bar baz
    println(a.replaceFirst("o", "x")) // fxo bar baz
    println(firstTen.reverse) // List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

    // (more on scan, scanLeft, and scanRight below)
    println(Seq(1, 2, 3, 4, 5).scan(1)(_ + _)) // List(1, 2, 4, 7, 11, 16)
    println(Seq(1, 2, 3, 4, 5).scanLeft(1)(_ + _)) // List(1, 2, 4, 7, 11, 16)
    println(Seq(1, 2, 3, 4, 5).scanRight(1)(_ + _)) // List(16, 15, 13, 10, 6, 1)

    // segmentLength
    println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).segmentLength(_ > 3, 0)) // 0
    println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).segmentLength(_ > 3, 1)) // 0
    println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).segmentLength(_ > 3, 2)) // 0
    println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).segmentLength(_ > 3, 3)) // 3
    println(List(1, 2, 3, 4, 5, 4, 3, 2, 1).segmentLength(_ > 3, 4)) // 2

    println(a.size) // 11
    println(a.slice(0, 5)) // foo b
    println(a.slice(2, 9)) // o bar b

    println(firstTen.sliding(2)) // Iterator[List[Int]] = non-empty iterator
    println(firstTen.sliding(2).toList) // List(List(1, 2), List(2, 3), List(3, 4), List(4, 5), List(5, 6), List(6, 7), List(7, 8), List(8, 9), List(9, 10))
    println(firstTen.sliding(4).toList) // List(List(1, 2, 3, 4), List(2, 3, 4, 5), List(3, 4, 5, 6), List(4, 5, 6, 7), List(5, 6, 7, 8), List(6, 7, 8, 9), List(7, 8, 9, 10))
    println(firstTen.sliding(2, 2).toList) // List(List(1, 2), List(3, 4), List(5, 6), List(7, 8), List(9, 10))
    println(firstTen.sliding(2, 3).toList) // List(List(1, 2), List(4, 5), List(7, 8), List(10))
    println(firstTen.sliding(2, 4).toList) // List(List(1, 2), List(5, 6), List(9, 10))

    //println(a.sortBy())                           // this is a bit long; see below
    println(a.sortWith(_ < _)) // "  aabbfoorz"
    println(a.sortWith(_ > _)) // "zroofbbaa  "
    println(a.sorted) // "  aabbfoorz"

    println(firstTen.span(_ < 5)) // (List(1, 2, 3, 4),List(5, 6, 7, 8, 9, 10))
    println(a.split(" ")) // Array(foo, bar, baz)
    println(a.splitAt(3)) // (foo," bar baz")
    println(firstTen.startsWith(Seq(1, 2))) // true

    println(a.tail) // oo bar baz
    println(a.take(3)) // foo
    println(a.takeRight(3)) // baz
    println(a.takeWhile(_ != 'r')) // foo ba
    println(a.toArray) // Array(f, o, o,  , b, a, r,  , b, a, z)
    println(a.toBuffer) // ArrayBuffer(f, o, o,  , b, a, r,  , b, a, z)
    println(a.toList) // List(f, o, o,  , b, a, r,  , b, a, z)
    println(Seq(1, 1, 2, 2, 3, 3).toSet) // Set(1, 2, 3)
    println(firstTen.toStream) // scala.collection.immutable.Stream[Int] = Stream(1, ?)
    println(a.toLowerCase) // foo bar baz
    println(a.toUpperCase) // FOO BAR BAZ
    println(a.toVector) // Vector(f, o, o,  , b, a, r,  , b, a, z)
    println(a.trim) // "foo bar baz"

    println(evens.union(odds)) // List(2, 4, 6, 1, 3, 5)
  }

  }
