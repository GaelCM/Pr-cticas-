fun main(args: Array <String>) {

    println("inserte la posición que quieres saber el número en la serie de fibonacci")
    val numero= readLine()!!.toInt()

    print("La el resultado es ${Fibonacci(numero)}")
}

fun Fibonacci ( numero:Int):Int {

    if(numero<=1){
        return 1
    }
    else{
        return Fibonacci(numero-1) + Fibonacci(numero-2)
    }
}

