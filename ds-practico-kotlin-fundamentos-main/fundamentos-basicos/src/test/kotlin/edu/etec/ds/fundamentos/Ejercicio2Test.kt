package edu.etec.ds.fundamentos

import kotlin.test.Test
import kotlin.test.assertEquals

class Ejercicio2Test {

    @Test
    fun testInferenciaEntero() {
        val resultado = obtenerTipoEntero()
        assertEquals("Int", resultado)
    }

    @Test
    fun testInferenciaDouble() {
        val resultado = obtenerTipoDouble()
        assertEquals("Double", resultado)
    }

    @Test
    fun testInferenciaBoolean() {
        val resultado = obtenerTipoBoolean()
        assertEquals("Boolean", resultado)
    }

    @Test
    fun testInferenciaString() {
        val resultado = obtenerTipoString()
        assertEquals("String", resultado)
    }

    @Test
    fun testInferenciaChar() {
        val resultado = obtenerTipoChar()
        assertEquals("Char", resultado)
    }

    @Test
    fun testInferenciaLista() {
        val resultado = obtenerTipoLista()
        assertEquals("List", resultado)
    }

    @Test
    fun testInferenciaMap() {
        val resultado = obtenerTipoMap()
        assertEquals("Map", resultado)
    }

    @Test
    fun testInferenciaArray() {
        val resultado = obtenerTipoArray()
        assertEquals("Array", resultado)
    }

    @Test
    fun testInferenciaTipoNulo() {
        val resultado = obtenerTipoNulo()
        assertEquals("Null", resultado)
    }

    @Test
    fun testInferenciaTipoNullable() {
        val resultado = obtenerTipoNullable()
        assertEquals("Nullable", resultado)
    }

    @Test
    fun testInferenciaTipoUnit() {
        val resultado = obtenerTipoUnit()
        assertEquals("Unit", resultado)
    }

    @Test
    fun testInferenciaTipoNothing() {
        val resultado = obtenerTipoNothing()
        assertEquals("Nothing", resultado)
    }

    @Test
    fun testInferenciaExplicita() {
        val numero: Int = 42
        assertEquals(42, numero)
    }

    @Test
    fun testInferenciaExplicitaString() {
        val texto: String = "Kotlin"
        assertEquals("Kotlin", texto)
    }
}
