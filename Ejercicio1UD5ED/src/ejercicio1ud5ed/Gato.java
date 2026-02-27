/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1ud5ed;
/**
 * Clase que representa un gato.
 * Usa la interfaz Animal y añade métodos propios.
*/
public class Gato implements Animal {
    /**
     * Nombre del gato
     */
    private String nombre;
    /**
     * Si el gato ronronea o no
     */
    private boolean ronronea;
    /**
     * Constructor de la clase gato que asigna un nombre recibido por parámetro
     * @param nombre Nombre del gato
     */
    public Gato(String nombre) {
        this.nombre = nombre;
        this.ronronea=false;
    }
    /**
     * {@inheritDoc} 
     */
    @Override
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece si el gato está ronroneando.
     * @param ronronea true si ronrone, false si no
     */
    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }
    /**
     * 
     * {@inheritDoc} 
     */
    @Override
    public String hacerSonido() {
        return "Miau";
    }
    /**
     * Indica si el gato ronronea.
     * @return  true si ronronea, false si no
     */
    public boolean isRonroneando() {
        return this.ronronea;
    }
}
