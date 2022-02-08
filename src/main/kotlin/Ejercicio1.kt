import javax.swing.JOptionPane

fun main(args: Array<String>) {
    //elección día semana
    var diaSemana:Array<String> = arrayOf("Lunes","Martes", "Miercoles", "Jueves","Viernes")
    var eleccion= JOptionPane.showOptionDialog(null, "Día de la semana:",
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

