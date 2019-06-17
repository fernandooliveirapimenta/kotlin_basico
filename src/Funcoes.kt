
fun main(args: Array<String>) {
   firstFunction()
   println(secondFunctio())
   println(comParametros("dskglksdjglksjl"))

   val list = listOf<Int>(1, 5, 7, 9 ,10)
    val graterThan6 = list.count { n -> n > 6}
    println(graterThan6)
}

//void = vazio
fun firstFunction() {
   println("Hello World")
}

fun secondFunctio() : String {
   return "Hello World";
}

fun comParametros(str: String) : String {
   return "Hello : $str";
}