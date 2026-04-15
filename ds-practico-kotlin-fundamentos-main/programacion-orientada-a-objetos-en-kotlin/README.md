# Programación orientada a objetos en Kotlin

## Objetivo General

Este trabajo práctico tiene como objetivo introducir y evaluar los conceptos fundamentales de **Programación Orientada a Objetos (POO)** en **Kotlin**, utilizando **Test Driven Development (TDD)** como estrategia de aprendizaje.

Al finalizar este práctico, serás capaz de:

- Declarar clases con constructores primarios
- Definir y utilizar propiedades inmutables (`val`) y mutables (`var`)
- Implementar métodos de instancia que operan sobre el estado del objeto
- Comprender y aplicar `data class` para modelar estructuras de datos
- Aprovechar los métodos generados automáticamente: `toString()`, `equals()`, `copy()`

## Temas Evaluados

Este práctico cubre los siguientes conceptos de Kotlin:

1. **Clases** - Declaración y uso de clases básicas
2. **Constructores** - Constructores primarios con parámetros
3. **Propiedades** - Propiedades inmutables (`val`) y mutables (`var`)
4. **Métodos** - Métodos de instancia con lógica de negocio
5. **Data Classes** - Clases especializadas para almacenar datos
6. **toString()** - Representación textual de objetos (generado automáticamente en data classes)
7. **equals()** - Comparación estructural de objetos (generado automáticamente en data classes)
8. **copy()** - Creación de copias con modificaciones parciales (generado automáticamente en data classes)

## Estructura del Proyecto

```
programacion-orientada-a-objetos-en-kotlin/
├── src/
│   ├── main/
│   │   └── kotlin/
│   │       ├── Estudiante.kt          (Ejercicio 1)
│   │       ├── CuentaBancaria.kt      (Ejercicio 2)
│   │       └── Producto.kt            (Ejercicio 3)
│   └── test/
│       └── kotlin/
│           ├── Ejercicio1Test.kt
│           ├── Ejercicio2Test.kt
│           └── Ejercicio3Test.kt
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Reglas de Trabajo

### Metodología TDD

Este práctico sigue estrictamente el ciclo **Red → Green → Refactor**:

1. **Red**: Ejecuta los tests. Inicialmente **todos fallarán** porque no has implementado las clases.
2. **Green**: Escribe el código mínimo necesario para hacer pasar los tests.
3. **Refactor**: Mejora tu código manteniendo los tests en verde.

### Restricciones Importantes

- **NO modifiques los archivos de tests**. Los tests son la especificación del ejercicio.
- **NO implementes funcionalidad que no esté cubierta por tests**.
- Implementa **solo** el código necesario para hacer pasar los tests.
- Sigue el orden de los ejercicios (1 → 2 → 3).

### Flujo de Trabajo Recomendado

1. Lee los tests del ejercicio actual
2. Identifica qué clase debes crear y qué debe hacer
3. Crea el archivo correspondiente en `src/main/kotlin/`
4. Implementa la solución mínima
5. Ejecuta los tests
6. Refactoriza si es necesario
7. Avanza al siguiente ejercicio

## Instrucciones para Ejecutar los Tests

### Requisitos Previos

- **Java JDK 17 o superior** instalado (recomendado Java 21)
- No necesitas instalar Gradle (el proyecto incluye Gradle Wrapper)

### Ejecutar Todos los Tests

```bash
./gradlew test
```

### Ejecutar Tests de un Ejercicio Específico

```bash
./gradlew test --tests Ejercicio1Test
./gradlew test --tests Ejercicio2Test
./gradlew test --tests Ejercicio3Test
```

### Ver el Reporte de Tests

Después de ejecutar los tests, puedes ver un reporte detallado en:

```
build/reports/tests/test/index.html
```

Abre este archivo en tu navegador para una vista completa de los resultados.

## Descripción de los Ejercicios

### Ejercicio 1: Clases, Constructores y Propiedades

**Archivo a crear:** `src/main/kotlin/Estudiante.kt`

**Conceptos evaluados:**
- Declaración de clases
- Constructores primarios
- Propiedades inmutables (`val`) y mutables (`var`)
- Tipos nullables (`?`)

**Contexto:** Modelar un estudiante con nombre, legajo y calificación opcional.

---

### Ejercicio 2: Métodos de Instancia

**Archivo a crear:** `src/main/kotlin/CuentaBancaria.kt`

**Conceptos evaluados:**
- Métodos de instancia
- Lógica condicional dentro de métodos
- Modificación del estado interno del objeto
- Retorno de valores desde métodos

**Contexto:** Implementar una cuenta bancaria con operaciones de depósito y retiro.

---

### Ejercicio 3: Data Classes

**Archivo a crear:** `src/main/kotlin/Producto.kt`

**Conceptos evaluados:**
- Declaración de `data class`
- Uso de `toString()` generado automáticamente
- Comparación con `equals()` generado automáticamente
- Creación de copias con `copy()`

**Contexto:** Modelar un producto con código, nombre y precio, aprovechando las ventajas de las data classes.

---

## Integración Continua (CI)

Este proyecto está configurado con **GitHub Actions** para ejecutar los tests automáticamente en cada `push` o `pull request`.

El pipeline fallará si algún test no pasa, garantizando la calidad del código.

## Recursos Adicionales

- [Documentación oficial de Kotlin](https://kotlinlang.org/docs/home.html)
- [Clases en Kotlin](https://kotlinlang.org/docs/classes.html)
- [Data Classes](https://kotlinlang.org/docs/data-classes.html)
- [Propiedades](https://kotlinlang.org/docs/properties.html)

## Soporte

Si encuentras problemas técnicos con la configuración del proyecto:

1. Verifica que tienes Java 17+ instalado: `java -version`
2. Asegúrate de estar en el directorio raíz del proyecto
3. Limpia el proyecto: `./gradlew clean`
4. Vuelve a ejecutar los tests: `./gradlew test`

---

**¡Buena suerte y que disfrutes aprendiendo Kotlin con TDD!**
