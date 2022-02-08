fun main(args: Array<String>) {
    println("Escribe la hora sin los minutos: ")
    var hora=pedirNum()
    saludo(hora)


}
fun saludo(hora:Int){

    when (hora)
    {
        6,7,8,9,10,11,12 -> println("¡Buenos días!")
        13,14,15,16,17,18,19,20 -> println("¡Buenas tardes!")
        21,22,23,24,0,1,2,3,4,5 -> println("¡Buenas noches!")

    }
}

fun pedirNum():Int{
    var hora:Int
    while(true)
    {
        try{
            hora= readln().toInt()
            break
        }catch (e:Exception){println("Introduzca una hora válida. Ejemplo. si son las 6 de la tarde: 18")}
    }
    return hora
}