/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class DoctorDaoIMP extends DAO implements DoctorDAO {

    
    private String crearsql = 
            "INSERT INTO DOCTOR (CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) VALUES (?,?,?,?)";
    
    private Connection connection;
    @Override
    public void crearDoctor(Doctor doctor) {
        try {
            this.conectar();
            
            PreparedStatement pst = this.getConnection().prepareStatement(crearsql);
            pst.setInt(1, doctor.getCodigo());
            pst.setString(2, doctor.getNombre());
            pst.setString(3, doctor.getApellido());
            pst.setString(4,doctor.getEspecialidad());
            
            pst.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            this.cerrarConexion();
        }
    }
    
    public void cerrarConexion(){
      
        try {
            if (connection != null){
            if (!connection.isClosed())
            {
                connection.close();
            }
    }
        }
        catch (Exception e){
            e.printStackTrace();
            
    }
    }

    @Override
    public void eliminarDoctor(Doctor doctor) {
       
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
