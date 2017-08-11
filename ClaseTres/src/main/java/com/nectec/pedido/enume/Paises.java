/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nectec.pedidos.enume;

/**
 *
 * @author Java
 */
public enum Paises{
     MEXICO (0.16f),
     ESPAÑA (0.21f),
     ARGENTINA (0.20f),
     PARIS (0.30f);

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
     
     private float IVA;
     private String contacto;
     
      private Paises (float iva){
          this.IVA = iva;
      }
     private Paises (float iva, String contacto){
         this.IVA = iva;
         this.contacto = contacto;
         
     }
}
