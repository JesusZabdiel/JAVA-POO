
import java.util.Arrays;

/*
 * @author Zady-
 */
public class PruebaAlumno {
    
    public static void main(String[] args) {
        Alumno[] array = new Alumno[50];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = new Alumno("Alumno", (int)(Math.random()*100+1));
            
        }
        
        for (Alumno alumno : array) {
            System.out.println("Arreglo: " + alumno);
         
            
        }
        System.out.println("###############");
        
        for (Alumno alumno : array) {
            alumno.setProemedio(alumno.getProemedio()+1);
            System.out.println("Alumnos: " + alumno);
            
        }
        
    }
}
