import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Ejercicio 2: Métodos de Instancia
 *
 * CONTEXTO:
 * Necesitas agregar comportamiento a las clases que ya modelaste.
 * Las clases no solo almacenan datos, también deben ejecutar lógica de negocio.
 *
 * OBJETIVO:
 * - Implementar métodos de instancia que operen sobre el estado del objeto
 * - Comprender la diferencia entre propiedades y métodos
 * - Practicar lógica condicional dentro de métodos
 *
 * INSTRUCCIONES:
 * 1. Implementa la clase CuentaBancaria en el archivo src/main/kotlin/CuentaBancaria.kt
 * 2. Ejecuta los tests con: ./gradlew test --tests Ejercicio2Test
 * 3. Sigue el ciclo Red → Green → Refactor
 * 4. NO modifiques estos tests
 */
class Ejercicio2Test {

    @Test
    fun `debe crear una cuenta bancaria con titular y saldo inicial`() {
        val cuenta = CuentaBancaria("Maria Gomez", 1000.0)

        assertEquals("Maria Gomez", cuenta.titular)
        assertEquals(1000.0, cuenta.saldo)
    }

    @Test
    fun `debe permitir depositar dinero`() {
        // Dado: una cuenta con saldo inicial
        val cuenta = CuentaBancaria("Juan Perez", 500.0)

        // Cuando: se deposita dinero
        cuenta.depositar(200.0)

        // Entonces: el saldo aumenta
        assertEquals(700.0, cuenta.saldo)
    }

    @Test
    fun `debe permitir retirar dinero si hay saldo suficiente`() {
        // Dado: una cuenta con saldo
        val cuenta = CuentaBancaria("Sofia Ruiz", 1000.0)

        // Cuando: se retira un monto menor al saldo
        val resultado = cuenta.retirar(300.0)

        // Entonces: el retiro es exitoso y el saldo disminuye
        assertTrue(resultado)
        assertEquals(700.0, cuenta.saldo)
    }

    @Test
    fun `no debe permitir retirar mas dinero del disponible`() {
        // Dado: una cuenta con saldo limitado
        val cuenta = CuentaBancaria("Diego Torres", 100.0)

        // Cuando: se intenta retirar más dinero del disponible
        val resultado = cuenta.retirar(200.0)

        // Entonces: el retiro falla y el saldo no cambia
        assertEquals(false, resultado)
        assertEquals(100.0, cuenta.saldo)
    }

    @Test
    fun `debe calcular el saldo despues de multiples operaciones`() {
        // Dado: una cuenta nueva
        val cuenta = CuentaBancaria("Luciana Fernandez", 0.0)

        // Cuando: se realizan múltiples operaciones
        cuenta.depositar(500.0)
        cuenta.retirar(100.0)
        cuenta.depositar(250.0)
        cuenta.retirar(50.0)

        // Entonces: el saldo final es correcto
        assertEquals(600.0, cuenta.saldo)
    }

    @Test
    fun `no debe permitir depositos negativos`() {
        // Dado: una cuenta con saldo
        val cuenta = CuentaBancaria("Roberto Silva", 1000.0)

        // Cuando: se intenta depositar un monto negativo
        cuenta.depositar(-100.0)

        // Entonces: el saldo no debe cambiar
        assertEquals(1000.0, cuenta.saldo)
    }
}
