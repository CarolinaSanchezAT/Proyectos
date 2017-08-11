/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

/**
 *
 * @author Java
 */
public class B extends A{
      public B (){
        System.out.print("B");
    }
    public B (int i){
        this();
        System.out.print(i+3);
    }
}
