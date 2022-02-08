import javax.swing.JOptionPane

fun main(args: Array<String>){
    val tipohoras= arrayOf("Jornada laboral completa(<40h)","Media jornada(20h)", "Otro")
    JOptionPane.showMessageDialog(null, "Calcula tu salario. ")
    var eleccion=JOptionPane.showOptionDialog(null, "Elige tu jornada laboral: ",
        "Jornada labora.",JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE, null,tipohoras,tipohoras[0] )

    when(eleccion){
        0 -> {
            var extra=JOptionPane.showInputDialog(null, "Horas extras.")
            var h_extra=checkHoras(extra)
            imprimirSalario(40,h_extra)
        }
        1 -> {
            var extra=JOptionPane.showInputDialog(null, "Horas extras.")
            var h_extra=checkHoras(extra)
            imprimirSalario(20,h_extra)
        }
        2 ->{
            var horas=JOptionPane.showInputDialog(null, "Horas por contrato.")
            var h_jornada=checkHoras(horas)
            var extra=JOptionPane.showInputDialog(null, "Horas extras.")
            var h_extra=checkHoras(extra)
            imprimirSalario(h_jornada,h_extra)
        }
    }
}

fun imprimirSalario(normal:Int, extra:Int){
    JOptionPane.showMessageDialog(null, "Tu salario esta semana es: ${(normal*12)+(extra*16)}")
}
fun checkHoras(dato:String):Int{
    var horas:Int?
    do{
        //horas=JOptionPane.showInputDialog("Número de horas:").toIntOrNull()
        horas=dato.toIntOrNull()
        if(dato==null || dato.toInt()<0)
            JOptionPane.showMessageDialog(null,"Debe introducir un número válido")
    } while(dato==null)
    return horas!!
}