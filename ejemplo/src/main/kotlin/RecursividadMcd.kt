fun main(args: Array<String>) {

    println("inserte el primer número")
    var num1= readLine()!!.toInt()
    println("inserte el segundo número")
    var num2= readLine()!!.toInt()

print("su máximo común multiplo es de : ${Mcd(num1, num2)}")


}

fun Mcd(numero1: Int, numero2: Int):Int{
    var a=numero1
    var b=numero2
    var resultado=0

    if(b==0){
       return a
    }
    else{
        resultado=Mcd(numero2,numero1%numero2)
        return resultado
    }
}
