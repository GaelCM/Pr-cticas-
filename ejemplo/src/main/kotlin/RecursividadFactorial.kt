import jdk.internal.util.xml.impl.Input

fun main(args: Array<String>) {

    println("Ingrese el número del factorial que quiere saber")
    val numero= readLine()!!.toInt()

    println("el factorial de ${Ciclo(numero)}")

}

fun Factorial(numero: Int):Int{
    if(numero<=1){
        return 1
    }
    else{
        val resultado=numero*Factorial(numero-1)
        return resultado
    }

}


fun Ciclo(numero1: Int):Int{
    var numero=numero1

   var resultado:Int
    var final=0

    while(numero>1){

        resultado=numero*numero-1
        numero--
        return resultado
    }
    resultado=1

    return  resultado

}
