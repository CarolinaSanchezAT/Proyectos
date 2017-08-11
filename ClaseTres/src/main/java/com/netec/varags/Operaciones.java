
package com.netec.varags;

public class Operaciones {
    public static void main(String[] args) {
           Operaciones op = new Operaciones();
//           float promedio = op.promedio(3,5,6,7,3,9);  Ejemplo para promedio
//           System.out.println("Promedio: " + promedio);
   
    op.calcularCalificaciones("Saul", "Ing. Mecatronica", 10,10,9,9,10);
    }
    
      public float promedio(int... calificaciones){
       int suma = 0; 
          for (int calificacion : calificaciones) {
              suma += calificacion;
              
          }
          return ((float) suma / calificaciones.length);
    }
      
      
      public void calcularCalificaciones (String nombreAlumno, String carrera, int... calificaciones){
          System.out.println("Alumno : " + nombreAlumno);
          System.out.println("Carrera : " + carrera);
          
          
          for (int calificacione : calificaciones) {
            System.out.println("Calificaciones : " + calificacione);
          }
      }
              
}
