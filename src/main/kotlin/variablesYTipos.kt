package ar.edu.unsam.algo2
fun main(){

//    -- VARIABLES MUTABLES --
    var nombre = "Jorge"
    nombre = "Carlos"

//    -- VARIABLES INMUTABLES --
    val nombre2 = "Rodrigo"
//    nombre2 = "Mateo" <- error 'Val cannot be asigned'

//    -- STRING TEMPLATES --
//    Standar
    println("$nombre es un hombre serio")
    println("Si ${nombre2} tuviera alguna propiedad, la podriamos llamar dentro de las {}")

//    Kotlin es un lenguaje que tiene inferencia de tipos, y es a su vez fuertemente tipado.
//    Esto quiere decir que una vez que definimos una variable por ejemplo del tipo Int,
//    no le podemos asignar despues un booleano, por ejemplo. Siempre va a ser Int.

    var numero = 10 // Kotlin infiere que esto es un int
    var numero2: Int // Tambien podriamos hacer esto, y dejar la variable sin inicializar
                     // pero sabiendo que va a ser un int
//    numero2 = "Hola!" <- error "Type mismatch"

//    -- LISTAS, SETS Y MAPS --
//    -- LISTAS
    val listaInmutable = listOf(1, 2) // Esto es una lista inmutable (Kotlin infiere que es de Ints)
//    lista.add(1) <- este metodo directamente no existe
//    Ojo, no es lo mismo tener una variable inmutable que una lista inmutable, nosotros bien
//    podemos tener lo siguiente
    val lista = mutableListOf<Int>() // La variable es inmutable (va a apuntar siempre a esta lista), pero la lista
                                     // es mutable (Explicitamos que es de Ints), por lo que podemos hacer:
    lista.add(10)
    println("Numero en la posicion 0 de la lista: " + lista[0])
    lista.remove(10)
    println("Ahora quedo vacia devuelta: $lista")
//    Asi como podemos tener listas de Ints, tambien podemos tener de Strings, Booleanos, Doubles, Floats....

    val formas: MutableList<String> = mutableListOf("Rectangulo", "Triangulo", "Circulo")
    val formasLocked: List<String> = formas
    println("Forma en el index 2: ${formasLocked[2]}")
    println("Tamaño de la lista: ${formasLocked.size}")
    println("Primer item de la lista: ${formasLocked.first()}")
    println("La lista contiene 'Triangulo': ")
    println("Triangulo" in formasLocked)

//    -- SETS
//    A diferencia de las listas, los Sets no estan ordenados, y no admiten duplicados. Tambien los hay mutables e inmutables
    val set = setOf("Hola", "Jorge")
//    set.add("Mateo") <- no funciona
    val mutableSet = mutableSetOf("Ricardo", "Centurion")
    println("Set mutable: $mutableSet")
    mutableSet.add("Ricardo")
    println("Set mutable despues de agregar 'Ricardo': $mutableSet")
//    println("${set[0]}") <- error No get method provide array access

//    -- MAPS
//    Variables del tipo Key - Value
    val map = mapOf("Manzana" to 1, "Banana" to 2, "Naranja" to 3)
    val mutableMap: MutableMap<String, Int> = mutableMapOf("Manzana" to 1, "Banana" to 2)
    println("Valor de la manzana: ${map["Manzana"]}")
    mutableMap["Pera"] = 10 // <- Esto lo podemos hacer xq es mutable. Agrega el item al mapa
    mutableMap.remove("Pera") // <- Saca el item del mapa
    println("En el mapa existe la Key 'Manzana'?")
    println(mutableMap.containsKey("Manzana"))
    println("Todas las keys: ${mutableMap.keys}\n" + "Todos los values: ${mutableMap.values}")

//    -- CONTROL FLOW --
//    If - While no voy a explicar
//    When es como un switch
    val numero3 = 10
    when(numero3) {
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
    for (numero in 1..5) {
        print(numero) // Imprime los numeros del 1 al 5
    }















}
