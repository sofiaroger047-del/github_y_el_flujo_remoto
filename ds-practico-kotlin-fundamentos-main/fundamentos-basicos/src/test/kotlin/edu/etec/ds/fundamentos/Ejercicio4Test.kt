package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals

class Ejercicio4Test {

    @Test
    fun testCondicionalSimple() {
        val resultado = evaluarPositivo(5)
        assertEquals("Positivo", resultado)
    }

    @Test
    fun testCondicionalNegativo() {
        val resultado = evaluarPositivo(-3)
        assertEquals("No positivo", resultado)
    }

    @Test
    fun testCondicionalCero() {
        val resultado = evaluarPositivo(0)
        assertEquals("No positivo", resultado)
    }

    @Test
    fun testCondicionalIfElse() {
        val resultado = clasificarNumero(15)
        assertEquals("Mayor a 10", resultado)
    }

    @Test
    fun testCondicionalIfElseMenor() {
        val resultado = clasificarNumero(5)
        assertEquals("Menor a 10", resultado)
    }

    @Test
    fun testCondicionalIfElseIgual() {
        val resultado = clasificarNumero(10)
        assertEquals("Igual a 10", resultado)
    }

    @Test
    fun testCondicionalAnidado() {
        val resultado = evaluarEdad(25)
        assertEquals("Adulto", resultado)
    }

    @Test
    fun testCondicionalAnidadoMenor() {
        val resultado = evaluarEdad(15)
        assertEquals("Menor de edad", resultado)
    }

    @Test
    fun testCondicionalAnidadoMayor() {
        val resultado = evaluarEdad(70)
        assertEquals("Adulto mayor", resultado)
    }

    @Test
    fun testExpresionIf() {
        val resultado = obtenerDescuento(150.0)
        assertEquals(20.0, resultado)
    }

    @Test
    fun testExpresionIfSinDescuento() {
        val resultado = obtenerDescuento(50.0)
        assertEquals(0.0, resultado)
    }

    @Test
    fun testExpresionIfMayor() {
        val resultado = obtenerDescuento(200.0)
        assertEquals(30.0, resultado)
    }

    @Test
    fun testCalculadoraSimple() {
        assertEquals(8.0, calcular('+', 3, 5))
        assertEquals(-2.0, calcular('-', 3, 5))
        assertEquals(15.0, calcular('*', 3, 5))
        assertEquals(2.0, calcular('/', 10, 5))
    }

    @Test
    fun testCalculadoraDivisionCero() {
        val resultado = calcular('/', 10, 0)
        assertEquals(0.0, resultado)
    }

    @Test
    fun testCalculadoraOperadorInvalido() {
        val resultado = calcular('%', 10, 5)
        assertEquals(0.0, resultado)
    }
}
