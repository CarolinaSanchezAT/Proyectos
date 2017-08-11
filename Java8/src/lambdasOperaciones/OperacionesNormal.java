/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasOperaciones;

/**
 *
 * @author Java
 */
public class OperacionesNormal {
    public static void main(String[] args) {
        OperacionesNormal test = new OperacionesNormal();
        test.calcular();
                
    }
    
    public void calcular (){
        Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(18,20));
    }
}

