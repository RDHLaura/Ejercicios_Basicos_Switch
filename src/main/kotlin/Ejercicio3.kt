fun main(args: Array<String>){
    println("Escribe un número del 1 al 7: ")
    var dia= pedirNum() //uso la función del Ejercicio2
    while (dia !in 1..7){
        println("Escribe un número del 1 al 7: ")
        dia=pedirNum()
    }
    diaSemana(dia)

}

fun diaSemana(dia:Int){
    when(dia)
    {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
    }
}