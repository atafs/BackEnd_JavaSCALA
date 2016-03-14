//IMPORT
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object americoLIB {
  def main(args: Array[String]) {
      // ---------- TUPLES ----------
	// Tuples can hold values of many types, but they are immutable

	var tupleMarge = (103, "Marge Simpson", 10.25)

	printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

	// Iterate through a tuple
	tupleMarge.productIterator.foreach{ i => println(i)}

	// Convert Tuple to String
	println(tupleMarge.toString())
      
  }
}