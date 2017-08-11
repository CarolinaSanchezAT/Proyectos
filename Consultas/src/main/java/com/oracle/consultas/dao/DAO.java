/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class DAO {

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    private Connection connection;
     
    
    public void conectar(){
        String url ="jdbc:derby://localhost:1527/";
        String dbName ="Consultas";
        String driver ="org.apache.derby.jdbc.ClientDriver";
        String userName ="root";
        String password ="root";
        
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("CONEXION  EXITOSA");
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void main (String args []){
        DAO dao =new DAO ();
        dao.conectar();
        
        
    }
}
