/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Java
 */
public class SetTest {
    public static void main(String[] args) {
        Set <String> lista = new HashSet<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");
        lista.add("d");
        lista.add("e");
        lista.add("f");
        
        for (String list:lista){
            System.out.println(list);
            
            
        }
    }
}


// EKEMPLOS en http://programandoointentandolo.com/2013/02/ejemplo-de-uso-de-hashmap-en-java-2.html