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
public class Persona {
    
    Persona padre;
    Persona madre;
    String nombre;
    char sexo;
    
    
    public Persona reproducirse(Persona p){
        Persona hijo =null ;
        
        if (p instanceof Persona){
            if (p!=null && this.sexo != p.sexo){
                hijo = new Persona ();
                
                switch(this.sexo){
                    case 'F':
                        hijo.madre=this;
                        hijo.padre=p;
                    break;
                    case 'M':
                        hijo.madre=p;
                        hijo.padre=this;
                    break;
                    default:
                        System.out.println("Falta Sexo Opuesto");
                }
            }else{
                System.out.println("REPRODUCCION");
            }
        }
         return hijo;
    }
    
}
