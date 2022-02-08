import javax.swing.JOptionPane

fun main(args:Array<String>) {
    val opciones= arrayOf<String>("12h", "24h")
    var opcion=JOptionPane.showOptionDialog(null, "Elige sistema horario: ",
        "Tiempo que falta para la media noche.",JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0])
    when(opcion){
        0->{
            val man_tar= arrayOf("am", "pm")
            var opcion=JOptionPane.showOptionDialog(null, "Mañana o tarde: ",
                "Tiempo que falta para la media noche.",JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,man_tar,man_tar[0])
            when(opcion){
                0-> {
                    JOptionPane.showMessageDialog(null,"Quedan ${calcularsegundos(pedirHora())} hasta la media noche.")
                }
                1-> {
                    var horas= pedirHora()
                    horas[0]+=12
                    JOptionPane.showMessageDialog(null,"Quedan ${calcularsegundos(horas)} hasta la media noche.")
                }
            }
        }
        1->{
            JOptionPane.showMessageDialog(null,"Quedan ${calcularsegundos(pedirHora())} hasta la media noche.")
        }
    }

}
fun pedirHora():MutableList<Int>{
    var listaHora= mutableListOf<Int>()
    var num_hora:Int?
    var num_min:Int?
    do {
        var horaCompleta = JOptionPane.showInputDialog(null, "Indica la hora con el formato hh-mm:")
        var hora=horaCompleta.slice(0..(horaCompleta.indexOf('-')-1))
        num_hora=hora.toIntOrNull()
        var min=horaCompleta.slice((horaCompleta.indexOf('-')+1)..horaCompleta.length-1)
        num_min=min.toIntOrNull()

    }while(num_hora==null || num_min==null || num_min>59 || num_hora>24)
    listaHora.add(num_hora)
    listaHora.add(num_min)
    return listaHora

}

fun calcularsegundos(hora:List<Int>):Int{
    //un dia son 86400 segundos
    var minutosRestantes=60 - hora[1]
    var horasRestantes= 24-(hora[0]+1)
    minutosRestantes+= horasRestantes*60
    var segundos=minutosRestantes*60
    return segundos
}