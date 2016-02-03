//PRINT
println("Please enter your name:")
val name = readLine

//PRINT
println("Please enter your age:")
val age = readInt

//CONDITION
val eligible = if(age < 18) "You are minor, so you are not eligible to get voter id card" else "You are major, so You can Vote!!"

//PRINT
print("Hello " + name + "\n" + eligible + "\n")
