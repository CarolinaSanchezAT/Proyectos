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
public class PedidoEspaña  extends Pedidos{

    @Override
    protected void calcularIVA() {
        importeIVA = importeSinIva * 0.21;
    }
    
}
