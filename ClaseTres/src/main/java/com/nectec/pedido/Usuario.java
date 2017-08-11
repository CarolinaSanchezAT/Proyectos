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
public class Usuario {
    public static void main(String[] args) {
        Pedidos pedidoMexico = new PedidoMexico();
        pedidoMexico.setImporteSinIVA(10000);
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualiza();
        
        
        Pedidos pedidoEspana = new PedidoEspaña();
        pedidoEspana.setImporteSinIVA(10000);
        pedidoEspana.calcularPrecioConIVA();
        pedidoEspana.visualiza();
    }
}
