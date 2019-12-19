/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public abstract class Vector {
    protected int x;
    protected int y;
    
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y +")";
    }
    
    public void multiplicar(double factor){
        this.x = (int)(this.x * factor);
        this.y = (int)(this.y * factor);        
    }
    
    public abstract double getMagnitud();
    
    public abstract String getTipo();

}
