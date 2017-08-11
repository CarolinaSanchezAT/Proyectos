/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Java
 */
public class TestOrden {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Jose";
        alumno.edad = 15;
        
        
        Alumno alumno1 = new Alumno();
        alumno1.nombre = "Manuel";
        alumno1.edad = 35;
        
        Alumno alumno2 = new Alumno();
        alumno2.nombre = "Alan";
        alumno2.edad = 25;
        
        
        ArrayList <Alumno> alum = new ArrayList<Alumno>();
        
        alum.add(alumno);
        alum.add(alumno1);
        alum.add(alumno2);
        
        System.out.println("Sin ordenar : " );
        System.out.println(alum);
        
        Collections.sort(alum);
        
        System.out.println("Lista Ordenada");
        System.out.println(alum);
        
        
        
    }
}
