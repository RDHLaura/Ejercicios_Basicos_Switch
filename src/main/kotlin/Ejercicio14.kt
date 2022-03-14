fun main (args: Array<String>){
    println("Introduzca un número: ")
    var num=pedirNume()
    if (num%2==0){
        if (num%5==0){
            println("Es par y es divisible entre 5.")
        }
        else{
            println("Es par y no es divisible entre 5.")
        }

    }
}