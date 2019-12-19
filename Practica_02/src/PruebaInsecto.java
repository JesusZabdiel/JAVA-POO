/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaInsecto {
    public static void main(String[] args) {
        
        Insecto a = new Insecto();
        System.out.println("Posición de a: " + a.getPosicion());
        a.mover();
        a.mover();
        System.out.println("Posición de a: " + a.getPosicion());
        a.girar();
        a.mover();
        System.out.println("Posición de a: " + a.getPosicion());
        
       a.setPosicionX(50);
       a.mover(5);
        System.out.println("Posicion de a: "+ a.getPosicion());
        
    }
    
}
