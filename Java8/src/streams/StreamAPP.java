/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class StreamAPP {

    public StreamAPP() {
        
        lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Raul");
        lista.add("Carolina");
        
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        
    }
   
    private List <String> lista;
    private List <String> numeros;
    
    public static void main(String[] args) {
        StreamAPP streams = new StreamAPP();
        streams.filtrar();
        
        
        
    }
    
public void filtrar() {
        lista.stream().filter (x -> x.startsWith("J")).forEach(System.out::println);
    }


public void ordenar (){
    lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
}
public void limitar(){
    
}
}
