/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author Java
 */
public class Alumno implements Comparable<Alumno> {
    
    String nombre ;
    int edad;
   

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        //return nombre.compareTo(o.nombre);
        
        String a =new String(String.valueOf(this.edad) + o.nombre);
        String b =new String(String.valueOf(this.nombre) + o.edad);
    }

            
}
