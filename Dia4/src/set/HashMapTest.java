/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Java
 */
public class HashMapTest {
     public static void main(String[] args) {
//         Map<String , String> diccionario = new HashMap<String, String>();
//         diccionario.put(1, "ID");   
//         diccionario.put(2, "NAME");   
//         diccionario.put(3, "LASTNAME");   
//         
//         System.out.println(diccionario.size());
//         
//         for (Entry <String, String> e: diccionario.entrySet()){
//             System.out.println("Llave " + e.getKey());
//         }
//         

Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "Casillas");		map.put(15, "Ramos");
map.put(3, "Pique");		map.put(5, "Puyol");
map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
map.put(18, "Pedrito");		map.put(6, "Iniesta");
map.put(7, "Villa");

// Imprimimos el Map con un Iterador
Iterator it = map.keySet().iterator();
while(it.hasNext()){
    
  Integer key =  (Integer) it.next();
  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
}
    }
 
    public HashMapTest() {
    }
}
