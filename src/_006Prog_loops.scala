//IMPORT
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object americoLIB {
  def main(args: Array[String]) {

// ---------- LOOPING ----------
// To compile and run in the terminal
// 1. scalac americoLIB.scala
// 2. scala americoLIB

    var i = 0

    while (i <= 10) {
      print(i)
      i += 1
    }

    do {
      print("i=" + i + ",")
      i += 1
    } while(i <= 20)

    for (i <- 1 to 10){
      print("i=" + i + ",")
    }

    // until is often used to loop through strings or arrays
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length){

      // Get the letter in the index of the String
      print("randLetters(i)="+ randLetters(i) + ", ")
    }

    // Used to iterate through a list
    val aList = List(1,2,3,4,5)
    for(i <- aList){
      print("List Item " + i + ", ")
    }

    // Store even numbers in a list
    var evenList = for { i <- 1 to 20
      // You can put as many conditons here separated with semicolons
      // as you need
      if (i % 2) == 0
    } yield i

    println("Even List")
    for(i <- evenList)
      print("i=" + i + ",")

    // This loop assigns a value to the 1st variable and it retains
    // that value until the 2nd finishes its cycle and then it iterates
    for (i <- 1 to 5; j <- 6 to 10){
      print("i: " + i + ", ")
      print("j: " + j + ", ")
    }

    // There is no break or continue in Scala
    def printPrimes() {

      val primeList = List(1,2,3,5,7,11)
      for (i <- primeList){

        // Works like break if you return from a function
        if(i == 11){
          return
        }

        // Works like continue
        if (i != 1){
          print("i=" + i + ",")
        }

      }

    }

    printPrimes
    println("")
  }
}