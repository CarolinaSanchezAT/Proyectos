/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
 
public class Test3 {
    public static void main(String... args) {
     
        Set s = new TreeSet();
          s.add("7");
          s.add(9);       
          Iterator itr = s.iterator();
            while (itr.hasNext())
          System.out.print(itr.next() + " ");
       
    }

    String getHour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}