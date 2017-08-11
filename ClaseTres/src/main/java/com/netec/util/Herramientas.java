/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public class Herramientas {
    
    public static Date getFecha (String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String strFecha = fecha;
        Date fechaDate = null;
        
        
           try {
               fechaDate= formato.parse(strFecha);
               return fechaDate;
           }catch (Exception e){
               e.printStackTrace();
               return fechaDate;

           }
                   
    }
    
    public static String nombre = "Mi nombre";
    public static void main(String[] args) {
        StringBuilder con;
        con = new StringBuilder("Nombre,Nombre");
        
        while (true){
            con.append("Nombre").append(con);
            System.out.println(con);
        }
    }
}
