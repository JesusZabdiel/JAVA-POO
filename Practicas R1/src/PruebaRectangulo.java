/*
 * @author Jesus Zabdiel Sanchez Chavez
 */
public class PruebaRectangulo {
    
    public static void main (String[] args){
        
        Rectangulo a = new Rectangulo();
        a.setAncho(5);
        a.setAlto(3);
        
        Rectangulo b = new Rectangulo();
        b.setAncho(2);
        b.setAlto(7);
        
        //a.setAncho(-20);
        
        int anchoA =  a.getAncho();
        int altoA = a.getAlto();
        int areaA = a.calcularArea();
        
        int anchoB =  b.getAncho();
        int altoB = b.getAlto();
        int areaB = b.calcularArea();
        
        System.out.println("Rectangulo de " + anchoA + "x" + altoA);        
        System.out.println("Area del rectagulo a: " + areaA);
        
        System.out.println("Rectangulo de " + anchoB + "x" + altoB);        
        System.out.println("Area del rectagulo a: " + areaB);
        
    }
    
}
