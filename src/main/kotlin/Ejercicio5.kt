fun main(args: Array<String>){
    println("Para una ecuación de primer grado del tipo 'ax+b=c")
    println("Intoduzca el valor de 'a'")
    var a=comprobarNumero()
    println("Intoduzca el valor de 'b'")
    var b=comprobarNumero()
    println("Intoduzca el valor de 'c'")
    var c=comprobarNumero()
    ecuacion(a,b,c)
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
    return x}

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