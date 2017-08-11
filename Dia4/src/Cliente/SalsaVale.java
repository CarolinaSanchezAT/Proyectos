
package Cliente;

import PersonalExeption.MiExeption;
import java.util.Date;
import javax.swing.JOptionPane;

public class SalsaVale {
    public static void main(String[] args) throws Exception {
        
        try{
            SalsaVale.validarEntrar("Juan",18);
        }
        catch(MiExeption ex){
//            throw new MiExeption(500,"Menor no permitido", 
//                    new Date(),"No se permite la entrada a menores");
            JOptionPane.showMessageDialog(null,"Codigo Errro: " + ex.getCode() + " ; " 
                    + "  : " + ex.getDescription() + " : "  + ex.getMessage());
        }
    }
    public static boolean validarEntrar(String nombre, int edad) throws MiException, MiExeption{
        boolean esMayor = false;
        if(edad >= 18){
            esMayor = true;
            System.out.println("Bienvenido: " + nombre);
        }else{
            throw new MiExeption("No eres mayor de edad");
        }
        return esMayor;
    }
  
}
