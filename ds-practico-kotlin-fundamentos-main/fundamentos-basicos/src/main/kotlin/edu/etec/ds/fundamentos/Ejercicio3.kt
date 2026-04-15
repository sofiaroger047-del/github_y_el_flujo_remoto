package edu.etec.ds.fundamentos

fun saludar(): String {
    TODO("Retornar \"Hola, bienvenido!\"")
}

fun saludarConNombre(nombre: String): String {
    TODO("Retornar \"Hola, $nombre!\"")
}

fun saludarPersona(nombre: String, apellido: String): String {
    TODO("Retornar \"Hola, $nombre $apellido!\"")
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    TODO("Retornar \"Hola, $nombre!\"")
}

fun crearSaludo(titulo: String, nombre: String): String {
    TODO("Retornar \"Hola, $titulo $nombre\"")
}

fun funcionSinRetorno(): Unit {
    TODO("Esta funcion no retorna nada")
}

fun cuadrado(numero: Int): Int {
    TODO("Retornar el cuadrado del numero")
}

fun contarCaracteres(texto: String): Int {
    TODO("Contar caracteres del string")
}

fun String.cuentaCaracteres(): Int {
    TODO("Extension para contar caracteres de un String")
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    TODO("Funcion infix para comparar numeros")
}

fun sumarTodos(vararg numeros: Int): Int {
    TODO("Sumar todos los numeros pasados como varargs")
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    TODO("Aplicar una operacion lambda a dos numeros")
}
