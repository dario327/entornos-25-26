/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1ud5ed;

/**
 * Clase principal.
 * Prueba las clases Perro y Gato con la interfaz Animal.
 * Crea objetos, modifica atributos y muestra información por pantalla.
 * @author Darío
 */

public class Ejercicio1UD5ED {
    /**
     * Método principal que ejecuta el programa
     * @param args argumentos de línea de consola
     */
    public static void main(String[] args) {
            // Crear un perro
        Perro perro = new Perro("Fido");
        perro.setEnfadado(true);
        
        // Crear un gato
        Gato gato = new Gato("Garfield");
        
        // Mostrar información sobre el perro
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Sonido del perro: " + perro.hacerSonido());
        System.out.println("¿Está ladrando? " + perro.isLadrando());
        
        // Mostrar información sobre el gato
        System.out.println("Nombre del gato: " + gato.getNombre());
        System.out.println("Sonido del gato: " + gato.hacerSonido());
        System.out.println("¿Está ronroneando? " + gato.isRonroneando());
    }
    
}
