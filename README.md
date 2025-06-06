
# Práctica Pilas y Colas

## 📌 Información General

- **Título:** Ejercicios Logica con Pilas y Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Pedro Pesántez
- **Fecha:** 05/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción
### 📚 Proyecto Java – Validación de Paréntesis y Ordenamiento con Pilas

Este proyecto contiene dos ejercicios desarrollados en Java que utilizan estructuras de **pila (stack)** para resolver problemas clásicos: validación de expresiones y ordenamiento.

---

## 🧪 Ejercicio 1: Validador de Paréntesis (`SingValidator`)

### 📌 Descripción
Este ejercicio verifica si una cadena de paréntesis, corchetes y llaves está **correctamente balanceada**. Se utiliza una pila genérica (`StackG<Character>`) para almacenar los símbolos de apertura y verificar que cada símbolo de cierre tenga su pareja correspondiente.

### ✅ Ejemplos de Entrada/Salida

| Entrada    | Salida |
|------------|--------|
| `{[()]}`   | true   |
| `{[(])}`   | false  |
| `((())){}` | true   |
| `([)]`     | false  |

### 🔍 Lógica de Validación
1. Recorrer cada carácter de la cadena:
   - Si es `(`, `{` o `[`, se **empuja** a la pila.
   - Si es `)`, `}` o `]`, se verifica que:
     - La pila no esté vacía.
     - El tope de la pila coincida con el carácter de apertura correspondiente.
   - Si no coincide, se retorna `false`.
2. Al finalizar, si la pila está vacía, se retorna `true`; de lo contrario, `false`.

---

## 🧪 Ejercicio 2: Ordenamiento de Pila (`StackSorter`)

### 📌 Descripción
Este ejercicio ordena los elementos de una pila de enteros en **orden ascendente**, utilizando solo operaciones con pilas (sin listas ni arrays).

### 🧠 Algoritmo
1. Se utiliza una pila auxiliar (`stackAux`).
2. Mientras la pila principal no esté vacía:
   - Se extrae el tope y se guarda en `temp`.
   - Se insertan en la pila original los elementos de `stackAux` que sean mayores que `temp`.
   - Se coloca `temp` en su lugar correspondiente en `stackAux`.
3. Finalmente, los elementos se devuelven desde `stackAux` a la pila original.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App2.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App2
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
-------------------------EJERCICIO 1-------------------------
Input: (){}
Output: true
-------------------------EJERCICIO 2-------------------------
Ingrese la cantidad de elementos que desea ingresar:
4
Ingrese los elementos: 
- 2
- 4
- 1
- 5
Input: 5 -> 1 -> 4 -> 2 -> 
Output: 1 -> 2 -> 4 -> 5 ->
```

---

