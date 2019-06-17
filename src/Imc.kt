fun main(args: Array<String>) {

    print("Peso :")
    val peso: Double = readLine()!!.toDouble();

    print("Altura :")
    val altura: Double = readLine()!!.toDouble();


    println("IMC = ${peso / (altura * altura)}")

}