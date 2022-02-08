fun main (args: Array<String>){
    /*horoscopos
Aries	21 de marzo – 20 de abril
Tauro	21 de abril – 21 de mayo
Géminis	22 de mayo – 21 de junio
Cáncer	22 de junio – 22 de julio
Leo	23 de julio – 22 de agosto
Virgo	23 de agosto – 22 de septiembre
Libra	23 de septiembre – 22 de octubre
Escorpio	23 de octubre – 22 de noviembre
Sagitario	23 de noviembre – 21 de diciembre
Capricornio	22 de diciembre – 20 de enero
Acuario	21 de enero – 18 de febrero
Piscis	19 de febrero – 20 de marzo
     */

    println("Indica tu día de nacimiento: ")
    var dia:Int
    do {
        dia = checkInt()
    }while (dia>31)
    println("Indica tu mes de nacimiento: ")
    var mes:Int
    do {
        mes = checkInt()
    }while(mes>12)
    var horoscopo= tusigno(dia, mes)
    println("Tu horóscopo es: $horoscopo")


}


fun checkInt():Int{
    var numero:Int?=0
    do {
        numero = readLine()?.toIntOrNull()
    }while(numero==null || numero<1)
    return numero
}


fun tusigno(dia:Int, mes:Int):String{
    var signo="signo"
    when (mes){
        1-> {
            if(dia in 1..20)
                signo="Capricoprnio"
            else
                signo="Acuario"
        }
        2->{
            if(dia in 1..18)
                signo="Acuario"
            else
                signo="Piscis"
        }
        3->{
            if(dia in 1..20)
                signo="Piscis"
            else
                signo="Aries"
        }
        4->{
            if(dia in 1..20)
                signo="Aries"
            else
                signo="Tauro"
        }
        5->{
            if(dia in 1..21)
                signo="Tauro"
            else
                signo="Géminis"
        }
        6->{
            if(dia in 1..20)
                signo="Géminis"
            else
                signo="Cáncer"
        }
        7->{
            if(dia in 1..22)
                signo="Cáncer"
            else
                signo="Leo"
        }
        8->{
            if(dia in 1..22)
                signo="Leo"
            else
                signo="Virgo"
        }
        9->{
            if(dia in 1..22)
                signo="Virgo"
            else
                signo="Libra"
        }
        10->{
            if(dia in 1..22)
                signo="Libra"
            else
                signo="Escorpio"
        }
        11->{
            if(dia in 1..23)
                signo="Escorpio"
            else
                signo="Sagitario"
        }
        12->{
            if(dia in 1..21)
                signo="Sagitario"
            else
                signo="Capricornio"
        }
    }
    return signo
}