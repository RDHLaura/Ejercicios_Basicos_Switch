fun main(args: Array<String>){
    println("Indique la altura desde la que cae el objeto: ")
    var altura=comprobarNumero()// uso la misma función que la del ejercicio 5

    while(altura<=0) {
        println("No es posible un valor negativo o 0 para que haya caída. Indique otra cifra: ")
        altura=comprobarNumero()
    }
    println("${calcularCaida(altura)} segundos.")
}
fun calcularCaida(altura:Double):Double{
    var caida=Math.sqrt((2*altura)/9.81)
    return Math.round(caida*100)/100.00
}

