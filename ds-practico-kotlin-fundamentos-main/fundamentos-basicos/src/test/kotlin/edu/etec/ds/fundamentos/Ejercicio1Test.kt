package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class Ejercicio1Test {

    @Test
    fun testSumaDosEnteros() {
        val resultado = suma(5, 3)
        assertEquals(8, resultado)
    }

    @Test
    fun testSumaConNegativos() {
        val resultado = suma(-10, -5)
        assertEquals(-15, resultado)
    }

    @Test
    fun testRestaDosEnteros() {
        val resultado = resta(10, 4)
        assertEquals(6, resultado)
    }

    @Test
    fun testMultiplicacionDosEnteros() {
        val resultado = multiplicacion(6, 7)
        assertEquals(42, resultado)
    }

    @Test
    fun testDivisionDosEnteros() {
        val resultado = division(20, 4)
        assertEquals(5, resultado)
    }

    @Test
    fun testDivisionEntera() {
        val resultado = division(7, 2)
        assertEquals(3, resultado)
    }

    @Test
    fun testModulo() {
        val resultado = modulo(10, 3)
        assertEquals(1, resultado)
    }

    @Test
    fun testCompararMayorQue() {
        assertTrue(esMayorQue(10, 5))
        assertFalse(esMayorQue(3, 7))
    }

    @Test
    fun testCompararMenorQue() {
        assertTrue(esMenorQue(3, 7))
        assertFalse(esMenorQue(10, 5))
    }

    @Test
    fun testCompararIguales() {
        assertTrue(sonIguales(5, 5))
        assertFalse(sonIguales(5, 3))
    }

    @Test
    fun testVerificarPar() {
        assertTrue(esPar(4))
        assertFalse(esPar(7))
    }

    @Test
    fun testVerificarImpar() {
        assertTrue(esImpar(7))
        assertFalse(esImpar(4))
    }

    @Test
    fun testValorAbsoluto() {
        assertEquals(5, valorAbsoluto(-5))
        assertEquals(5, valorAbsoluto(5))
        assertEquals(0, valorAbsoluto(0))
    }

    @Test
    fun testMaximoEntreDos() {
        assertEquals(10, maximo(10, 5))
        assertEquals(10, maximo(5, 10))
    }

    @Test
    fun testMinimoEntreDos() {
        assertEquals(5, minimo(10, 5))
        assertEquals(5, minimo(5, 10))
    }
}
