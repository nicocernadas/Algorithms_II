package ar.edu.unsam.algo2

//    -- CONTROL FLOW --
//    If -
//    While / do - While
//
fun main() {
    val numero3 = 10
    when (numero3) {
        1 -> println("El numero3 es igual a 1!")
        //        "Hola" -> println("El numero3 es igual a 'Hola'!") <- error imcompatible types String and Int
        10 -> println("El numero3 es igual a 10!")
        // Caso default
        else -> println("Mmmm, no se me ocurre que puede ser")
    }
    //    Tambien lo podemos usar para setear objetos de esta forma:
    val objetoConst = "Sala 3"
    val camada = when (objetoConst) {
        "Sala 1" -> "Camada A" // Si objetoConst es Sala 1, entonces asigna a camada "Camada A"
        "Sala 2" -> "Camada B"
        "Sala 3" -> "Camada C"
        else -> "Unknown"
    }
    println(camada)

    //    Tambien se podria usar asi:
    val estadoSemaforo = "Rojo"
    val accion = when {
        estadoSemaforo == "Rojo" -> "FRENAR"
        estadoSemaforo == "Amarillo" -> "BAJAR LA VELOCIDAD / ARRANCAR"
        estadoSemaforo == "Verde" -> "AVANZAR"
        else -> "Roto"
    }
    println(accion)

    //    For es como un Python!
    val tortas = mutableListOf("Red Belveth", "Carrot Cake", "Oreo")
    for (torta in tortas) {
        println(torta)
    }

    //    Tambien lo podemos usar en rangos:
    var contador = 0
    for (numero in 1..5) {
        print(contador++) // Imprime los numeros del 1 al 5
    }
}