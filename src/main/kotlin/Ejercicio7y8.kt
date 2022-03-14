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
        }while(opcion==null && opcion !in (1..3))
        when(opcion){
            1-> {
                var nota=-1.0
                while(nota<0){
                    println("Nota exámen: ")
                    nota=comprobarNumero()
                }
                notas.add(nota)
            }
            2->println("La media de los examenes: $notas es: ${calcularMedia(notas)}. ${imprimirNotaFinal(calcularMedia(notas))}")
            3->break
        }
    }
}
fun imprimirNotaFinal(media:Int):String{
    when (media){
        in 0..4 -> return "Suspenso"
        in 5..6 -> return "Aprobado"
        in 7..8 -> return "Notable"
        in 9..10 -> return "Sobresaliente"
        else -> return ""
    }
}


fun calcularMedia(notas:List<Double>):Int{
    return notas.average().roundToInt()
}