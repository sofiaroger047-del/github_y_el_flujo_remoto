package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals

class Ejercicio3Test {

    @Test
    fun testFuncionSinParametros() {
        val resultado = saludar()
        assertEquals("Hola, bienvenido!", resultado)
    }

    @Test
    fun testFuncionConUnParametro() {
        val resultado = saludarConNombre("Ana")
        assertEquals("Hola, Ana!", resultado)
    }

    @Test
    fun testFuncionConDosParametros() {
        val resultado = saludarPersona("Juan", " García")
        assertEquals("Hola, Juan García!", resultado)
    }

    @Test
    fun testFuncionConParametrosDefault() {
        val resultado = saludarConDefault()
        assertEquals("Hola, Usuario!", resultado)
    }

    @Test
    fun testFuncionConParametrosDefaultPersonalizado() {
        val resultado = saludarConDefault("Pedro")
        assertEquals("Hola, Pedro!", resultado)
    }

    @Test
    fun testFuncionConParametrosNombrados() {
        val resultado = crearSaludo(nombre = "Lucía", titulo = "Dra.")
        assertEquals("Hola, Dra. Lucía", resultado)
    }

    @Test
    fun testFuncionUnit() {
        val resultado = funcionSinRetorno()
        assertEquals(Unit, resultado)
    }

    @Test
    fun testFuncionSingleExpression() {
        val resultado = cuadrado(5)
        assertEquals(25, resultado)
    }

    @Test
    fun testFuncionLambda() {
        val duplicar = { x: Int -> x * 2 }
        assertEquals(10, duplicar(5))
    }

    @Test
    fun testFuncionLambdaSumar() {
        val sumar = { a: Int, b: Int -> a + b }
        assertEquals(15, sumar(7, 8))
    }

    @Test
    fun testFuncionAnonima() {
        val resultado = aplicarOperacion(10, 20) { a, b -> a * b }
        assertEquals(200, resultado)
    }

    @Test
    fun testFuncionExtension() {
        val texto = "Kotlin"
        assertEquals(6, texto.cuentaCaracteres())
    }

    @Test
    fun testFuncionInfix() {
        val resultado = 5.esMayorQue(3)
        assertEquals(true, resultado)
    }

    @Test
    fun testFuncionVarargs() {
        val resultado = sumarTodos(1, 2, 3, 4, 5)
        assertEquals(15, resultado)
    }
}
