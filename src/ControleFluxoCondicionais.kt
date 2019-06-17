fun main(args: Array<String>) {

   //IF
   val num1: Int = 100;
   val num2: Int = 200;

   if(num1 < num2) {
     println("n1 < n2")
   } else {
      println("n1 > n2")
   }

   val max: Int = if(num1 > num2) num2 else num1
   println(max);


   val block: Double = if(num1 > num2){
       50.0
       60.0
   } else {
      60.0
      80.0
   }
   println(block)
   //END IF

   //Dentro do kotlin não existe o switch
   
   //WHEN
   when(num1) {
      1 -> println("1")
      10 -> println("10")
      1000 -> println("100")
      else -> println("Nenhum")
   }

}