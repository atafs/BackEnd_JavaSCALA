//IMPORT
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object americoLIB {
  def main(args: Array[String]) {
      
    // ---------- FILE I/O ----------
    // Use import java.io.PrintWriter to write to a file
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nSome more random text")
    writer.close()

    // Use import scala.io.Source to read from files
    val textFromFile = Source.fromFile("test.txt", "UTF-8")

    // Iterate through each line in the file and print
    val lineIterator = textFromFile.getLines
    for(line <- lineIterator){
      println(line)
    }
    textFromFile.close()

    // ---------- EXCEPTION HANDLING ----------

    def divideNums(num1 : Int, num2 : Int) = try
    {
      (num1 / num2)
    } catch {
        case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // Clean up after exception here
    }

    println("3 / 0 = " + divideNums(3,0))
       
  }
}