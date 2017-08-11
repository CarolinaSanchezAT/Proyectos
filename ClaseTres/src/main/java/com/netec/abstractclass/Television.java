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
public class Television extends LineaBlanca {
    
    @Override
    public void encender(){
        System.out.println("Encender como televisor");
    }
    @Override
    public void apagar(){
        System.out.println("Apaga como televisor");
    }

    @Override
    public void tareaDomestica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
