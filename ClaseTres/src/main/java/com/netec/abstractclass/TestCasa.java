/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.abstractclass;

/**
 *
 * @author Java
 */
public class TestCasa {
    public static void main(String[] args) {
        Electrodomestico television = new Television();
        Electrodomestico lavadora = new Lavadora();
        
        LineaBlanca lavadoraMabe = new Lavadora();
        LineaBlanca televisionEKT = new Television();
        
        TestCasa.validar(television);
                
    }
    public static void validar(Electrodomestico electrodomestico){
        if (electrodomestico instanceof Lavadora){
            Lavadora easy = (Lavadora) electrodomestico;
            System.out.println("Si es una Lavadora;
        }else{
            System.err.println("No es una lavadora");
        }
}
