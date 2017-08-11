/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nectec.pedido;

/**
 *
 * @author Java
 */
public abstract class Pedidos {
    
    protected double importeSinIva;
    protected double importeIVA;
    protected double importeConIVA;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA(){
        this.calcularIVA();
        importeConIVA = importeSinIva + importeIVA;
        
    }
    public void setImporteSinIVA (double importeSinIVA){
        this.importeSinIva = importeSinIVA;
    }
    public void visualiza (){
        System.out.println("Pedido : ");
        System.out.println("Importe sin IVA : " + importeSinIva);
        System.out.println("Importe con IVA : " + importeConIVA);
    }
           
}
