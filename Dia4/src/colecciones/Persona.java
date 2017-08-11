/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Java
 */
public class Persona {
    public String nombre;
    public String lastName;

    public Persona() {
    }

    public Persona(String nombre, String lastName) {
        this.nombre = nombre;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
