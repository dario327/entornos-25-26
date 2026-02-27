# Documentation

## `public interface Animal`

Interfaz de un animal

## `String getNombre()`

Devuelve el nombre del animal

 * **Returns:** El nombre del animal

## `String hacerSonido()`

Devuelve el sonido que hace el animal

 * **Returns:** Sonido del animal

## `public class Ejercicio1UD5ED`

Clase principal. Prueba las clases Perro y Gato con la interfaz Animal. Crea objetos, modifica atributos y muestra información por pantalla.

 * **Author:** Darío

## `public static void main(String[] args)`

Método principal que ejecuta el programa

 * **Parameters:** `args` — argumentos de línea de consola

## `public class Gato implements Animal`

Clase que representa un gato. Usa la interfaz Animal y añade métodos propios.

## `private String nombre`

Nombre del gato

## `private boolean ronronea`

Si el gato ronronea o no

## `public Gato(String nombre)`

Constructor de la clase gato que asigna un nombre recibido por parámetro

 * **Parameters:** `nombre` — Nombre del gato

## `@Override public String getNombre()`

{@inheritDoc}

## `public void setRonronea(boolean ronronea)`

Establece si el gato está ronroneando.

 * **Parameters:** `ronronea` — true si ronrone, false si no

## `@Override public String hacerSonido()`

{@inheritDoc}

## `public boolean isRonroneando()`

Indica si el gato ronronea.

 * **Returns:** true si ronronea, false si no

## `public class Perro implements Animal`

Clase que representa un perro. Usa la interfaz Animal y añade métodos propios.

## `private String nombre`

Nombre del perro

## `private boolean enfadado`

Si el perro está enfadado o no.

## `private String talla`

Talla del perro (no utilizado).

## `public Perro(String nombre)`

Constructor de la clase perro que asigna un nombre recibido por parámetro.

 * **Parameters:** `nombre` — Nombre del perro

## `@Override public String getNombre()`

{@AinheritDoc}

## `public boolean isEnfadado()`

Indica si el perro está enfadado o no.

 * **Returns:** true si está enfadado, false si no

## `public void setEnfadado(boolean enfadado)`

Establebe si el perro está enfadado.

 * **Parameters:** `enfadado` — true si está enfadado, false si no

## `@Override public String hacerSonido()`

{@inheritDoc}

## `public boolean isLadrando()`

Indica si el perro está ladrando o no.

 * **Returns:** true si ladra, false si no

## `public String getTalla()`

Devuelve la talla del perro

 * **Returns:** talla del perro
 * **Deprecated**

## `public void setTalla(String nuevaTalla)`

Estable la talla del perro

 * **Parameters:** `nuevaTalla` — nueva talla del perro
 * **Deprecated**
