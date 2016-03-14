// How to import library functions
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTut {
  def main(args: Array[String]) {

// ---------- ABSTRACT CLASS ----------
// An abstract class can't be instantiated. It is made up of both abstract
// and non-abstract methods and fields

abstract class Mammal(val name : String){
  // An abstract field has no initial value
  var moveSpeed : Double

  // An abstract method has no body
  def move : String

}

class Wolf(name : String) extends Mammal(name){
  // You don't use override when defining abstract fields
  var moveSpeed = 35.0;

  def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

}


} // ---------- End of object ScalaTut ----------