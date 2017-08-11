/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Java
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        
//        arrayList.add(23);
//        arrayList.add(3);
//        arrayList.add(33);
//        arrayList.add(43);
//        arrayList.add(253);
//        
//        System.out.println(arrayList.size());
//        
//        for (int i = 0 ;  i <arrayList.size(); i++){
//        System.out.println(arrayList.get(i));
//        }
//        
//        Collections.sort(arrayList);
//        System.out.println("Ordenado : " + arrayList);



   ArrayList<Persona>   personas = new ArrayList<Persona>();
        
   
        Persona pepe = new Persona ("Pepe","Piña");
        Profesor profesor = new Profesor();
               
        profesor.nombre = "Joel";
        profesor.lastName = "Perez";
        profesor.especialidad= "Fisica";
  
        personas.add(pepe);
        personas.add(profesor);
        
        System.out.println(personas.size());
        
    
       Iterator iterar = personas.iterator();
       while (iterar.hasNext()){
           System.out.println("Iterador");
           System.err.println(iterar.next());
       }
    }
            
}

