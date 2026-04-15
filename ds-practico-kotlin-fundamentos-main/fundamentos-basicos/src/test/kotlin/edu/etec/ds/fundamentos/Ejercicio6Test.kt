package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class Ejercicio6Test {

    @Test
    fun testWhenDiaSemana1() {
        val resultado = obtenerDiaSemana(1)
        assertEquals("Lunes", resultado)
    }

    @Test
    fun testWhenDiaSemana7() {
        val resultado = obtenerDiaSemana(7)
        assertEquals("Domingo", resultado)
    }

    @Test
    fun testWhenDiaInvalido() {
        val resultado = obtenerDiaSemana(0)
        assertEquals("Dia invalido", resultado)
    }

    @Test
    fun testWhenDiaInvalidoMayor() {
        val resultado = obtenerDiaSemana(10)
        assertEquals("Dia invalido", resultado)
    }

    @Test
    fun testWhenMesNombre() {
        val resultado = obtenerNombreMes(3)
        assertEquals("Marzo", resultado)
    }

    @Test
    fun testWhenMesInvalido() {
        val resultado = obtenerNombreMes(13)
        assertEquals("Mes invalido", resultado)
    }

    @Test
    fun testWhenClasificarNumero() {
        assertEquals("Positivo", clasificarNumeroWhen(5))
        assertEquals("Negativo", clasificarNumeroWhen(-3))
        assertEquals("Cero", clasificarNumeroWhen(0))
    }

    @Test
    fun testWhenClasificarEdad() {
        assertEquals("Bebe", clasificarEdad(2))
        assertEquals("Nino", clasificarEdad(8))
        assertEquals("Adolescente", clasificarEdad(15))
        assertEquals("Adulto", clasificarEdad(30))
        assertEquals("Anciano", clasificarEdad(70))
    }

    @Test
    fun testWhenConvertirMoneda() {
        assertEquals(18.5, convertirMoneda("USD", 10.0), 0.01)
        assertEquals(180.0, convertirMoneda("EUR", 10.0), 0.01)
        assertEquals(1.0, convertirMoneda("JPY", 10.0), 0.01)
        assertEquals(0.0, convertirMoneda("GBP", 10.0), 0.01)
    }

    @Test
    fun testWhenOperacion() {
        assertEquals(8.0, realizarOperacion('+', 3, 5))
        assertEquals(-2.0, realizarOperacion('-', 3, 5))
        assertEquals(15.0, realizarOperacion('*', 3, 5))
        assertEquals(2.0, realizarOperacion('/', 10, 5))
        assertEquals(0.0, realizarOperacion('%', 10, 5))
    }

    @Test
    fun testWhenExpresion() {
        val resultado = obtenerDescuentoWhen(150.0)
        assertEquals(15.0, resultado)
    }

    @Test
    fun testWhenExpresionSinDescuento() {
        val resultado = obtenerDescuentoWhen(50.0)
        assertEquals(0.0, resultado)
    }

    @Test
    fun testWhenExpresionMayor() {
        val resultado = obtenerDescuentoWhen(250.0)
        assertEquals(37.5, resultado)
    }

    @Test
    fun testWhenRango() {
        assertEquals("Aprobado", obtenerCalificacion(75))
        assertEquals("Desaprobado", obtenerCalificacion(59))
        assertEquals("Promocionado", obtenerCalificacion(90))
    }

    @Test
    fun testWhenMultipleCondiciones() {
        assertTrue(esVocal('a'))
        assertTrue(esVocal('E'))
        assertFalse(esVocal('b'))
        assertFalse(esVocal('z'))
    }

    @Test
    fun testWhenEsPrimo() {
        assertTrue(esPrimo(2))
        assertTrue(esPrimo(3))
        assertTrue(esPrimo(5))
        assertTrue(esPrimo(7))
        assertFalse(esPrimo(4))
        assertFalse(esPrimo(9))
        assertFalse(esPrimo(1))
    }
}
