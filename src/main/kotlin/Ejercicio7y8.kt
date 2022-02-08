import kotlin.math.roundToInt

fun main(args: Array<String>){
    var notas= mutableListOf<Double>()
    var menu="Calcula tu media.\n \n" +
            "Introduza el número de la opción elegida:\n" +
            "1. Introducir una nota\n" +
            "2. Calcular la media de las notas introducidas\n" +
            "3. Cerrar el programa"

    while (true){
        println(menu)
        var opcion:Int?=0
        do {
            opcion = readLine()?.toIntOrNull()
        }while(opcion==null)
        when(opcion){
            1-> {
                var nota=-1.0
                while(nota<0){
                    println("Nota exámen: ")
                    nota=comprobarNumero()
                }
                notas.add(nota)
            }
            2->println("La media de los examenes: $notas es: ${calcularMedia(notas)}.")
            3->break
        }
    }
}
fun imprimirNotaFinal(media:Int){
    when (media){
        in 0..4 -> println("Suspenso")
        in 5..6 -> println("Aprobado")
        in 7..8 -> println("Notable")
        in 9..10 -> println("Sobresaliente")
    }
}


fun calcularMedia(notas:List<Double>):Int{
    return notas.average().roundToInt()
}