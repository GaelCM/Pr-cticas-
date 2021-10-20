import jdk.internal.util.xml.impl.Input

fun main(args: Array<String>) {

    println("Ingrese el número del factorial que quiere saber")
    val numero= readLine()!!.toInt()

    println("el factorial de $numero es ${Factorial(numero)}")

}

fun Factorial(numero: Int):Int{
    if(numero<=1){
        return 1;
    }
    else{
        val resultado=numero*Factorial(numero-1)
        return resultado;

    }

}
