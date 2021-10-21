
fun main(args:Array<String>) {

    println("inserte su primer número")
    val numero1= readLine()!!.toInt()
    println("inserte su segundo número")
    val numero2= readLine()!!.toInt()

    var resultado=Numeros(numero1, numero2)
    print("el resultado es: ${resultado}")

}


fun Numeros(numero1:Int, numero2:Int):Int {
    if (numero1 != numero2) {
        val suma = 1 + Numeros(numero1 + 1, numero2)
        return suma

    } else {
        return 0
    }
}


