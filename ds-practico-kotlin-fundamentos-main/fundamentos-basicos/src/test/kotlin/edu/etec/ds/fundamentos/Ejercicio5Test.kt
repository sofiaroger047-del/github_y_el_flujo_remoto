package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class Ejercicio5Test {

    @Test
    fun testSumarHastaN() {
        val resultado = sumarHasta(5)
        assertEquals(15, resultado)
    }

    @Test
    fun testSumarHastaCero() {
        val resultado = sumarHasta(0)
        assertEquals(0, resultado)
    }

    @Test
    fun testSumarHastaUno() {
        val resultado = sumarHasta(1)
        assertEquals(1, resultado)
    }

    @Test
    fun testContarParesHasta10() {
        val resultado = contarPares(1, 10)
        assertEquals(5, resultado)
    }

    @Test
    fun testContarParesRangoVacio() {
        val resultado = contarPares(1, 2)
        assertEquals(1, resultado)
    }

    @Test
    fun testFibonacci5() {
        val resultado = fibonacci(5)
        assertEquals(5, resultado)
    }

    @Test
    fun testFibonacci10() {
        val resultado = fibonacci(10)
        assertEquals(55, resultado)
    }

    @Test
    fun testFactorial5() {
        val resultado = factorial(5)
        assertEquals(120, resultado)
    }

    @Test
    fun testFactorial0() {
        val resultado = factorial(0)
        assertEquals(1, resultado)
    }

    @Test
    fun testFactorial1() {
        val resultado = factorial(1)
        assertEquals(1, resultado)
    }

    @Test
    fun testEncontrarMaximo() {
        val numeros = listOf(3, 7, 2, 9, 1, 5)
        val resultado = encontrarMaximo(numeros)
        assertEquals(9, resultado)
    }

    @Test
    fun testEncontrarMinimo() {
        val numeros = listOf(3, 7, 2, 9, 1, 5)
        val resultado = encontrarMinimo(numeros)
        assertEquals(1, resultado)
    }

    @Test
    fun testSumarElementosLista() {
        val numeros = listOf(1, 2, 3, 4, 5)
        val resultado = sumarLista(numeros)
        assertEquals(15, resultado)
    }

    @Test
    fun testInvertirCadena() {
        val resultado = inverter("Kotlin")
        assertEquals("niltoK", resultado)
    }

    @Test
    fun testContarVocales() {
        val resultado = contarVocales("Universidad")
        assertEquals(6, resultado)
    }

    @Test
    fun testEsPalindromo() {
        assertTrue(esPalindromo("radar"))
        assertTrue(esPalindromo("anita lava la tina"))
        assertFalse(esPalindromo("hola"))
    }

    @Test
    fun testTablaMultiplicar() {
        val resultado = tablaMultiplicar(5)
        assertEquals(listOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50), resultado)
    }
}
