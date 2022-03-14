fun main (args: Array<String>){
    var preguntas= mapOf <Int, Char>(1 to 'c',2 to 'b',3 to 'b',4 to 'a',5 to 'c',
        6 to 'a',7 to 'c',8 to 'a',9 to 'a',10 to 'b')

    println("Cuestionario DAW")
    //TODO hacer este ejercicio
    var puntuacion=0
    var pregunta=1
    while(pregunta<11){
        println(imprimirPregunta(pregunta))
        var respuesta:Char
        do{
            respuesta= readln().toCharArray()[0]
        }while (respuesta !in listOf('a','b','c'))

        if(preguntas[pregunta]==respuesta){
            puntuacion++
            println("¡Correcto!\n\n")
        }else{
            println("La respuesta correcta es ${preguntas[pregunta]}\n\n")

        }
        pregunta++

    }
    println("Tu puntuación es de $puntuacion.")
}

fun imprimirPregunta(pregunta:Int):String{
    when(pregunta){
        1->return "Conjunto prescrito de instrucciones o reglas bien definidas, ordenadas y finitas que permite realizar una actividad mediante pasos sucesivos que no generen dudas a quien deba realizar dicha actividad.\n\n" +
                "a. Ciclos\nb. Estructuras\nc. Algoritmo"
        2->return "Mezcla de lenguaje natural con algunas convenciones sintácticas propias de lenguajes de programación\n\n" +
                "a. Diagramas de flujo\nb. Pseudocódigo\nc. Variables"
        3->return "Proceso de diseñar, codificar, depurar y mantener el código fuente de programas computacionales.\n\n" +
                "a. Compilación\nb. Programación\nc. Hardware"
        4->return "Conjunto de líneas de texto que son las instrucciones que debe seguir la computadora para ejecutar dicho programa.\n\n" +
                "a. Código fuente\nb. Programador\nc. Informática"
        5->return "Lenguaje formal diseñado para expresar procesos que pueden ser llevados a cabo por máquinas como las computadoras.\n\n" +
                "a. Variables\nb. Storyboard\nc. Lenguaje de programación"

        6->return "Son descripciones gráficas de algoritmos; usan símbolos conectados con flechas para indicar la secuencia de instrucciones y están regidos por ISO\n\n" +
                "a. Diagramas de flujo\nb. Storyboard\nc. Pseudocódigo"
        7->return "¿Que es programar?\n\n" +
                "a. Resolver problemas\nb. Ejecutar un problema de logica\nc. Darle ordenes y comandos ala computadora"
        8->return "La forma en que establece comunicación e intercambia mensajes \n\n" +
                "a. Sus atributos y sus métodos\nb. La forma en que establece comunicación e intercambia mensajes \nc. Su interfaz y los eventos asociados"

        9->return "¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?\n\n" +
                "a. Es un modelo o plantilla a partir de la cual creamos objetos\nb. Es una categoria de datos ordenada secuencialmente\nc. Es un tipo particular de variable"
        10->return "¿Qué significa instanciar una clase?\n\n" +
                "a. Conectar dos clases entre sí\nb. Crear un objeto a partir de la clase\nc. Duplicar una clase"

        else -> return ""
    }
}

