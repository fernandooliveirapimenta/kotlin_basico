fun main(args: Array<String>) {
   val num1: Double
   val num2: Double

   print("Enter number 1: ")
   num1 = readLine()!!.toDouble()

   print("Enter number 2: ")
   num2 = readLine()!!.toDouble()

   print("What you need? (+, -, *, /) ")
   val op: String = readLine()!!

   var result = 0.0;
   when(op) {
      "+" -> result = num1 + num2
      "-" -> result = num1 - num2
      "*" -> result = num1 * num2
      "/" -> result = num1 / num2
   }

   println("$num1 $op $num2 = $result")
}