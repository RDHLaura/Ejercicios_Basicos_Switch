import javax.swing.JOptionPane

fun main(args: Array<String>) {
    ejercicio2()

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

fun comprobarNumero():Double{
    var numero:Double?
    do{
        numero= readln().toDoubleOrNull()
        if(numero==null)
            println("Debe introducir un número")
    }
    while(numero==null)
    return numero
}
fun ejercicio1(){
    //elección día semana
    var diaSemana:Array<String> = arrayOf("Lunes","Martes", "Miercoles", "Jueves","Viernes")
    var eleccion= JOptionPane.showOptionDialog(null, "Horario semanal:",
        "Horario: ",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, diaSemana, diaSemana[1])
    when(eleccion){
        0 -> JOptionPane.showMessageDialog(null, "FOL")
        1 -> JOptionPane.showMessageDialog(null, "Sistemas Informáticos")
        2 -> JOptionPane.showMessageDialog(null, "Entornos de Desarrollo")
        3 -> JOptionPane.showMessageDialog(null, "LMSGI")
        4 -> JOptionPane.showMessageDialog(null, "Sistemas Informáticos")
    }
}

fun ejercicio2(){
    println("Escribe la hora sin los minutos: ")
    var hora=pedirNum()

    when (hora)
    {
        6,7,8,9,10,11,12 -> println("¡Buenos días!")
        13,14,15,16,17,18,19,20 -> println("¡Buenas tardes!")
        21,22,23,24,0,1,2,3,4,5 -> println("¡Buenas noches!")

    }
}

fun ejercicio3(){
    println("Escribe un número del 1 al 7: ")
    var dia= pedirNum() //uso la función del Ejercicio2
    while (dia !in 1..7){
        println("Escribe un número del 1 al 7: ")
        dia=pedirNum()
    }
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

fun ejercicio4(){

    fun imprimirSalario(normal:Int, extra:Int){
        println("Tu salario esta semana es: ${(normal*12)+(extra*16)}")
    }
    fun checkHoras(dato:String):Int{
        var horas:Int?
        do{
            horas=dato.toIntOrNull()
            if(dato==null || dato.toInt()<0)
                println("Debe introducir un número válido")
        } while(dato==null)
        return horas!!
    }

    println("Indique las horas trabajadas este semana: ")
    var horas= checkHoras(readln())
    var extras=0
    if(horas>40){
        extras=horas-40
        horas=40
    }
    imprimirSalario(horas, extras)
}


fun ecuacion(a:Double,b:Double, c:Double):Double{
    var x:Double =0.0
    if (a==0.0)
    {
        println("No es posible resolver la ecuación con esos valores.")
    }else
    {
        x=((-b+c)/a)
        println("${a}x+${b}=0\nx=${x}")
    }
    return x
}
fun ejercicio5(){


    println("Para una ecuación de primer grado del tipo 'ax+b=c")
    println("Intoduzca el valor de 'a'")
    var a=comprobarNumero()
    println("Intoduzca el valor de 'b'")
    var b=comprobarNumero()
    println("Intoduzca el valor de 'c'")
    var c=comprobarNumero()
    ecuacion(a,b,c)
}
