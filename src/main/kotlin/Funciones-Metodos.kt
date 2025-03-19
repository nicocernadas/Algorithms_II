package ar.edu.unsam.algo2

class Perro {

    fun size(alto: Double = 0.0, ancho: Double = 0.0) {} // Funcion vacia para redefinir en instancias
    // Una funcion que no retorna nada importante, es un Unit
    // No hace falta setearlas, pero podemos, como hice aca |
    fun colorPelo(motas: String = "", pelo: String = ""): Unit = println("Tiene el pelo de color $pelo, y motas de color $motas")

}

fun main() {
//    Esto, es una funcion lambda
    val mayusString = { texto: String -> // Esto es un parametro
        texto.uppercase() // Aca iria el cuerpo de la funcion
    }
    println(mayusString("Hola! Soy un texto todo en mayusculas"))
    val mensajeError = { println("[Log] Codigo de error 1....")} // Si no tenemos parametros, el -> se omite

//    Lambdas como parametros
    val lista1 = mutableListOf(1, 2, 3, -4, -6, -8)
    println("""
        Numeros positivios: ${lista1.filter{ x: Int -> x > 0 }}
        Numeros negativos: ${lista1.filter{x: Int -> x < 0}}
    """.trimIndent())
//    Tambien podriamos definir las lambdas en una variable, y pasarle esa variable a filter
    val lambdaPositivos = {x: Int -> x > 0}
    println("Numeros positivos (lambda en variable): ${lista1.filter(lambdaPositivos)}")
//    Si queremos definir que recibe y que retorna una lambda, seria asi:
    val lambdaRandom: (Double) -> Int = {x -> x.toInt()}
//    Omitimos definir el tipo de dato antes del ->, y retornamos lo que dijimos, un Int.

//    Map() Nos devuelve una nueva lista, con la funcion que le pasemos aplicada
//    NO es una lista mutable
//    Si queremos mutabilidad, hay que agregar la funcion toMutableList()
    val lista2 = mutableListOf(1, 2, 3)
    val lista3 = lista2.map{x: Int -> x + 1}.toMutableList()
    lista3.add(1)
    println("$lista3")

//    Esta lambda, se invoca sola
    println({texto: String -> texto.uppercase()}("Que onda?")) // Se me ocurrio que estaba bueno para no guardar en variables, etc...

}