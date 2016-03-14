//IMPORT
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
import scala.math

print("5 + 4 = " + (5 + 4) + "\n")
print("5 - 4 = " + (5 - 4) + "\n")
print("5 * 4 = " + (5 * 4) + "\n")
print("5 / 4 = " + (5 / 4) + "\n")
print("5 % 4 = " + (5 % 4) + "\n")

// Shorthand notation (No randInt++, or randInt--)
/*
randInt += 1
print("randInt += 1" + randInt + "\n")

randInt -= 1
"randInt -= 1" + randInt

randInt *= 1
"randInt *= 1" + randInt

randInt /= 1
"randInt /= 1" + randInt
*/

// Import the math library in the terminal import scala.math._
print(abs(-8) + "\n")
print(cbrt(64)  + "\n")// Cube root a^3 = n (Find a)
print(ceil(5.45) + "\n")
print(round(5.45) + "\n")
print(floor(5.45) + "\n")
print(exp(1)  + "\n")// Euler's number raised to the power
print(pow(2, 2)  + "\n")// 2^2
print(sqrt(pow(2,2) + pow(2,2)) + "\n")
print(hypot(2, 2)  + "\n")// sqrt(X^2 + y^2)
print(log10(1000)  + "\n")// = 3 (10 × 10 × 10 = 10^3)
print(log(2.7182818284590455)  + "\n")// Natural logarithm to the base e
print(min(5, 10) + "\n")
print(max(5, 10) + "\n")
print((random * (11 - 1) + 1).toInt  + "\n")// Random number between 1 and 10
print(toRadians(90) + "\n")
print(toDegrees(1.5707963267948966) + "\n")

// acos, asin, atan, atan2, cos, cosh, sin, sinh, tan, tanh