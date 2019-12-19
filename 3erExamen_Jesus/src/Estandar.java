/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Estandar extends Vector{

    public Estandar(int x, int y) {
        super(x, y);
    }
    
    

    @Override
    public double getMagnitud() {
        double magnitud;
        magnitud = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return magnitud;
    }
    
    public void escalar(double factor){
        super.multiplicar(factor);
    }
    
    

    @Override
    public String getTipo() {
        if (Math.abs(this.x) > Math.abs(this.y)){
            return "Estándar-Horizontal";
        }else{
            return "Estándar-vertical";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + getTipo();
    }
    
    public void setX (int x){
        this.x = x;        
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
    
    
}
