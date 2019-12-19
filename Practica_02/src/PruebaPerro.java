/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaPerro {
    
    public static void main(String[] args) {
        
        Perro p =  new Perro();
        
        p.setNombre("Arlequin");
        p.setEdad(5);
        int edadAñosPersona = p.calcularEdadPersona();
        
        System.out.println("Nombre del perro: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Edad años-personas: " + edadAñosPersona);
        
    }
    
}
