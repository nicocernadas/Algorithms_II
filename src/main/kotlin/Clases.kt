package ar.edu.unsam.algo2

class Alumno(
    id: Int = 0,
    val edificio: Char = 'A'
) {
    // Cuerpo de la clase
}

data class User(
    var username: String = "",
    var password: String = ""
){
    fun echoThis() = println(this)
}

fun main() {
    val alumno1 = Alumno(id = 1503, edificio = 'B')
//    println(alumno1.id) <- Esto no va a funcionar. Las propiedades creadas sin var o val en el header
//    de la clase, no estan disponibles despues de crear la instancia.
    println("Edificio del alumno 1: " + alumno1.edificio)

//    Las clases de tipo data, sirven para guardar informacion. Vienen con metodos predefinidos para mostrar, comparar
//    y copiar la infomacion a otras instancias, etc...Y no las tenemos que crear nosotros. Por ejemplo
    val usuario1 = User("jorgitocarlos", "contra123@")
    val usuario2 = User("abrahammateo", "estoesunacontra")
    println("println de la clase data: \n" + usuario1) // Esto ya viene integrado con la funcion .toString(), por ser de la clase data
    println("println de una clase normal: \n" + alumno1)
    var usuario3 = usuario1.copy() // Copia los datos iguales
    usuario3 = usuario2.copy(username = "robertocarlos") // Copia los datos iguales menos username que lo redefinimos
    var usuario4 = usuario1.copy()
    print("Por mas que haga un copy, no son el mismo objeto: usuario4 === usuario1 = ")
    println(usuario4 === usuario1)
}