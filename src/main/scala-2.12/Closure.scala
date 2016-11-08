/**
  * Created by aravikri on 11/3/2016.

// Get a list of the letters
val letters = "abcdefghijklmnopqrstuvwxyz".split("").toList.tail

// Now create a list that maps each letter to a list containing itself
// and the two letters after it, in reverse alphabetical
// order. (Bizarre, but hey, it's a simple example. BTW, we lose y and
// z in the process.)

letters.zip((1 to 26).toList.sliding(3).toList).toMap.mapValues(_.map(x => letters(x-1)).sorted.reverse)

// Pretty unintelligible. Let's break things up a bit

val ranges = (1 to 26).toList.sliding(3).toList
val letter2range = letters.zip(ranges).toMap
letter2range.mapValues(_.map(x => letters(x-1)).sorted.reverse)

// Okay, that's better. But it is easier to interpret the latter if we break things up a bit

letter2range.mapValues (
  range => {
    val alphavalues = range.map (number => letters(number-1))
    alphavalues.sorted.reverse
  }
)

// We can also do the one-liner coherently if we have a helper function.

def lookupSortAndReverse (range: List[Int], alpha: List[String]) =
  range.map(number => alpha(number-1).sorted.reverse)

letter2range.mapValues(range => lookupSortAndReverse(range, letters))

// Note that we can "capture" the letters value, though this makes the
// requires letters to be defined before lookupSortAndReverse in the
// program.

def lookupSortAndReverseCapture (range: List[Int]) =
  range.map(number => letters(number-1).sorted.reverse)

letter2range.mapValues(range => lookupSortAndReverseCapture(range))
  */
