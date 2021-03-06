/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Java
 */
public class OrdenarSinLambda {
    public static void main(String[] args) {
    List <Persona> clientes =new ArrayList<Persona>();
    
   clientes.add(new Persona("Lety"));
   clientes.add(new Persona("Alberto"));
   clientes.add(new Persona("Carlos"));
   clientes.add(new Persona("Jose"));
   clientes.add(new Persona("Manuel"));
    
        Collections.sort(clientes, new Comparator <Persona> (){
        
        @Override
        public int  compare (Persona o1, Persona o2){
            return o1.nombre.compareTo(o2.nombre);
        }
        });
        
        Collections.sort(clientes, (Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));
        for (Persona cliente :clientes) {
            System.out.println(cliente.toString());
        }
    }
}
