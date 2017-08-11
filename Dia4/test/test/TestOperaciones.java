/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import operaciones.Operaciones;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Java
 */
public class TestOperaciones {
    
    public TestOperaciones() {
    }
    
     @Test
     public void test(){
         Operaciones op =  new Operaciones();
      int sum = op.sumar(40, 50);
      
      Assert.assertEquals(90,sum);
     }
    // public void hello() {}
}
