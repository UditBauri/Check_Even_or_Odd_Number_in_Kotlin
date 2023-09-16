fun main() {

    // Write a Kotlin Program to check whether a given integer value is
    // Even or Odd Number...

    println("Enter an Integer value to check whether it is Even or Odd")
    val userInput = readln().toInt()
    if(userInput % 2 ==0){
        println("$userInput is a even number")
    }
    else{
        println("$userInput is a odd number")
    }

}