import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Ejercicio 3: Data Classes
 *
 * CONTEXTO:
 * Kotlin ofrece una característica especial llamada "data class" que genera automáticamente
 * implementaciones útiles para clases que principalmente almacenan datos.
 *
 * OBJETIVO:
 * - Comprender qué es una data class y cuándo usarla
 * - Aprovechar los métodos generados automáticamente: toString(), equals(), copy()
 * - Entender la diferencia entre una clase normal y una data class
 *
 * INSTRUCCIONES:
 * 1. Implementa la data class Producto en el archivo src/main/kotlin/Producto.kt
 * 2. Ejecuta los tests con: ./gradlew test --tests Ejercicio3Test
 * 3. Sigue el ciclo Red → Green → Refactor
 * 4. NO modifiques estos tests
 *
 * PISTA:
 * - Una data class en Kotlin se declara con la palabra clave 'data' antes de 'class'
 * - Kotlin genera automáticamente toString(), equals(), hashCode() y copy()
 */
class Ejercicio3Test {

    @Test
    fun `debe crear un producto con codigo, nombre y precio`() {
        val producto = Producto(101, "Laptop", 1200.50)

        assertEquals(101, producto.codigo)
        assertEquals("Laptop", producto.nombre)
        assertEquals(1200.50, producto.precio)
    }

    @Test
    fun `toString debe generar una representacion legible del producto`() {
        // Dado: un producto
        val producto = Producto(202, "Mouse", 25.99)

        // Cuando: se convierte a String
        val representacion = producto.toString()

        // Entonces: contiene información del producto en formato legible
        // La data class genera automáticamente: Producto(codigo=202, nombre=Mouse, precio=25.99)
        assertEquals("Producto(codigo=202, nombre=Mouse, precio=25.99)", representacion)
    }

    @Test
    fun `dos productos con los mismos valores deben ser iguales`() {
        // Dado: dos productos con los mismos datos
        val producto1 = Producto(303, "Teclado", 75.00)
        val producto2 = Producto(303, "Teclado", 75.00)

        // Entonces: deben ser considerados iguales (equals generado automáticamente)
        assertEquals(producto1, producto2)
    }

    @Test
    fun `dos productos con diferentes valores no deben ser iguales`() {
        // Dado: dos productos diferentes
        val producto1 = Producto(404, "Monitor", 300.00)
        val producto2 = Producto(505, "Monitor", 300.00)

        // Entonces: NO deben ser iguales (difieren en código)
        assertNotEquals(producto1, producto2)
    }

    @Test
    fun `copy debe crear una copia con modificaciones parciales`() {
        // Dado: un producto original
        val original = Producto(606, "Auriculares", 50.00)

        // Cuando: se crea una copia modificando solo el precio
        val copia = original.copy(precio = 45.00)

        // Entonces: la copia tiene el nuevo precio pero mantiene código y nombre
        assertEquals(606, copia.codigo)
        assertEquals("Auriculares", copia.nombre)
        assertEquals(45.00, copia.precio)

        // Y el original no cambia
        assertEquals(50.00, original.precio)
    }

    @Test
    fun `copy sin parametros debe crear una copia identica`() {
        // Dado: un producto
        val original = Producto(707, "Webcam", 120.00)

        // Cuando: se crea una copia sin modificaciones
        val copia = original.copy()

        // Entonces: son iguales pero no son la misma instancia
        assertEquals(original, copia)
        assert(original !== copia) // !== compara referencias de objetos
    }

    @Test
    fun `copy puede modificar multiples propiedades`() {
        // Dado: un producto
        val original = Producto(808, "SSD", 200.00)

        // Cuando: se modifican varias propiedades al copiar
        val actualizado = original.copy(nombre = "SSD NVMe", precio = 180.00)

        // Entonces: las propiedades se actualizan correctamente
        assertEquals(808, actualizado.codigo)
        assertEquals("SSD NVMe", actualizado.nombre)
        assertEquals(180.00, actualizado.precio)
    }
}
