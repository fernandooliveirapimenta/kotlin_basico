package uri

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {
    print("Enter a num:")
    val peso: Double = readLine()!!.toDouble();
    val round: Double =  round(area(round(peso)),4);
    println("A=${String.format(Locale.US,"%.4f",round)} \n")
}

fun area(peso: Double) :Double{
    return (3.14159 * (peso * peso));
}

fun round(valor: Double, scala: Int = 2) :Double {
    return BigDecimal(valor).setScale(scala, RoundingMode.HALF_EVEN).toDouble();
}