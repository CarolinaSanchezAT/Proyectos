/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.varargs;

/**
 *
 * @author Java
 */
public class Operaciones {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        float promedio = op.promedio(3,4,6,7,9,3,4);
        System.out.println("Promedio" + promedio);
    }
 
public float promedio (int... calificaciones){
     
    int suma = 0;
    
    for (int calificacion : calificaciones){
        suma += calificacion;
    }
    return  ((float)suma / calificaciones.length);
    
}
}
