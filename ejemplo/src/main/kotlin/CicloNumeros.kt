fun main(args:Array<String>) {

print("es: ${cicloNumeros(1,100)}")



}

fun cicloNumeros(num1:Int,num2:Int):Int{
    var numero1=num1
    var numero2=num2
    var resultado=0


        while (numero1<numero2) {
            resultado = resultado+1
            numero1++

        }
    return resultado
}


