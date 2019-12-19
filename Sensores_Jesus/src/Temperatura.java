
/**
 *
 * @author Jesus Zabdiel Sánchez Chávez A01374964
 */
public class Temperatura extends Sensor {
    
    private int limite;
    private boolean estadoNormal;
    
   public Temperatura(int limite, String tipo, int valor){
       super(tipo, valor);   
       this.limite = limite;
       if(this.getValor() <= this.limite){
           this.estadoNormal = true;           
       }else{
           this.estadoNormal = false;
       }
   }

    @Override
    public double convertir() {
        return ((this.getValor() - 32) * (5.0/9));
    }

    @Override
    public String toString() {
        return this.getTipo() + "(" + this.convertir() + ") °C";
    }
    
    public void reset(){
        this.setValor(0);
        
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public boolean isEstadoNormal(){
        return this.estadoNormal;
    }
    
}
