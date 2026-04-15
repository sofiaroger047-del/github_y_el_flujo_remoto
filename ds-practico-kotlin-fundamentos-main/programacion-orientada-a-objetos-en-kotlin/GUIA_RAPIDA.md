# Guía Rápida de Inicio

## Paso 1: Clonar y Configurar

```bash
# Clonar el repositorio
git clone <url-del-repositorio>
cd programacion-orientada-a-objetos-en-kotlin

# Verificar que los tests fallen (esto es CORRECTO en TDD)
./gradlew test
```

Deberías ver errores de compilación que dicen `Unresolved reference 'Estudiante'`, `Unresolved reference 'CuentaBancaria'`, etc. **Esto es esperado y correcto**.

## Paso 2: Ejercicio 1 - Estudiante

### 2.1 Leer los tests

Abre el archivo `src/test/kotlin/Ejercicio1Test.kt` y lee los tests. Analiza qué esperan que hagas.

### 2.2 Crear la clase

Crea el archivo `src/main/kotlin/Estudiante.kt` con este contenido inicial:

```kotlin
// TODO: Implementar la clase Estudiante según los tests
```

### 2.3 Implementar

Basándote en los tests, implementa la clase `Estudiante`. Necesitas:

- Un constructor primario con parámetros `nombre` (String) y `legajo` (Int)
- Propiedades inmutables para `nombre` y `legajo`
- Una propiedad mutable `calificacion` (Double?) que inicialmente sea `null`

### 2.4 Verificar

```bash
./gradlew test --tests Ejercicio1Test
```

Todos los tests del Ejercicio 1 deberían pasar (en verde).

## Paso 3: Ejercicio 2 - CuentaBancaria

### 3.1 Leer los tests

Abre `src/test/kotlin/Ejercicio2Test.kt` y analiza qué debes implementar.

### 3.2 Crear la clase

Crea el archivo `src/main/kotlin/CuentaBancaria.kt`

### 3.3 Implementar

Según los tests, necesitas:

- Constructor con `titular` (String) y `saldo` (Double)
- Propiedad mutable `saldo`
- Método `depositar(monto: Double)` que aumente el saldo (solo si monto > 0)
- Método `retirar(monto: Double): Boolean` que:
  - Retorne `true` y disminuya el saldo si hay fondos suficientes
  - Retorne `false` y NO modifique el saldo si no hay fondos

### 3.4 Verificar

```bash
./gradlew test --tests Ejercicio2Test
```

## Paso 4: Ejercicio 3 - Producto (Data Class)

### 4.1 Leer los tests

Abre `src/test/kotlin/Ejercicio3Test.kt` y observa que los tests esperan comportamientos automáticos.

### 4.2 Crear la data class

Crea el archivo `src/main/kotlin/Producto.kt`

### 4.3 Implementar

Esta vez, usa una **data class**:

```kotlin
data class Producto(
    // TODO: definir propiedades según los tests
)
```

La data class generará automáticamente `toString()`, `equals()`, `hashCode()` y `copy()`.

### 4.4 Verificar

```bash
./gradlew test --tests Ejercicio3Test
```

## Paso 5: Verificación Final

Ejecuta todos los tests juntos:

```bash
./gradlew test
```

Si todos los tests están en verde, **¡felicitaciones!** Has completado el trabajo práctico.

## Estructura de una Clase en Kotlin

### Clase Normal

```kotlin
class NombreClase(parametro1: Tipo1, parametro2: Tipo2) {
    // Propiedades inmutables (no se pueden modificar después de crear el objeto)
    val propiedadInmutable: Tipo = valor
    
    // Propiedades mutables (se pueden modificar)
    var propiedadMutable: Tipo = valor
    
    // Métodos
    fun nombreMetodo(param: Tipo): TipoRetorno {
        // lógica
        return resultado
    }
}
```

### Data Class

```kotlin
data class NombreClase(
    val propiedad1: Tipo1,
    val propiedad2: Tipo2,
    var propiedad3: Tipo3
)
// Kotlin genera automáticamente: toString(), equals(), hashCode(), copy()
```

## Consejos

1. **Lee los tests primero** antes de escribir código
2. **Implementa solo lo necesario** para pasar los tests
3. **Ejecuta los tests frecuentemente** (después de cada pequeño cambio)
4. **No modifiques los tests** - son la especificación del ejercicio
5. **Usa IntelliJ IDEA** para autocompletado y ayuda de sintaxis
6. **Refactoriza** una vez que los tests pasen, para mejorar el código

## Problemas Comunes

### Los tests no se ejecutan

```bash
# Asegúrate de tener permisos de ejecución
chmod +x gradlew

# Limpia y vuelve a intentar
./gradlew clean test
```

### Error de Java

Asegúrate de tener Java 17 o superior:

```bash
java -version
```

### Error de compilación en las clases

- Verifica que el archivo esté en `src/main/kotlin/`
- Asegúrate de que el nombre de la clase coincida con el nombre del archivo
- Revisa que las propiedades tengan los tipos correctos
