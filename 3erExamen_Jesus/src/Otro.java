/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Otro extends Vector {

    public Otro(int x, int y) {
        super(x, y);
    }    


    @Override
    public double getMagnitud() {
        return (Math.abs(x) + Math.abs(y));
    }
    
    public void ampliar(double factor){
        super.multiplicar(factor);        
    }
    

    @Override
    public String getTipo() {
        if (Math.abs(this.x) > Math.abs(this.y)){
            return "Otro-horizontal";
        }else if(Math.abs(this.x) < Math.abs(this.y)){
            return "Otro-vertical";           
        }else{
            return "Otro-cuadrado";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + getTipo();
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;        
    }    
    
    
    
        
}
