//Name: Batzorig ID:2016163 
fun main(args: Array<String>) {
    
    var num1 = 5 
    var num2 = 6
    var num3 = 7
    
    if(num1 >= num2 && num1 >= num3)
    	println("$num1 is largest number")
    else if(num2 >= num1 && num2 >= num3)
    	println("$num2 is largest number")
    else 
    	println("$num3 is largest number")
    when {
        num1 >= num2 && num1 >= num3 -> println("$num1 is largest number")
        num2 >= num1 && num2 >= num3 -> println("$num2 is largest number")
        else -> println("$num3 is largest number")
    }
    
}
