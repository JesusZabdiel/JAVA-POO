
/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public abstract class Sensor {
    private String tipo;
    private int valor;
    
    public Sensor(String tipo, int valor){
        this.tipo = tipo;
        this.valor = valor;
        
    }
    
    public abstract double convertir();
    
    
    @Override
    public String toString(){
        return this.tipo + "("+ this.valor + ")";
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
        
}
