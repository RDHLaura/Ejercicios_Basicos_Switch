fun main(args:Array<String>){
    var lista= mutableListOf<Int>()
    for (x in 0..2){
        println("Introduzca un número: ")
        lista.add(pedirNume())
    }
    lista.sort()
    println(lista.toString())
}
fun pedirNume():Int{
    var num:Int
    while(true)
    {
        try{
            num= readln().toInt()
            break
        }catch (e:Exception){println("Introduzca un valor numerico. Ej: 10")}
    }
    return num
}
