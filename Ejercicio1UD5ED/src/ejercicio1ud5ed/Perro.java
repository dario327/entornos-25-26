/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1ud5ed;
/**
 * Clase que representa un perro.
 * Usa la interfaz Animal y añade métodos propios.
 */

public class Perro  implements Animal {
    /**
     * Nombre del perro
     */
    private String nombre;
    /**
     * Si el perro está enfadado o no.
     */
    private boolean enfadado;
    /**
     * Talla del perro (no utilizado).
     */
    private String talla;
    /**
     * Constructor de la clase perro que asigna un nombre recibido por parámetro.
     * @param nombre Nombre del perro
     */
    public Perro(String nombre) {
        this.nombre = nombre;
        this.enfadado=false;
    }
    /**
     * {@inheritDoc} 
     */
    @Override
    public String getNombre() {
        return nombre;
    }
    /**
     * Indica si el perro está enfadado o no.
     * @return true si está enfadado, false si no
     */
    public boolean isEnfadado() {
        return enfadado;
    }
    /**
     * Establebe si el perro está enfadado.
     * @param enfadado true si está enfadado, false si no
     */
    public void setEnfadado(boolean enfadado) {
        this.enfadado = enfadado;
    }
    /**
     * {@inheritDoc} 
     */
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
    /**
     * Indica si el perro está ladrando o no.
     * @return true si ladra, false si no
     */
    public boolean isLadrando() {
        return this.enfadado;
    }
    
    /**
     * Devuelve la talla del perro
     * @return talla del perro
     * @deprecated ya no se usa este método
     */ 
    public String getTalla() {
        return this.talla;
    }
    /**
     * Estable la talla del perro
     * @param nuevaTalla nueva talla del perro
     * @deprecated ya no se usa este método
     */
    public void setTalla(String nuevaTalla) {
        this.talla=nuevaTalla;
    }
}
