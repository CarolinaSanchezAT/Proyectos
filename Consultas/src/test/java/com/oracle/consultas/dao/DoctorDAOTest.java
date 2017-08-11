/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class DoctorDAOTest {
    


    @Test
    public void crearDoctorTest(){
        DoctorDAO doctorDao = new DoctorDaoIMP();
        
        Doctor simi = new Doctor();
           simi.setCodigo(1);
           simi.setNombre("Dr. Simi");
           simi.setApellido("Lopez");
           simi.setEspecialidad("Generico");
           
           doctorDao.crearDoctor(simi);
    }
}
