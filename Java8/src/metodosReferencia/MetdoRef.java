/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosReferencia;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Java
 */
public class MetdoRef {
    public void referenciarMetodosObjetos(){
        String [] nombres = {"Arsenio","Zaori","Gerardo"};
        
//        Arrays.sort(nombres, new Comparator<String>{
//        @Override
//        public int compare(String o1,String o2){
//            return o1.compareToIgnoreCase(o2);
//        }
//    });

Arrays.sort(nombres,String :: compareToIgnoreCase);

for (String nombre : nombres){
    System.out.println(nombre);
}
    }
    public void referenciarParticular(){
        
    }
    public void referenciarConstructor(){
        IPersona iper =  Persona::new ;
        Persona per = iper.crear(1, "Eduardo Castillo");
    }
    public static void main(String[] args) {
        MetdoRef metodo = new  MetdoRef();
        
        metodo.referenciarMetodosObjetos();
    }
}
