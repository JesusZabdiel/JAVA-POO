/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaPunto {
    
    public static void main(String[] args) {
        
        Punto p = new Punto();
        int xP = p.getX();
        int yP = p.getY();
        double distanciaP = p.calcularDistanciaAlOrigen();
        System.out.println("Punto p en (" + xP + ", " + yP + ")");
        System.out.println("Distancia de p al origen: " + distanciaP);
        p.setX(4);
        p.setY(3);
        xP = p.getX();
        yP = p.getY();
        distanciaP = p.calcularDistanciaAlOrigen();
        System.out.println("\nAhora punto p en (" + xP + ", " + yP + ")");
        System.out.println("Distancia de p al origen: " + distanciaP);
    }
    
    
}
