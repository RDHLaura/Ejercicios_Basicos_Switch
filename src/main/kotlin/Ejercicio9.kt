//TODO Hacer el ejercicio 9, reusar el 5

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
fun ecuacion2grado(a:Double,b:Double, c:Double):Double{
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

//fun comprobarNumero() del ejercicio 5
