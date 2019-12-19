/*
 * @author Jesus Zabdiel Sanchez Chavez A1374964
 */
public class Punto {
    
    private int x;
    private int y;
    
    public void setX(int nuevoX){
        
        x = nuevoX;    
    }
    
    public void setY(int nuevoY){
        y = nuevoY;
    }
    
    public int getX (){
        return x;
    }
    
    public int getY (){
        return y;
    }
    
    public double calcularDistanciaAlOrigen(){
        return Math.sqrt((x*x)+(y*y));
    }
}
