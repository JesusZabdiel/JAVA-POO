/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A0137464
 */
public class Perro {
    
    private String nombreP;
    private int edadP;
    
    public void setNombre(String nombre){
        
        nombreP = nombre;
    }
    
    public void setEdad(int edad){
        edadP = edad;         
    }
    
    public String getNombre(){
        return nombreP;
    }
    
    public int getEdad(){
        return edadP;
    }
    
    public int calcularEdadPersona(){
        return edadP *7;
    }
    
}
