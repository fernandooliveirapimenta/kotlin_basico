fun main(args: Array<String>) {

   //Array
   val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7);
   for (item in arr) {
      println(item)
   }

   println("\n")
   val intArr = intArrayOf(8);
   for (item in intArr) {
      println(item)
   }


   //Map
    val map =  mutableMapOf<Int, Any>()
    map.put(1, "Fernando")
    map[2] = "Felipe"

    map += 3 to "Luan"

    for (item in map) {
        println(item)
    }



}