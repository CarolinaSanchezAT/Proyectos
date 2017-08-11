/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.bean;

/**
 *
 * @author Java
 */
public class PersonaReproduccionTest {
    public static void main(String[] args) {
        Persona julio = new Persona ();
        
        julio.nombre ="Julio";
        julio.sexo ='M';
        
        Persona julia = new Persona ();
        julia.nombre ="Julia";
        
        julio.reproducirse(julia);
    }
    
}
