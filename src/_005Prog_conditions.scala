//IMPORT
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

// Conditional Operators : ==, !=, >, <, >=, <=
// Logical Operators : &&, ||, !

var age = 18


// You have to use { } in the REPL, but not otherwise
if ((age >= 5) && (age <= 6)) {
  println("Go to Kindergarten")
} else if ((age > 6) && (age <= 7)) {
  println("Go to Grade 1")
} else {
  println("Go to Grade " + (age + 5))
}

val canVote = if (age >= 18) "yes" else "no"
println("canVote => " + canVote)

